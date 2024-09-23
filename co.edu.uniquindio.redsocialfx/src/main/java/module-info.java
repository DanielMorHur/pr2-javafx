module co.edu.uniquindio.redsocialfx.clienteapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.redsocialfx.clienteapp to javafx.fxml;
    exports co.edu.uniquindio.redsocialfx.clienteapp;
}