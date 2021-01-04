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
            "Albaku", "Daniel B", "DupontC", "FluOr_", "Frédéric Le Mouël (FLM)",
            "Gaël LARGER", "Géraud", "Jojo6375", "jponge", "jz5",
            "lpetit", "Martial Maillot", "Mossroy", "nbuche", "Nolwenn",
            "Olivier", "testdffgfdgfgrejyth", "Théo C.", "vga", "Yarck");

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
