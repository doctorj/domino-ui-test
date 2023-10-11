package org.dominokit.samples;

import org.dominokit.domino.ui.elements.DivElement;
import org.dominokit.domino.ui.layout.AppLayout;
import org.dominokit.domino.ui.style.DominoCss;
import org.dominokit.domino.ui.utils.ElementsFactory;

import com.google.gwt.core.client.EntryPoint;

public class App implements EntryPoint, ElementsFactory, DominoCss {

    public void onModuleLoad() {
        var layout = AppLayout.create("Domino-ui starter");

        // layout.getContent().appendChild();

        body().appendChild(layout);
    }
}
