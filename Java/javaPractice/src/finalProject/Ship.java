package finalProject;

import java.util.HashSet;
import java.util.Set;

public enum Ship {
    FOURTH_DECKER, TRIPLE_DECKER_1, TRIPLE_DECKER_2,
    DOUBLE_DECKER_1, DOUBLE_DECKER_2, DOUBLE_DECKER_3,
    SINGLE_1, SINGLE_2, SINGLE_3, SINGLE_4;


    private Set<String> placement;

    Ship() {
        placement = new HashSet<>();
    }

    public Set<String> getPlacement() {
        return placement;
    }
}
