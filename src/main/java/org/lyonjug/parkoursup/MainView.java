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
			"Nicolaus Copernicus",
			"Galileo Galilei",
			"Johannes Kepler");

	public MainView() {
		var button = new Button("Tirer au sort");
		button.addClickListener(event -> grid.select(list.get(new Random().nextInt(list.size()))));
		add(button);

		grid.setItems(list);
		grid.addColumn(ValueProvider.identity());
		add(grid);
	}

}
