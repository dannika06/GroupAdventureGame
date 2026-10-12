/**
 * Shared command file.
 * Student A: add score command.
 * Student B: add map command.
 * Student C: add quest command.
 */
public class CommandProcessor {
 public static boolean process(String command,Player player,World world){
  if(command.equalsIgnoreCase("look")){
   Room r=player.getCurrentRoom();
   System.out.println("Location: "+r.getName());
   System.out.println(r.getDescription());
   System.out.println("Items: "+r.getItems());
   System.out.println("Exits: "+r.getExits().keySet());
   return true;
  }
  if(command.equalsIgnoreCase("inventory")){
   System.out.println(player.getInventory());
   return true;
  }
  if(command.equalsIgnoreCase("help")){
   System.out.println("look inventory help quit");
   return true;
  }
  // TODO: Students add commands HERE.
  if(command.equalsIgnoreCase("map")){
   Room currentRoom=player.getCurrentRoom();
   System.out.println("You are at: "+currentRoom.getName());
   if(currentRoom.getExits().isEmpty()){
    System.out.println("There are no visible exits.");
   }else{
    System.out.println("Exits:");
    for(String direction:currentRoom.getExits().keySet()){
     System.out.println("- "+direction+" -> "+currentRoom.getExits().get(direction));
    }
   }
   return true;
  }
  if(command.equalsIgnoreCase("score")){
    System.out.println("Score: " + player.getScore());
    return true;
  }
  return false;
 }
}
