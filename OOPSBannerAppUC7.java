public class OOPSBannerAppUC7 {

    // --- Part 2: Inner Class (Encapsulation) ---
    public static class CharacterPatternMap {
        private final Character character;
        private final String[] pattern;

        public CharacterPatternMap(Character character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public Character getCharacter() {
            return this.character;
        }

        public String[] getPatterns() {
            return this.pattern;
        }
    }

    // --- Part 3: Utility Static Methods ---

    public static CharacterPatternMap[] createCharacterPatternMaps() {
        CharacterPatternMap[] maps = new CharacterPatternMap[4];

        maps[0] = new CharacterPatternMap('O', new String[]{
            "  ***  ",
            " *   * ",
            "*     *",
            "*     *",
            "*     *",
            " *   * ",
            "  ***  "
        });

        maps[1] = new CharacterPatternMap('P', new String[]{
            "****** ",
            "*    * ",
            "*    * ",
            "****** ",
            "*     ",
            "*     ",
            "*     "
        });

        maps[2] = new CharacterPatternMap('S', new String[]{
            " ***** ",
            "*    ",
            "* ",
            " **** ",
            "     * ",
            "     * ",
            "***** "
        });

        maps[3] = new CharacterPatternMap(' ', new String[]{
            "       ",
            "       ",
            "       ",
            "       ",
            "       ",
            "       ",
            "       "
        });

        return maps;
    }

    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {
        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == Character.toUpperCase(ch)) {
                return map.getPatterns();
            }
        }

        return charMaps[3].getPatterns();
    }

    public static void printMessage(String message, CharacterPatternMap[] charMaps) {
    
        for (int row = 0; row < 7; row++) {
            for (char ch : message.toCharArray()) {
                String[] pattern = getCharacterPattern(ch, charMaps);
                System.out.print(pattern[row] + "  ");
            }
            System.out.println();
        }
    }

    // --- Part 4: Main Method ---
    public static void main(String[] args) {

        CharacterPatternMap[] charMaps = createCharacterPatternMaps();
        
        String message = "OOPS";
        
        System.out.println("Displaying Banner for: " + message + "\n");
        printMessage(message, charMaps);
    }
}