package org.lyonjug.parkoursup;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.function.ValueProvider;
import com.vaadin.flow.router.Route;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Route
public class MainView extends VerticalLayout {

	private final Grid<String> grid = new Grid<>();

	private final List<String> list = Arrays.asList(
			"@Jojo6375", "@Arcantos512", "@thofon", "@petitlaurent", "@indyHiTech",
			"@jibe77", "@warn_Off", "@remi_mrn", "@noredine69", "@skarboune",
			"@gVibrac", "@NoemiePham", "@Rodac84", "@FrancisCharpin", "@blskdan",
			"@ccheneson", "@Bilgetz1", "@sadraskol", "@thebignet", "@DavidCharlet",
			"@TimAufort", "@fabgrenier", "@toufik0117", "@guyon_jerome", "@romain_dequidt",
			"@eDenayrolles", "@nafresne", "@AnnKalamity", "@dogiaf", "@joanna_lacante",
			"@renarnaud", "@AurelienMino", "@adrienpessu", "@grenneville", "@TheBrousse",
			"@mackristof", "@Puppet_2501", "@sanlaville", "@mekquispass", "@maxime_vialette",
			"@GalletVictor", "@RiverJach", "@TFranconville", "@BonnefondVero", "@titimoby",
			"@cedric__chateau", "@k33g_org");

	public MainView() {
		var button = new Button("Tirer au sort");
		button.addClickListener(event -> grid.select(list.get(new Random().nextInt(list.size()))));
		add(button);

		grid.setItems(list);
		grid.addColumn(ValueProvider.identity());
		add(grid);
	}

}
