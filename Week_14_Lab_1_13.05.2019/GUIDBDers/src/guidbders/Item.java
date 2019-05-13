package guidbders;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acar
 */
 class Item
    {
        private int id;
        private String description;

        public Item(int id, String description)
        {
            this.id = id;
            this.description = description;
        }

        public int getId()
        {
            return id;
        }

        public String getDescription()
        {
            return description;
        }

        public String toString()
        {
            return description;
        }
    }
