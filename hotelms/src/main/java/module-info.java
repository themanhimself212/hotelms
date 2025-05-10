module hotelms {
    requires transitive javafx.controls;
    requires transitive javafx.fxml;
    requires transitive javafx.graphics;
    
    opens com.hotel to javafx.fxml;
    exports com.hotel;
}
