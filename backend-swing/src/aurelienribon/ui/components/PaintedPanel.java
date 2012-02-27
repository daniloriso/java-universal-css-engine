package aurelienribon.ui.components;

import aurelienribon.ui.css.DeclarationSet;
import aurelienribon.ui.css.DeclarationSetProcessor;
import aurelienribon.ui.css.Property;
import java.awt.*;
import javax.swing.JPanel;

/**
 * @author Aurelien Ribon | http://www.aurelienribon.com
 */
public class PaintedPanel extends JPanel {
	private Paint fill;

	public Paint getFill() {
		return fill;
	}

	public void setFill(Paint fill) {
		this.fill = fill;
		repaint();
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		Graphics2D gg = (Graphics2D) g.create();

		if (fill != null) {
			gg.setPaint(fill);
			gg.fillRect(0, 0, getWidth(), getHeight());
		}

		gg.dispose();
	}

	// -------------------------------------------------------------------------
	// StyleProcessor
	// -------------------------------------------------------------------------

	public static class Processor implements DeclarationSetProcessor<PaintedPanel> {
		@Override
		public void process(PaintedPanel target, DeclarationSet ds) {
			Property p;

			p = AruiProperties.fill;
			if (ds.contains(p)) target.setFill(ds.getValue(p, Paint.class));
		}
	}
}
