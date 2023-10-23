package org.dominokit.samples;

import org.dominokit.domino.ui.button.Button;
import org.dominokit.domino.ui.elements.DivElement;
import org.dominokit.domino.ui.layout.AppLayout;
import org.dominokit.domino.ui.menu.Menu;
import org.dominokit.domino.ui.menu.MenuItem;
import org.dominokit.domino.ui.menu.direction.DropDirection;
import org.dominokit.domino.ui.style.DominoCss;
import org.dominokit.domino.ui.utils.ElementsFactory;

import com.google.gwt.core.client.EntryPoint;

public class App implements EntryPoint, ElementsFactory, DominoCss {

    public void onModuleLoad() {
        var layout = AppLayout.create("Domino-ui starter");

		Button b1 = Button.create("Button")
						.setDropMenu(Menu.<String>create()
										.setDropDirection(DropDirection.BOTTOM_RIGHT)
										.appendChild(MenuItem.create("Item 1"))
										.appendChild(MenuItem.create("Item 2"))
						)
						;
		DivElement d1 = div().appendChild(b1);

		DivElement p = div();
		p.appendChild(div().addCss(dui_flex, dui_gap_1, dui_m_b_10)
							.appendChild(Button.create("Remove")
											.addClickListener(evt -> d1.remove())
							)
							.appendChild(Button.create("Add")
											.addClickListener(evt -> layout.getContent().appendChild(d1))
							)
		);

		layout.getContent().appendChild(p);
		layout.getContent().appendChild(d1);

        body().appendChild(layout);
    }
}
