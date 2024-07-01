import java.util.Scanner;

public class NokiaMenu {
   public static void main (String []args){

	Scanner input = new Scanner (System.in);

	System.out.println("Welcome to your NOKIA Phone!!!");
	
	String menuList = """
			1. Phone Book
			2. Messages
			3. Chat
			4. Call Register
			5. Tones
			6. Settings
			7. Call Divert
			8. Games
			9. Calculator
			10. Reminders
			11. Clock
			12. Profiles
			13. SIM Services
			""";

	System.out.print(menuList);

	System.out.println();
	System.out.println("Select an option to get started:");
	int options = input.nextInt();

	switch (options){

	case 1: System.out.println("Phonebook");
		System.out.println("Select an option to proceed: ");
		System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n", "1. Search", "2. Service Nos", "3. Add name", "4. Erase", "5. Edit", "6. Assign tone", "7. Send b'card", "8. Options", "9. Speed dials", "Voice tags");
		int phonebook = input.nextInt();
		  switch(phonebook){
			case 1: System.out.println("Search"); break;
			case 2: System.out.println("Service Nos"); break;
			case 3: System.out.println("Add name"); break;
			case 4: System.out.println("Erase"); break;
			case 5: System.out.println("Edit"); break;
			case 6: System.out.println("Assign tone"); break;
			case 7: System.out.println("Send B'card"); break;
			case 8: System.out.println("Options: Select an option below");
				System.out.printf("%s%n%s%n", "1. Type of view", "2. Memory status");
				int optionsList = input.nextInt();
				   switch (optionsList){
 					case 1: System.out.println("Type of view"); break;
					case 2: System.out.println("Memory status"); break;
					default: System.out.println("Inavlid input!!!");
				   } break;
			case 9: System.out.println("Speed dials"); break;
			case 10: System.out.println("Voice tags"); break;
			default: System.out.println("Invalid input!!!");
		  }
	break;
	case 2: System.out.println("Messages");
		System.out.println("Select an option to proceed: ");
		System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n", "1. Write Messages", "2. Inbox", "3. Outbox", "4. Picture Messages", "5. Templates", "6. Smileys", "7. Message settings", "8. Info services", "9. Voice mailbox number", "10. Service command editor");
		int messages = input.nextInt();
		   switch(messages){
			case 1: System.out.println("Write messages"); break;
			case 2: System.out.println("Inbox"); break;
			case 3: System.out.println("Outbox"); break;
			case 4: System.out.println("Picture messages"); break;
			case 5: System.out.println("Templates"); break;
			case 6: System.out.println("Smileys"); break;
			case 7: System.out.println("Messages Settings");
			    	System.out.println("select: ");
				System.out.printf("%s%n%s%n", "1. Set", "2. Common");
				int messageSettings = input.nextInt();
					switch (messageSettings){
					   case 1: System.out.println("Set");
						   System.out.printf("%s%n%s%n%s%n%s%n", "Select: ", "1. Message centre number", "2. Message sent as", "3. Message validity");
						   int messageSet = input.nextInt();
						   switch (messageSet){
							case 1: System.out.println(" Message centre number"); break;
							case 2: System.out.println("Message sent as"); break;
							case 3: System.out.println("Message validity"); break;
							default: System.out.println("Invalid input !!!");
						 break;
						   }
					   case 2: System.out.println("Common");
						   System.out.printf("%s%n%s%n%s%n%s%n", "Select: ", "1. Delivery Reports", "2. Reply via same centre", "3. Character support");
						   int messageCommon = input.nextInt();
						   switch (messageCommon){
							case 1: System.out.println("Delivery Reports"); break;
							case 2: System.out.println("Reply via same centre"); break;
							case 3: System.out.println("Character support"); break;
							default: System.out.println("Invalid input !!!"); break;
						   }
					   default: System.out.println("Invalid Input!!!");
					    break;
					}
				break;
			case 8: System.out.println("Info service"); break;
			case 9: System.out.println("Voice mailbox number"); break;
			case 10: System.out.println("Service command editor"); break;
			default: System.out.println("Invalid Input!!!!");
		   } break;

	case 3: System.out.println("Chat"); break;

	case 4: System.out.println("Call register");
		System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n",  "Select: ", "1. Missed calls", "2. Received calls", "3. Dialed numbers", "4. Erase recent call lists", "5. Show call duration", "6. Show call costs", "7. Call costs settings", "8. Prepaid credit");
		int callRegister = input.nextInt();
			switch(callRegister){
			    	case 1: System.out.println("Missed calls"); break;
			   	case 2: System.out.println("Received calls"); break;
			   	case 3: System.out.println("Dialed numbers"); break;
				case 4: System.out.println("Erase recent call list"); break;
				case 5: System.out.println("Show call duration");
					System.out.printf("%s%n%s%n%s%n%s%n%s%n",  "Select: ", "1. Last call duration", "2. All calls' duration", "3. Received calls' duration", "4. Dialed calls' duration", "5. Clear timers");
					int callDuration = input.nextInt();
				
					switch (callDuration){
						case 1: System.out.println("Last call duration"); break;
						case 2: System.out.println("All calls' duration"); break;
						case 3: System.out.println("Received calls' duration"); break;
						case 4: System.out.println("Dialed calls' duration"); break;
						case 5: System.out.println("Clear timers"); break;
						default: System.out.println("Invalid input!!!"); break;
					}
				break;
				case 6: System.out.println("Show call costs"); 
					System.out.printf("%s%n%s%n%s%n%s%n",  "Select: ", "1. Last call cost", "2. All calls' cost", "3. Clear counters");
					int callCosts = input.nextInt();
				
					switch (callCosts){
						case 1: System.out.println("Last call cost"); break;
						case 2: System.out.println("All calls' cost"); break;
						case 3: System.out.println("Clear counters"); break;
						default: System.out.println("Invalid input!!!"); break;
					}
				break;
				case 7: System.out.println("Call cost settings"); 
					System.out.printf("%s%n%s%n%s%n",  "Select: ", "1. Call cost limit", "2. Show costs in");
					int callCostSetting = input.nextInt();
				
					switch (callCostSetting){
						case 1: System.out.println("Call cost limit"); break;
						case 2: System.out.println("Show costs in"); break;
						default: System.out.println("Invalid input!!!"); break;
					}
					break;
				case 8: System.out.println("Prepaid credit"); break;
				default: System.out.println("Invalid input!!1");
			}
			break;
	case 5: System.out.println("Tones");
		System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n", "1. Ringing tone", "2. Ringing volume", "3. Incoming call alert", "4. Composer", "5. Message alert tone", "6. Keypad tones", "7. Warning and game tones", "8. Vibrating alert", "9. Screen saver");
		int tones = input.nextInt();

		switch (tones){
			case 1: System.out.println("Ringing tones"); break;
			case 2: System.out.println("Ringing volume"); break;
			case 3: System.out.println("Incoming call alert"); break;
			case 4: System.out.println("Composer"); break;
			case 5: System.out.println("Message alert tones"); break;
			case 6: System.out.println("Keypad tones"); break;
			case 7: System.out.println("Warning and gaming tones"); break;
			case 8: System.out.println("Vibrating alert"); break;
			case 9: System.out.println("Screen saver"); break;
			default: System.out.println("Invalid input!!1");
		}
	break;

	case 6: System.out.println("Settings"); 
		System.out.printf("%s%n%s%n%s%n%s%n%s%n", "Select: ", "1. Call settings", "2. Phone settings", "3. Security settings", "4. Restore factory settings");
		int settings = input.nextInt();

		switch(settings) {
			case 1: System.out.println("Call settings"); 
				System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n", "Select: ", "1. Automatic redial", "2. Speed dialing", "3. Call waiting options", "4. Own number sending", "5. Phone line in use", "6. Automatic answer");
				int callSettings = input.nextInt();

				switch (callSettings) {
					case 1: System.out.println("Automatic redial"); break;
					case 2: System.out.println("Speed dialing"); break;
					case 3: System.out.println("Call waiting options"); break;
					case 4: System.out.println("Own number sending"); break;
					case 5: System.out.println("Phone line in use"); break;
					case 6: System.out.println("Automatic answer"); break;
					default: System.out.println("Invalid input!!!");
				}
			break;
			case 2: System.out.println("Phone settings");
				System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n", "Select: ", "1. Language", "2. Cell info display", "3. Welcome note", "4. Network Selection", "5. Lights", "6. Confirm SIM service actions");
				int phoneSettings = input.nextInt();

				switch (phoneSettings) {
					case 1: System.out.println("Language"); break;
					case 2: System.out.println("Cell info display"); break;
					case 3: System.out.println("Welcome note"); break;
					case 4: System.out.println("Network Selection"); break;
					case 5: System.out.println("Lights"); break;
					case 6: System.out.println("Confirm SIM service actions"); break;
					default: System.out.println("Invalid input!!!");
				}
			break;
			case 3: System.out.println("Security settings");
				System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n", "Select: ", "1. PIN Code request", "2. Cell barring settings", "3. Fixed dialing", "4. Closed user group", "5. Phone security", "6. Change access codes");
				int securitySettings = input.nextInt();

				switch (securitySettings) {
					case 1: System.out.println("PIN Code request"); break;
					case 2: System.out.println("Cell barring settings"); break;
					case 3: System.out.println("Fixed dialing"); break;
					case 4: System.out.println("Closed user group"); break;
					case 5: System.out.println("Phone security"); break;
					case 6: System.out.println("Change access codes"); break;
					default: System.out.println("Invalid input!!!");
				}
			break;
			case 4: System.out.println("Restore factory settings"); break;
		}
	break;

	case 7: System.out.println("Call divert"); break;
	case 8: System.out.println("Games"); break;
	case 9: System.out.println("Calculator"); break;
	case 10: System.out.println("Reminders"); break;
	case 11: System.out.println("Clock");
		 System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n", "Select: ", "1. Alarm clock", "2. Clock settings", "3. Date settings", "4. Stopwatch", "5. Countdown timer", "6. Auto update of date and time");
				int clock = input.nextInt();

				switch (clock) {
					case 1: System.out.println("Alarm clock"); break;
					case 2: System.out.println("Clock settings"); break;
					case 3: System.out.println("Date settings"); break;
					case 4: System.out.println("Stopwatch"); break;
					case 5: System.out.println("Countdown timer"); break;
					case 6: System.out.println("Auto update of date and time"); break;
					default: System.out.println("Invalid input!!!");
				}
			break;

	case 12: System.out.println("Profiles"); break;
	case 13: System.out.println("SIM services"); break;
	default: System.out.println("Invalid input!!!"); break;
	}

	System.out.print("Thank you!!!");

	
   }
}