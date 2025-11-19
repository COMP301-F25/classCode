package edu.unc.comp301.mvc;

import javafx.scene.Parent;

public interface FXComponent extends Observer{
    Parent render();
}
