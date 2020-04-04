package org.lyonjug.parkoursup;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.function.ValueProvider;
import com.vaadin.flow.router.Route;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Route
public class MainView extends VerticalLayout {

    private final List<String> list = Arrays.asList(
            "@warn_Off", "@magneval", "@clpetot", "@t_marmillot", "@Kheon669",
            "@AymaneHafiane", "@glgaws", "@OlivierPerez", "@jokeur76", "@esfe17",
            "@thierryparet", "@thebignet", "@imNollo", "@maxime_vialette", "@guilldavid",
            "@luc_chevallier", "@BucheNicolas", "@plugandtweet", "@MriniYacine", "@SamadouSare",
            "@tttataww", "@coralie_noy", "@cedric__chateau", "@fnicollet", "@GuiF007",
            "@foxoyote", "@noredine69", "@blskdan", "@Bilgetz1", "@GalletVictor",
            "@fred532", "@maillotm", "@Jojo6375", "@LittleFr0g", "@arisoft31",
            "@petitlaurent");

    public MainView() {
        setHeightFull();

        var button = new Button("Tirer au sort");
        button.addClickListener(event -> {
            var dialog = new Dialog();
            dialog.add(list.get(new Random().nextInt(list.size())));
            dialog.open();
        });
        add(button);

        var grid = new Grid<String>();
        grid.setItems(list);
        grid.setHeightFull();
        grid.addColumn(ValueProvider.identity());
        add(grid);
    }

}
