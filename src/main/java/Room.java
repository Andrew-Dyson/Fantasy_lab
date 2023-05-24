public class Room {

    private int sequenceNumber;

    private String name;

    private String treasure;

    private Character character1InRoom;
    private Character character2InRoom;

    public Room(String name, int sequenceNumber, String treasure, Character character1InRoom, Character character2InRoom){
        this.name = name;
        this.sequenceNumber = sequenceNumber;
        this.treasure = treasure;
        this.character1InRoom = character1InRoom;
        this.character2InRoom = character2InRoom;
    }

    public int getSequenceNumber() {
        return sequenceNumber;
    }

    public String getName() {
        return name;
    }

    public String getTreasure() {
        return treasure;
    }


    public String addCharacterToRoom(Character characterToAdd){
        if (character1InRoom == null){
            character1InRoom = characterToAdd;
            character1InRoom.setShieldToTrue();
            return characterToAdd.getName() + " has entered " + this.name;
        }
        else{character2InRoom = characterToAdd;
            return character2InRoom.useWeaponOrSpell(character1InRoom);
        }
    }
}
