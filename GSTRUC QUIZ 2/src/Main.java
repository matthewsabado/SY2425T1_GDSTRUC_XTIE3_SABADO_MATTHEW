Player player1 = new Player(123, "Ichan", 1);
Player player2 = new Player(121, "Gio", 1);
Player player3 = new Player(124, "Uly", 1);

/* Array List */

        ArrayList<Player> playerList = new ArrayList<Player>();

        playerList.add(player1);
        playerList.add(player2);
        playerList.add(player3);

        for (int i = 0; i < playerList.size(); i++)
        {
            System.out.println(playerList.get(i));
        }

        playerList.add(2, new Player(123, "Yap" , 1));

        System.out.println("\nAfter insertion");
        for (int i = 0; i < playerList.size(); i++)
        {
            System.out.println(playerList.get(i));
        }

        System.out.println("is Gio removed? " + playerList.remove(new Player(121, "Gio", 1) ));

        System.out.println("\nAfter deletion");
        for (int i = 0; i < playerList.size(); i++)
        {
            System.out.println(playerList.get(i));
        }

        System.out.println("\nis Gio in the list? " + playerList.contains(new Player(121, "Gio", 1)));

        System.out.println("\nwhat is the index of Gio? " + playerList.indexOf(new Player(121, "Gio", 1)));
