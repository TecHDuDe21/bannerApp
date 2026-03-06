class CharacterPatternMap {
    Character character;
    String[] pattern;

    // Constructor
    public CharacterPatternMap(Character character, String[] pattern) {
        this.character = character;
        this.pattern = pattern;
    }

    // Getters
    public Character getCharacter() {
        return character;
    }

    public String[] getPattern() {
        return pattern;
    }
}

public class OOPSbanner {

    // 2. Create method to initialize the array of CharacterPatternMap objects
    public static CharacterPatternMap[] createCharacterPatternMaps() {
        CharacterPatternMap[] charMaps = new CharacterPatternMap[4];
        
        String[] oPattern = {
                        "   ***   ",
                        " **   ** ",
                        "**     **",
                        "**     **",
                        "**     **",
                        " **   ** ",
                        "   ***   "
        };
        
        String[] pPattern = {
                        "*******  ",
                        "**    ** ",
                        "**     **",
                        "**    ** ",
                        "*******  ",
                        "**       ",
                        "**       "
        };
        
        String[] sPattern = {
                        "  *****  ",
                        " **   ** ",
                        "**       ",
                        "  *****  ",
                        "      ** ",
                        " **   ** ",
                        "  *****  "
        };

        // Adding a space pattern to create gaps between our letters
        String[] spacePattern = {
            " ",
            " ",
            " ",
            " ",
            " ",
            " ",
            " "
        };

        // Populate the array
        charMaps[0] = new CharacterPatternMap('O', oPattern);
        charMaps[1] = new CharacterPatternMap('P', pPattern);
        charMaps[2] = new CharacterPatternMap('S', sPattern);
        charMaps[3] = new CharacterPatternMap(' ', spacePattern);

        return charMaps;
    }

    // 3. Implement getCharacterPattern to retrieve the pattern for a given character
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {
        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }
        // Fallback in case a character isn't found
        return new String[]{"", "", "", "", "", "", ""}; 
    }

    // 4. Use printMessage to render the banner
    public static void printMessage(String message, CharacterPatternMap[] charMaps) {
        // Loop through each of the 7 lines vertically
        for (int i = 0; i < 7; i++) {
            // Loop through each character in the message horizontally
            for (int j = 0; j < message.length(); j++) {
                String[] pattern = getCharacterPattern(message.charAt(j), charMaps);
                System.out.print(pattern[i]);
            }
            System.out.println(); // Move to the next line after finishing the row
        }
    }

    public static void main(String[] args) {
        CharacterPatternMap[] maps = createCharacterPatternMaps();
        
        // Pass the string with spaces so the spacePattern is utilized
        printMessage("O O P S", maps); 
    }
}