package data.databases;

import data.dataobjects.Enemy;

import java.util.ArrayList;
import java.util.List;

public class EnemyDatabase {

    private static EnemyDatabase enemyDatabase;

    private List<Enemy> enemies = new ArrayList<>();

    private EnemyDatabase() {
        addEnemies();
    }

    private void addEnemies() {
        enemies.add(new Enemy("Cow", 25, 5, 1.6, 1, 0, 0, 1, 1, 1, 4, 110, 0, 0, 110, 1, "Air", 90, 55, 45, 65));
        enemies.add(new Enemy("Chicken", 50, 24.9, 8.2, 4, 0, 0, 1, 1, 1, 4, 110, 0, 0, 110, 1, "Fire", 90, 55, 45, 65));
        enemies.add(new Enemy("Duck", 50, 24.9, 8.2, 4, 0, 0, 1, 0, 0, 4, 110, 0, 0, 110, 1, "Earth", 90, 55, 45, 65));
        enemies.add(new Enemy("Rat", 50, 24.9, 8.2, 4, 0, 0, 1, 0, 0, 4, 110, 0, 0, 110, 1, "Earth", 90, 55, 45, 65));
        enemies.add(new Enemy("Living rock brawler", 60, 24.9, 9.2, 1, 0, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, "Crush", 90, 65, 55, 45));
        enemies.add(new Enemy("Jonny the beard", 100, 37.3, 12.3, 4, 0, 0, 1, 0, 0, 4, 110, 0, 0, 110, 1, "Fire", 90, 55, 45, 65));
        enemies.add(new Enemy("Bandit", 100, 0, 0, 72, 0, 0, 5, 0, 0, 4, 150, 0, 0, 0, 5, "Crush", 90, 55, 45, 65));
        enemies.add(new Enemy("Shadow", 100, 3.7, 1.2, 272, 0, 0, 68, 0, 0, 4, 1409, 0, 0, 1409, 68, "Air", 90, 55, 45, 65));
        enemies.add(new Enemy("Shadow (Plague's End)", 100, 220.3, 72.6, 1008, 0, 0, 70, 0, 0, 4, 1694, 0, 0, 1486, 70, "Fire", 90, 55, 45, 65));
        enemies.add(new Enemy("The Map", 100, 24.9, 8.2, 8, 0, 0, 2, 0, 0, 4, 120, 0, 0, 120, 2, "Water", 90, 55, 45, 65));
        enemies.add(new Enemy("Zombie rat", 100, 24.9, 8.2, 8, 0, 0, 2, 0, 0, 4, 120, 0, 0, 120, 2, "Water", 90, 55, 45, 65));
        enemies.add(new Enemy("Brokeface", 120, 12.7, 4.1, 12, 0, 0, 2, 1, 1, 6, 12, 0, 0, 0, 5, "Crush", 90, 55, 45, 65));
        enemies.add(new Enemy("Choleric imp", 200, 0, 0, 16, 0, 0, 4, 0, 0, 4, 140, 0, 0, 140, 4, "Water", 90, 55, 45, 65));
        enemies.add(new Enemy("Bandit king", 200, 0, 0, 72, 0, 0, 5, 0, 0, 4, 150, 0, 0, 0, 5, "Crush", 90, 55, 45, 65));
        enemies.add(new Enemy("Goblin", 200, 25.8, 8.5, 24, 0, 0, 4, 0, 0, 6, 140, 0, 0, 140, 4, "Fire", 90, 55, 45, 65));
        enemies.add(new Enemy("Goat", 250, 26.7, 8.8, 20, 0, 0, 5, 0, 0, 4, 150, 0, 0, 150, 5, "Air", 90, 55, 45, 65));
        enemies.add(new Enemy("Wight ranger", 250, 26.7, 8.8, 0, 27, 0, 0, 5, 0, 6, 0, 150, 0, 150, 5, "Slash", 90, 65, 55, 45));
        enemies.add(new Enemy("Giant rat", 250, 26.7, 8.8, 20, 0, 0, 5, 0, 0, 4, 150, 0, 0, 150, 5, "Earth", 90, 55, 45, 65));
        enemies.add(new Enemy("Chompy bird", 300, 62.2, 20.5, 6, 8, 0, 1, 2, 0, 4, 15, 120, 0, 110, 1, "Arrows", 90, 55, 45, 65));
        enemies.add(new Enemy("Monkey", 300, 27.6, 9.1, 24, 0, 0, 6, 0, 0, 4, 160, 0, 0, 160, 6, "Earth", 90, 55, 45, 65));
        enemies.add(new Enemy("Wight", 350, 26.7, 8.8, 25, 0, 0, 5, 0, 0, 5, 150, 0, 0, 150, 5, "Air", 90, 55, 45, 65));
        enemies.add(new Enemy("Wight footsoldier", 375, 26.7, 8.8, 12, 0, 0, 5, 0, 0, 3, 150, 0, 0, 150, 5, "Fire", 90, 55, 45, 65));
        enemies.add(new Enemy("Skulls mercenary", 400, 0, 0, 14, 0, 0, 1, 0, 0, 4, 110, 0, 0, 110, 1, "None", 0, 60, 60, 60));
        enemies.add(new Enemy("Highwayman", 400, 29.7, 9.8, 32, 0, 0, 8, 0, 0, 4, 181, 0, 0, 181, 8, "Water", 90, 55, 45, 65));
        enemies.add(new Enemy("Zombie", 450, 30.9, 10.1, 36, 0, 0, 9, 0, 0, 4, 191, 0, 0, 191, 9, "Fire", 90, 55, 45, 65));
        enemies.add(new Enemy("Ghost", 450, 30.9, 10.1, 36, 0, 0, 9, 0, 0, 4, 191, 0, 0, 191, 9, "Air", 90, 55, 45, 65));
        enemies.add(new Enemy("Skeleton", 450, 30.9, 10.1, 36, 0, 0, 9, 0, 0, 4, 191, 0, 0, 191, 9, "Earth", 90, 55, 45, 65));
        enemies.add(new Enemy("Sir Leye", 500, 40, 13.2, 10, 0, 0, 5, 0, 0, 5, 150, 0, 0, 110, 5, "Fire", 90, 55, 45, 65));
        enemies.add(new Enemy("Apep", 500, 0, 0, 72, 0, 0, 5, 0, 0, 4, 150, 0, 0, 150, 5, "Crush", 90, 55, 45, 65));
        enemies.add(new Enemy("Heru", 500, 0, 0, 91, 0, 0, 5, 0, 0, 5, 150, 0, 0, 150, 5, "Crush", 90, 55, 45, 65));
        enemies.add(new Enemy("Bat", 500, 32.1, 10.5, 0, 0, 40, 0, 0, 10, 4, 0, 0, 202, 202, 10, "Bolts", 90, 45, 65, 55));
        enemies.add(new Enemy("Tower Archer (north)", 500, 32.1, 10.5, 0, 40, 0, 0, 10, 0, 4, 0, 202, 0, 202, 10, "Stab", 90, 65, 55, 45));
        enemies.add(new Enemy("Kebbit", 500, 32.1, 10.5, 40, 0, 0, 10, 0, 0, 4, 202, 0, 0, 202, 10, "Ait", 90, 55, 45, 65));
        enemies.add(new Enemy("Monk of Zamorak", 850, 39.6, 13, 0, 0, 68, 0, 0, 17, 4, 0, 0, 280, 280, 17, "Arrows", 90, 55, 45, 65));
        enemies.add(new Enemy("Moss giant (Glarial's Tomb)", 1000, 62.8, 20.7, 132, 0, 176, 33, 0, 44, 4, 502, 0, 710, 710, 44, "Arrows", 90, 45, 65, 55));
        enemies.add(new Enemy("Human werewolf", 1000, 44.4, 14.6, 100, 0, 0, 20, 0, 0, 5, 316, 0, 0, 316, 20, "Fire", 90, 55, 45, 65));
        enemies.add(new Enemy("Tower Archer (east)", 1000, 44.4, 14.6, 0, 80, 0, 0, 20, 0, 4, 0, 316, 0, 316, 20, "Stab", 90, 65, 55, 45));
        enemies.add(new Enemy("Outlaw", 1150, 50.4, 16.6, 92, 0, 0, 23, 0, 0, 4, 354, 0, 0, 354, 23, "Fire", 90, 55, 45, 65));
        enemies.add(new Enemy("Black unicorn", 1200, 51.9, 17.1, 0, 0, 96, 0, 0, 24, 4, 0, 0, 368, 368, 24, "Arrows", 90, 45, 65, 55));
        enemies.add(new Enemy("Mourner (Ardougne)", 1200, 51.9, 17.1, 96, 0, 0, 24, 0, 0, 4, 368, 0, 0, 268, 24, "Fire", 90, 55, 45, 65));
        enemies.add(new Enemy("Cerberus", 1200, 51.9, 17.1, 96, 0, 0, 24, 0, 0, 4, 368, 0, 0, 368, 24, "Fire", 90, 55, 45, 65));
        enemies.add(new Enemy("Experiment", 1250, 54, 17.8, 100, 0, 0, 25, 0, 0, 4, 381, 0, 0, 381, 25, "Fire", 90, 55, 45, 65));
        enemies.add(new Enemy("Dwarf gang member", 1250, 54, 17.8, 100, 0, 0, 25, 0, 0, 5, 381, 0, 0, 381, 25, "Fire", 90, 55, 45, 65));
        enemies.add(new Enemy("Guard (DttD)", 1300, 56.1, 18.5, 104, 0, 0, 26, 0, 0, 4, 395, 0, 0, 395, 26, "Fire", 90, 55, 45, 65));
        enemies.add(new Enemy("Golem Guard", 1350, 58.5, 19.3, 108, 0, 0, 27, 0, 0, 4, 409, 0, 0, 409, 27, "Air", 90, 55, 45, 65));
        enemies.add(new Enemy("King Roald", 1400, 0, 0, 112, 0, 0, 28, 0, 0, 4, 424, 0, 0, 424, 28, "Fire", 90, 55, 45, 65));
        enemies.add(new Enemy("Melzar the Mad", 1400, 61.5, 20.2, 112, 0, 112, 28, 0, 28, 4, 424, 0, 424, 424, 28, "Nothing", 0, 20, 10, 40));
        enemies.add(new Enemy("Jailer", 1400, 61.5, 20.2, 168, 0, 0, 28, 0, 0, 6, 424, 0, 0, 424, 28, "Earth", 90, 55, 45, 65));
        enemies.add(new Enemy("Tower Archer (south)", 1500, 66.9, 22, 0, 120, 0, 0, 30, 0, 4, 0, 454, 0, 454, 30, "Stab", 90, 65, 55, 45));
        enemies.add(new Enemy("Revenant imp", 1500, 64.2, 21.1, 225, 225, 225, 10, 10, 10, 5, 202, 202, 202, 202, 10, "Nothing", 0, 40, 40, 40));
        enemies.add(new Enemy("Sigmund (DttD)", 1500, 66.9, 22, 90, 120, 0, 22, 30, 0, 4, 225, 454, 0, 454, 30, "Slash", 90, 65, 55, 45));
        enemies.add(new Enemy("Skeleton looter", 1500, 66.9, 22, 120, 0, 0, 30, 0, 0, 4, 454, 0, 0, 454, 30, "Air", 90, 55, 45, 65));
        enemies.add(new Enemy("Tumeken's shadow 1", 1500, 66.9, 22, 120, 0, 0, 30, 0, 0, 4, 454, 0, 0, 454, 30, "Nothing", 0, 40, 40, 40));
        enemies.add(new Enemy("Gnome troop", 1600, 72.6, 23.9, 0, 128, 0, 0, 32, 0, 4, 0, 486, 0, 486, 32, "Slash", 90, 65, 55, 45));
        enemies.add(new Enemy("Air elemental", 1600, 72.6, 23.9, 0, 192, 0, 0, 32, 0, 4, 0, 486, 0, 486, 32, "Slash", 90, 65, 55, 45));
        enemies.add(new Enemy("Water elemental", 1600, 72.6, 23.9, 0, 192, 0, 0, 32, 0, 4, 0, 486, 0, 486, 32, "Slash", 90, 65, 55, 45));
        enemies.add(new Enemy("Earth elemental", 1600, 72.6, 23.9, 192, 0, 0, 32, 0, 0, 6, 486, 0, 0, 486, 32, "Water", 90, 55, 45, 65));
        enemies.add(new Enemy("Fire elemental", 1600, 72.6, 23.9, 0, 0, 192, 0, 0, 32, 4, 0, 0, 486, 486, 32, "Arrows", 90, 45, 65, 55));
        enemies.add(new Enemy("Disciple of Iban", 1600, 72.6, 23.9, 0, 0, 128, 0, 0, 32, 4, 0, 0, 486, 486, 32, "Arrows", 90, 45, 65, 55));
        enemies.add(new Enemy("Sir Mordred", 1700, 59.4, 19.6, 68, 0, 0, 17, 0, 0, 4, 280, 0, 0, 280, 17, "Water", 90, 55, 45, 65));
        enemies.add(new Enemy("Tumeken's shadow 2", 1750, 83.1, 27.4, 140, 0, 0, 35, 0, 0, 4, 536, 0, 0, 536, 35, "Nothing", 0, 40, 40, 40));
        enemies.add(new Enemy("Revenant goblin", 1800, 71.4, 23.5, 270, 270, 270, 12, 12, 12, 5, 223, 223, 223, 223, 12, "Nothing", 0, 40, 40, 40));
        enemies.add(new Enemy("Khazard warlord", 1900, 95.4, 31.4, 152, 0, 0, 38, 0, 0, 4, 590, 0, 0, 590, 38, "Air", 90, 55, 45, 65));
        enemies.add(new Enemy("Cave crawler", 1900, 95.4, 31.4, 0, 152, 0, 0, 38, 0, 4, 0, 590, 0, 590, 38, "Slash", 90, 65, 55, 45));
        enemies.add(new Enemy("Khazard warlord", 1900, 95.4, 31.4, 152, 0, 0, 38, 0, 0, 4, 590, 0, 0, 590, 38, "Air", 90, 55, 45, 65));
        enemies.add(new Enemy("Mogre", 1950, 99.3, 32.7, 156, 0, 0, 39, 0, 0, 4, 609, 0, 0, 609, 39, "Air", 90, 55, 45, 65));
        enemies.add(new Enemy("Witch's experiment 1", 2000, 89.2, 29.4, 172, 0, 0, 12, 0, 0, 4, 223, 0, 0, 223, 12, "Water", 90, 55, 45, 65));
        enemies.add(new Enemy("Tower Archer (west)", 2000, 103.8, 34.2, 0, 160, 0, 0, 40, 0, 4, 0, 628, 0, 628, 40, "Stab", 90, 65, 55, 45));
        enemies.add(new Enemy("Apmeken", 2000, 103.8, 34.2, 288, 0, 384, 30, 0, 40, 4, 454, 0, 628, 628, 40, "Bolts", 90, 45, 65, 55));
        enemies.add(new Enemy("Possessed Priest", 2000, 103.8, 34.2, 120, 160, 160, 30, 40, 40, 4, 454, 628, 628, 628, 40, "Slash", 90, 65, 55, 45));
        enemies.add(new Enemy("The Draugen", 2000, 103.8, 34.2, 240, 0, 0, 40, 0, 0, 6, 628, 0, 0, 628, 40, "Fire", 90, 55, 45, 65));
        enemies.add(new Enemy("Lesser demon", 2000, 103.8, 34.2, 120, 0, 160, 30, 0, 40, 4, 454, 0, 628, 628, 40, "Arrows", 90, 45, 65, 55));
        enemies.add(new Enemy("Tumeken's shadow 3", 2000, 103.8, 34.2, 160, 0, 0, 40, 0, 0, 4, 628, 0, 0, 628, 40, "Nothing", 0, 40, 40, 40));
        enemies.add(new Enemy("Unicow", 2050, 108.9, 35.9, 0, 0, 164, 0, 0, 41, 4, 0, 0, 648, 648, 41, "Bolts", 90, 45, 65, 55));
        enemies.add(new Enemy("Tyras guard", 2100, 114.6, 27.8, 168, 0, 0, 42, 0, 0, 4, 668, 0, 0, 668, 42, "Earth", 90, 55, 45, 65));
        enemies.add(new Enemy("Vampyre Juvinate (In Aid of the Myreque A)", 2100, 0, 0, 0, 168, 0, 0, 42, 0, 4, 0, 668, 0, 668, 42, "Stab", 90, 65, 55, 45));
        enemies.add(new Enemy("Broodoo victim", 2150, 119.7, 39.5, 172, 0, 0, 43, 0, 0, 4, 689, 0, 0, 689, 43, "Fire", 90, 55, 45, 65));
        enemies.add(new Enemy("Vampyre Juvinate (In Aid of the Myreque B)", 2250, 0, 0, 0, 180, 0, 0, 45, 0, 4, 0, 732, 0, 732, 45, "Stab", 90, 65, 55, 45));
        enemies.add(new Enemy("Swordchick", 2250, 132, 43.5, 180, 0, 0, 45, 0, 0, 4, 732, 0, 0, 732, 45, "Water", 90, 55, 45, 65));
        enemies.add(new Enemy("Tumeken's shadow 4", 2250, 132, 43.5, 180, 0, 0, 45, 0, 0, 4, 732, 0, 0, 732, 45, "Nothing", 0, 40, 40, 40));
        enemies.add(new Enemy("Shadow warrior", 2350, 145.2, 47.9, 188, 0, 0, 47, 0, 0, 4, 778, 0, 0, 778, 47, "Air", 90, 55, 45, 65));
        enemies.add(new Enemy("Vampyre Juvinate (In Aid of the Myreque C)", 2450, 0, 0, 0, 196, 0, 0, 49, 0, 4, 0, 825, 0, 825, 49, "Stab", 90, 65, 55, 45));
        enemies.add(new Enemy("Frogeel", 2450, 159.3, 52.5, 0, 196, 0, 0, 49, 0, 4, 0, 825, 0, 825, 49, "Crush", 90, 65, 55, 45));
        enemies.add(new Enemy("Ice troll male", 2450, 159.3, 52.5, 196, 0, 0, 49, 0, 0, 4, 825, 0, 0, 825, 49, "Fire", 90, 55, 45, 65));
        enemies.add(new Enemy("Black Knight Titan", 2500, 63.9, 21, 120, 0, 0, 20, 0, 0, 7, 316, 0, 0, 316, 20, "Nothing", 0, 20, 10, 40));
        enemies.add(new Enemy("Ghast", 2500, 81, 26.7, 150, 0, 0, 25, 0, 0, 4, 381, 0, 0, 381, 25, "Fire", 90, 55, 45, 65));
        enemies.add(new Enemy("Vyrewatch", 2500, 166.8, 55, 0, 0, 200, 0, 0, 50, 4, 0, 0, 850, 850, 50, "Bolts", 90, 45, 65, 55));
        enemies.add(new Enemy("Tumeken's shadow 5", 2500, 166.8, 55, 200, 0, 0, 50, 0, 0, 4, 850, 0, 0, 850, 50, "Nothing", 0, 50, 50, 50));
        enemies.add(new Enemy("Rock crab", 2550, 232.5, 76.7, 204, 0, 0, 51, 0, 0, 6, 875, 0, 0, 875, 51, "Water", 90, 55, 45, 65));
        enemies.add(new Enemy("Gorak", 2650, 192, 63.3, 212, 0, 0, 53, 0, 0, 4, 928, 0, 0, 928, 53, "Water", 90, 55, 45, 65));
        enemies.add(new Enemy("Suqah", 2650, 183, 60.3, 380, 0, 380, 55, 0, 55, 4, 1040, 0, 1040, 850, 50, "Fire", 90, 55, 45, 65));
        enemies.add(new Enemy("Death wing", 2750, 211.5, 69.7, 220, 0, 220, 55, 0, 55, 4, 983, 0, 983, 983, 55, "Arrows", 90, 45, 65, 55));
        enemies.add(new Enemy("Fistandantilus", 2750, 211.5, 69.7, 0, 0, 220, 0, 0, 55, 4, 0, 0, 983, 983, 55, "Arrows", 90, 45, 65, 55));
        enemies.add(new Enemy("Zaromark Sliver", 2750, 211.5, 69.7, 220, 220, 0, 55, 55, 0, 4, 983, 983, 0, 983, 55, "Nothing", 0, 55, 45, 45));
        enemies.add(new Enemy("Fire Warrior of Lesarkus", 2750, 211.5, 69.7, 0, 0, 220, 0, 0, 55, 6, 0, 0, 983, 983, 55, "Arrows", 90, 55, 45, 65));
        enemies.add(new Enemy("Dagannoth", 2800, 221.7, 73.1, 224, 0, 0, 56, 0, 0, 4, 1011, 0, 0, 1011, 56, "Earth", 90, 55, 45, 65));
        enemies.add(new Enemy("Demon (Underground Pass)", 2800, 221.7, 73.1, 224, 0, 0, 56, 0, 0, 4, 1011, 0, 0, 1011, 56, "Air", 90, 55, 45, 65));
        enemies.add(new Enemy("Mourner", 2850, 233.1, 76.9, 228, 0, 0, 57, 0, 0, 4, 1040, 0, 0, 1040, 57, "Fire", 90, 55, 45, 65));
        enemies.add(new Enemy("Kalrag", 2900, 244.8, 80.7, 232, 0, 0, 58, 0, 0, 4, 1070, 0, 0, 1070, 58, "Water", 90, 55, 45, 65));
        enemies.add(new Enemy("Paladin (Underground Pass)", 2900, 244.8, 80.7, 550, 0, 0, 58, 0, 0, 4, 1070, 0, 0, 1070, 58, "Earth", 90, 55, 45, 65));
        enemies.add(new Enemy("Count Draynor", 3000, 22.2, 7.3, 300, 0, 0, 20, 0, 0, 6, 316, 0, 0, 316, 20, "Fire", 90, 55, 45, 65));
        enemies.add(new Enemy("Cywir Alpha", 3000, 211.5, 69.7, 792, 0, 0, 55, 0, 0, 4, 983, 0, 0, 983, 55, "Water", 90, 55, 45, 65));
        enemies.add(new Enemy("'Rum'-pumped crab", 3000, 269.4, 88.9, 240, 0, 0, 60, 0, 0, 4, 1132, 0, 0, 1132, 60, "Stab", 90, 65, 55, 45));
        enemies.add(new Enemy("Tz-Kih", 3000, 141.6, 46.7, 244, 0, 0, 61, 0, 0, 4, 1164, 0, 0, 1164, 61, "Water", 90, 55, 45, 65));
        enemies.add(new Enemy("Elf warrior", 3000, 269.4, 88.9, 240, 0, 0, 60, 0, 0, 4, 1132, 0, 0, 1132, 60, "Fire", 90, 55, 45, 65));
        enemies.add(new Enemy("Ice troll", 3200, 327.9, 108.2, 256, 0, 0, 64, 0, 0, 4, 1264, 0, 0, 1264, 64, "Fire", 90, 55, 45, 65));
        enemies.add(new Enemy("Kolodion (Ogre)", 3200, 183, 60.3, 156, 0, 208, 39, 0, 52, 4, 609, 0, 901, 901, 52, "Nothing", 0, 45, 65, 55));
        enemies.add(new Enemy("Troll general", 3250, 344.4, 113.6, 260, 0, 0, 65, 0, 0, 4, 1299, 0, 0, 1299, 65, "Water", 90, 55, 45, 65));
        enemies.add(new Enemy("Hardened TzHaar", 3500, 440.7, 145.4, 280, 280, 280, 70, 70, 70, 4, 1486, 1486, 1486, 1486, 70, "Nothing", 0, 40, 40, 40));
        enemies.add(new Enemy("Kolodion (Troll)", 3500, 211.5, 69.7, 165, 0, 220, 41, 0, 55, 4, 412, 0, 983, 983, 55, "Nothing", 0, 45, 65, 55));
        enemies.add(new Enemy("Ice giant", 3700, 136.3, 44.9, 185, 0, 0, 37, 0, 0, 5, 571, 0, 0, 571, 37, "Fire", 90, 55, 45, 65));
        enemies.add(new Enemy("Lava monster", 3700, 536.7, 177.1, 222, 0, 296, 55, 0, 74, 4, 555, 0, 1650, 1650, 74, "Bolts", 90, 45, 65, 55));
        enemies.add(new Enemy("TokHaar-Ket Champion", 3750, 564.3, 186.2, 300, 300, 300, 75, 75, 75, 4, 1694, 1694, 1694, 1650, 75, "Nothing", 0, 40, 40, 40));
        enemies.add(new Enemy("Witch's experiment 2", 4000, 99, 32.6, 244, 0, 0, 17, 0, 0, 4, 280, 0, 0, 280, 17, "Water", 90, 55, 45, 65));
        enemies.add(new Enemy("TokHaar-Hur", 4000, 441, 145.5, 384, 0, 0, 80, 0, 0, 4, 1486, 0, 0, 1486, 80, "Water", 90, 55, 45, 65));
        enemies.add(new Enemy("Dramen tree spirit", 4000, 132, 43.5, 384, 0, 0, 45, 0, 0, 4, 732, 0, 0, 732, 45, "Fire", 90, 55, 45, 65));
        enemies.add(new Enemy("Revenant icefiend", 4050, 117, 38.6, 607, 607, 607, 27, 27, 27, 5, 409, 409, 409, 409, 27, "Nothing", 0, 40, 40, 40));
        enemies.add(new Enemy("Jogre", 4100, 163.3, 53.8, 246, 0, 0, 41, 0, 0, 6, 648, 0, 0, 648, 41, "Water", 90, 55, 45, 65));
        enemies.add(new Enemy("Revenant pyrefiend", 4350, 129, 42.5, 652, 652, 652, 29, 29, 29, 5, 439, 439, 439, 439, 29, "Nothing", 0, 40, 40, 40));
        enemies.add(new Enemy("Tormented wraith", 4500, 100.1, 33, 0, 0, 120, 0, 0, 40, 4, 0, 0, 628, 628, 40, "Bolts", 90, 45, 65, 55));
        enemies.add(new Enemy("Giant lobster", 4500, 133.8, 44.1, 120, 0, 0, 30, 0, 0, 4, 454, 0, 0, 454, 30, "Air", 90, 55, 45, 65));
        enemies.add(new Enemy("Kolodion (Dark beast)", 4500, 233.1, 76.9, 171, 0, 228, 42, 0, 57, 4, 427, 0, 1040, 1040, 57, "Nothing", 0, 45, 65, 55));
        enemies.add(new Enemy("Revenant hobgoblin", 4800, 145.2, 47.9, 720, 720, 720, 32, 32, 32, 5, 486, 486, 486, 486, 32, "Nothing", 0, 40, 40, 40));
        enemies.add(new Enemy("Zombie (Uncharted Isles)", 4950, 0, 0, 268, 0, 0, 67, 0, 0, 5, 1372, 0, 0, 1372, 67, "Fire", 90, 55, 45, 65));
        enemies.add(new Enemy("Zyclops", 4950, 0, 0, 268, 0, 0, 67, 0, 0, 5, 1372, 0, 0, 1372, 67, "Fire", 90, 55, 45, 65));
        enemies.add(new Enemy("Zyclops cannoneer", 4950, 0, 0, 268, 0, 0, 67, 0, 0, 5, 1372, 0, 0, 1372, 67, "Fire", 90, 55, 45, 65));
        enemies.add(new Enemy("Bronze dragon", 5000, 297.3, 98.1, 409, 0, 0, 62, 0, 0, 4, 1197, 0, 0, 1197, 62, "Water", 90, 55, 45, 65));
        enemies.add(new Enemy("Infernal mage", 5000, 267.1, 88.1, 0, 0, 208, 0, 0, 52, 4, 0, 0, 901, 901, 52, "Arrows", 90, 45, 65, 55));
        enemies.add(new Enemy("The Illusive", 5000, 312.3, 103, 907, 907, 907, 63, 63, 63, 4, 1230, 1230, 1230, 1230, 63, "Nothing", 0, 40, 40, 40));
        enemies.add(new Enemy("Nazastarool (phase 1)", 5000, 143.1, 47.2, 152, 0, 0, 38, 0, 0, 4, 590, 0, 0, 590, 38, "Fire", 90, 55, 45, 65));
        enemies.add(new Enemy("Treus Dayth", 5000, 198, 65.3, 432, 0, 0, 45, 0, 0, 4, 732, 0, 0, 732, 45, "Nothing", 0, 20, 10, 40));
        enemies.add(new Enemy("Revenant vampyre", 5100, 159.6, 52.6, 765, 765, 765, 34, 34, 34, 5, 519, 519, 519, 519, 34, "Nothing", 0, 40, 40, 40));
        enemies.add(new Enemy("Kalphite guardian", 5200, 274.5, 90.5, 208, 0, 0, 52, 0, 0, 4, 901, 0, 0, 91, 52, "Water", 90, 55, 45, 65));
        enemies.add(new Enemy("Warped tortoise", 5200, 274.5, 90.5, 0, 0, 208, 0, 0, 52, 4, 0, 0, 901, 901, 52, "Bolts", 90, 45, 65, 55));
        enemies.add(new Enemy("Dad", 5500, 317.2, 104.6, 440, 0, 0, 55, 0, 0, 8, 983, 0, 0, 983, 55, "Water", 90, 55, 45, 65));
        enemies.add(new Enemy("Ice Queen", 5500, 317.2, 104.6, 0, 0, 440, 0, 0, 55, 4, 0, 0, 983, 983, 55, "Nothing", 0, 10, 40, 20));
        enemies.add(new Enemy("Revenant werewolf", 5700, 190.8, 62.9, 855, 855, 855, 38, 38, 38, 5, 590, 590, 590, 590, 38, "Nothing", 0, 40, 40, 40));
        enemies.add(new Enemy("Yt-MejKot (TEK)", 5775, 622.8, 205, 369, 0, 0, 77, 0, 0, 4, 1783, 0, 0, 1566, 77, "Water", 90, 55, 45, 65));
        enemies.add(new Enemy("Witch's experiment 3", 6000, 146.2, 48.2, 388, 0, 0, 27, 0, 0, 4, 409, 0, 0, 409, 27, "Water", 90, 55, 45, 65));
        enemies.add(new Enemy("Tanglefoot", 6000, 238.9, 78.8, 0, 196, 0, 0, 49, 0, 4, 0, 825, 0, 825, 49, "Crush", 90, 65, 55, 45));
        enemies.add(new Enemy("TokHaar-Mej", 6000, 638.8, 210.8, 480, 0, 1008, 70, 1, 85, 4, 850, 0, 1608, 1608, 85, "Bolts", 90, 45, 65, 55));
        enemies.add(new Enemy("Chronozon", 6000, 404.1, 133.3, 480, 480, 480, 60, 60, 60, 4, 1132, 1132, 1132, 1132, 60, "Nothing", 0, 10, 40, 20));
        enemies.add(new Enemy("Me", 6000, 404.1, 133.3, 250, 0, 0, 60, 0, 0, 5, 1132, 0, 0, 1132, 60, "Fire", 90, 55, 45, 65));
        enemies.add(new Enemy("Kolodion (Black demon)", 6000, 404.1, 133.3, 180, 0, 240, 45, 0, 60, 4, 732, 0, 1132, 1132, 60, "Nothing", 0, 45, 65, 55));
        enemies.add(new Enemy("Tz-Kek", 6200, 445.9, 147.1, 248, 0, 0, 62, 0, 0, 4, 1197, 0, 0, 1197, 62, "Water", 90, 55, 45, 65));
        enemies.add(new Enemy("Revenant cyclops", 6450, 239.4, 79, 967, 967, 967, 43, 43, 43, 5, 689, 689, 689, 689, 43, "Nothing", 0, 40, 40, 40));
        enemies.add(new Enemy("Giant worm", 6500, 274.5, 90.5, 0, 0, 600, 0, 0, 65, 5, 0, 0, 1924, 1299, 40, "Bolts", 90, 45, 65, 55));
        enemies.add(new Enemy("Player spoof A", 6500, 516.6, 170.4, 390, 390, 390, 65, 65, 65, 6, 1299, 1299, 1299, 1299, 65, "Arrows", 60, 40, 40, 40));
        enemies.add(new Enemy("Player spoof B", 6500, 516.6, 170.4, 390, 390, 390, 65, 65, 65, 6, 1299, 1299, 1299, 1299, 65, "Stab", 60, 40, 40, 40));
        enemies.add(new Enemy("Player spoof C", 6500, 516.6, 170.4, 390, 390, 390, 65, 65, 65, 6, 1299, 1299, 1299, 1299, 65, "Fire", 60, 40, 40, 40));
        enemies.add(new Enemy("TokHaar-Xil", 7000, 638.7, 210.7, 480, 576, 0, 50, 73, 0, 4, 850, 1608, 0, 1608, 73, "Crush", 90, 65, 55, 45));
        enemies.add(new Enemy("Black demon (The Grand Tree)", 7000, 661, 218.1, 560, 0, 0, 70, 0, 0, 4, 1486, 0, 0, 1486, 70, "Water", 90, 55, 45, 65));
        enemies.add(new Enemy("Revenant hellhound", 7050, 250.2, 82.5, 1057, 1057, 1057, 50, 50, 50, 5, 850, 850, 850, 850, 50, "Nothing", 0, 40, 40, 40));
        enemies.add(new Enemy("Revenant demon", 7500, 404.1, 133.3, 1125, 1125, 1125, 60, 60, 60, 5, 1132, 1132, 1132, 1132, 60, "Nothing", 0, 40, 40, 40));
        enemies.add(new Enemy("Tok-Xil", 7500, 542.2, 178.9, 0, 288, 0, 0, 60, 0, 4, 0, 1230, 0, 1230, 63, "Slash", 90, 65, 55, 45));
        enemies.add(new Enemy("TzHaar-Ket-Yit'tal", 7500, 846.4, 279.3, 400, 400, 400, 75, 75, 75, 4, 1694, 1694, 1694, 1650, 75, "Nothing", 0, 20, 20, 20));
        enemies.add(new Enemy("Iron dragon", 7500, 661, 218.1, 488, 0, 488, 70, 1, 1, 4, 1650, 0, 1650, 1486, 70, "Water", 90, 55, 45, 65));
        enemies.add(new Enemy("Nazastarool (phase 2)", 7500, 190.8, 62.9, 152, 0, 0, 38, 0, 0, 4, 590, 0, 0, 590, 38, "Fire", 90, 55, 45, 65));
        enemies.add(new Enemy("Slagilith", 7500, 264, 87.1, 225, 0, 0, 45, 0, 0, 5, 732, 0, 0, 732, 45, "Air", 0, 55, 45, 65));
        enemies.add(new Enemy("Ket-Zek (TEK)", 7800, 982.3, 324.1, 500, 0, 750, 58, 0, 78, 4, 1829, 0, 1829, 1608, 78, "Bolts", 90, 45, 65, 55));
        enemies.add(new Enemy("Witch's experiment 4", 8000, 207.7, 68.5, 504, 0, 0, 35, 0, 0, 4, 536, 0, 0, 409, 27, "Water", 90, 55, 45, 65));
        enemies.add(new Enemy("Dust devil", 8000, 424.8, 140.1, 0, 244, 0, 0, 61, 0, 4, 0, 1164, 0, 1164, 61, "Crush", 90, 65, 55, 45));
        enemies.add(new Enemy("Skeleton Hellhound", 8000, 217.8, 71.8, 307, 0, 0, 32, 0, 0, 4, 486, 0, 0, 486, 32, "Air", 90, 55, 45, 65));
        enemies.add(new Enemy("TokHaar-Ket", 8000, 638.7, 210.7, 864, 0, 0, 73, 0, 0, 4, 1299, 0, 0, 1608, 73, "Water", 90, 55, 45, 65));
        enemies.add(new Enemy("Revenant ork", 8250, 661, 218.1, 1237, 1237, 1237, 70, 70, 70, 5, 1486, 1486, 1486, 1486, 70, "Nothing", 0, 40, 40, 40));
        enemies.add(new Enemy("Abyssal demon", 8500, 661, 218.1, 672, 0, 0, 70, 0, 0, 4, 1486, 0, 0, 1608, 70, "Slash", 90, 55, 45, 65));
        enemies.add(new Enemy("Revenant dark beast", 8850, 1085.4, 358.1, 1327, 1327, 1327, 80, 80, 80, 5, 1924, 1924, 1924, 1924, 80, "Nothing", 0, 40, 40, 40));
        enemies.add(new Enemy("Greater shadow", 9000, 846.4, 279.3, 0, 0, 1080, 0, 0, 75, 4, 0, 0, 1694, 1694, 75, "Fire", 90, 45, 65, 55));
        enemies.add(new Enemy("Revenant knight", 9750, 1392.7, 459.5, 1462, 1462, 1462, 85, 85, 85, 5, 2178, 2178, 2178, 1694, 75, "Nothing", 0, 40, 40, 40));
        enemies.add(new Enemy("Skeleton (Uncharted Isles)", 10000, 0, 0, 1316, 0, 0, 67, 0, 0, 5, 1372, 0, 0, 1372, 67, "Earth", 90, 55, 45, 65));
        enemies.add(new Enemy("Yt-MejKot", 10000, 569.7, 188, 1152, 0, 0, 70, 0, 0, 4, 1486, 0, 0, 1264, 64, "Water", 90, 55, 45, 65));
        enemies.add(new Enemy("Yt-HurKot", 10000, 688.8, 227.3, 260, 0, 0, 65, 0, 0, 4, 1299, 0, 0, 1299, 65, "Water", 90, 55, 45, 65));
        enemies.add(new Enemy("Wingman Skree", 10000, 766.3, 252.8, 0, 0, 250, 0, 0, 73, 5, 0, 0, 1486, 1299, 73, "Arrows", 90, 45, 66, 55));
        enemies.add(new Enemy("Flockleader Geerin", 10000, 766.3, 252.8, 0, 250, 0, 0, 73, 0, 5, 0, 1486, 0, 1299, 73, "Bolts", 90, 65, 55, 45));
        enemies.add(new Enemy("Flight Kilisa", 10000, 766.3, 252.8, 250, 0, 0, 73, 0, 0, 5, 1486, 0, 0, 1299, 73, "Air", 90, 55, 45, 65));
        enemies.add(new Enemy("Desert strykewyrm", 10000, 805, 265.6, 0, 296, 0, 0, 74, 0, 4, 0, 1650, 0, 1526, 74, "Stab", 90, 65, 55, 45));
        enemies.add(new Enemy("Iorwerth scout", 10000, 615, 202.9, 816, 0, 0, 85, 0, 0, 4, 2178, 0, 0, 1694, 90, "Fire", 90, 55, 45, 65));
        enemies.add(new Enemy("Cadarn magus", 10000, 615, 202.9, 0, 0, 1083, 0, 0, 85, 6, 0, 0, 2178, 1694, 90, "Arrows", 90, 45, 65, 55));
        enemies.add(new Enemy("Harold", 10000, 661, 218.1, 420, 0, 0, 70, 0, 0, 4, 1486, 0, 0, 1486, 70, "Fire", 90, 55, 45, 65));
        enemies.add(new Enemy("Nazastarool (phase 3)", 10000, 286.2, 94.4, 152, 0, 0, 38, 0, 0, 4, 590, 0, 0, 590, 38, "Fire", 90, 55, 45, 65));
        enemies.add(new Enemy("Elvarg", 10000, 347, 114.5, 220, 0, 330, 45, 0, 45, 4, 732, 0, 732, 120, 2, "Nothing", 0, 40, 20, 10));
        enemies.add(new Enemy("Revenant dragon", 10350, 1787.4, 589.8, 1552, 1552, 1552, 90, 90, 90, 5, 2458, 2458, 2458, 2458, 90, "Nothing", 0, 40, 40, 40));
        enemies.add(new Enemy("Gadderanks", 10500, 343.8, 113.4, 403, 0, 0, 42, 0, 0, 4, 668, 0, 0, 668, 42, "Fire", 90, 55, 45, 65));
        enemies.add(new Enemy("Koschei the Deathless", 10950, 0, 0, 560, 560, 560, 0, 0, 0, 4, 1486, 1486, 1486, 1486, 0, "Nothing", 0, 20, 10, 40));
        enemies.add(new Enemy("Ahrim the Blighted", 12000, 881.4, 290.8, 0, 0, 1260, 0, 0, 70, 6, 0, 0, 1566, 1299, 70, "Arrows", 90, 45, 65, 55));
        enemies.add(new Enemy("Akrisae the Doomed", 12000, 881.4, 290.8, 0, 0, 2167, 0, 0, 70, 6, 0, 0, 1486, 1486, 70, "Nothing", 0, 45, 65, 55));
        enemies.add(new Enemy("Dharok the Wretched", 12000, 881.4, 290.8, 1260, 0, 0, 70, 0, 0, 6, 1566, 0, 0, 1299, 70, "Fire", 90, 55, 45, 65));
        enemies.add(new Enemy("Guthan the Infested", 12000, 881.4, 290.8, 1260, 0, 0, 70, 0, 0, 6, 1566, 0, 0, 1299, 70, "Air", 90, 55, 45, 65));
        enemies.add(new Enemy("Karil the Tainted", 12000, 881.4, 290.8, 0, 1260, 0, 0, 70, 0, 6, 0, 1566, 0, 1299, 70, "Stab", 90, 65, 55, 45));
        enemies.add(new Enemy("Torag the Corrupted", 12000, 881.4, 290.8, 1260, 0, 0, 70, 0, 0, 6, 1566, 0, 0, 1299, 70, "Water", 90, 55, 45, 65));
        enemies.add(new Enemy("Verac the Defiled", 12000, 881.4, 290.8, 1260, 0, 0, 70, 0, 0, 6, 1566, 0, 0, 1299, 70, "Earth", 90, 55, 45, 65));
        enemies.add(new Enemy("Wild jade vine", 12000, 151.8, 50, 936, 936, 936, 65, 65, 65, 4, 1299, 1299, 1299, 628, 40, "Nothing", 0, 40, 40, 40));
        enemies.add(new Enemy("Gu ronin", 12500, 1378, 454.7, 2680, 0, 0, 85, 0, 0, 5, 2178, 0, 0, 2178, 85, "Nothing", 0, 55, 45, 65));
        enemies.add(new Enemy("Skeletal horror (Phase 1)", 12500, 344.4, 113.6, 390, 0, 0, 65, 0, 0, 6, 1299, 0, 0, 1299, 65, "Nothing", 0, 20, 10, 40));
        enemies.add(new Enemy("Skeletal horror (Phase 2)", 12500, 1932.4, 637.6, 372, 0, 0, 62, 0, 0, 6, 1197, 0, 0, 1197, 62, "Nothing", 0, 55, 55, 55));
        enemies.add(new Enemy("Skeletal horror (Phase 3)", 12500, 1212.3, 400, 360, 0, 0, 60, 0, 0, 6, 1132, 0, 0, 1132, 60, "Nothing", 0, 55, 55, 55));
        enemies.add(new Enemy("Skeletal horror (Phase 4)", 12500, 612, 201.9, 348, 0, 0, 58, 0, 0, 6, 1070, 0, 0, 1070, 58, "Nothing", 0, 55, 55, 55));
        enemies.add(new Enemy("Skeletal wyvern", 12500, 1309.8, 432.2, 1100, 1100, 1100, 78, 78, 78, 4, 1829, 1829, 1829, 1608, 78, "Fire", 90, 55, 45, 65));
        enemies.add(new Enemy("Trahaearn automaton", 12500, 500.4, 165.1, 250, 250, 250, 50, 50, 50, 5, 850, 850, 850, 850, 50, "Nothing", 45, 45, 45, 45));
        enemies.add(new Enemy("Giant Sea Snake", 13500, 462, 152.4, 506, 675, 0, 33, 45, 0, 5, 337, 732, 0, 732, 45, "Slash", 90, 65, 55, 45));
        enemies.add(new Enemy("Charger", 15000, 1410.7, 465.5, 1564, 0, 0, 80, 0, 0, 4, 1924, 0, 0, 1486, 70, "Crush", 90, 55, 45, 65));
        enemies.add(new Enemy("Cyclops labourer", 15000, 0, 0, 1100, 0, 0, 70, 0, 0, 6, 1486, 0, 0, 1486, 70, "Fire", 90, 55, 45, 65));
        enemies.add(new Enemy("Shadow nihil", 15000, 1447.2, 477.5, 0, 1000, 0, 0, 80, 0, 5, 0, 1924, 0, 1924, 80, "Melee", 40, 40, 40, 40));
        enemies.add(new Enemy("Zyclops (Final Destination)", 15000, 0, 0, 268, 0, 0, 67, 0, 0, 5, 1372, 0, 0, 1372, 67, "Fire", 90, 55, 45, 65));
        enemies.add(new Enemy("Ket-Zek", 15000, 1215, 400.9, 0, 0, 1123, 0, 0, 80, 4, 0, 0, 1486, 1299, 65, "Arrows", 90, 45, 65, 55));
        enemies.add(new Enemy("Dagannoth Mother (BRD)", 15000, 1277.2, 421.4, 700, 700, 700, 73, 73, 73, 4, 1608, 1608, 1608, 1608, 73, "Nothing", 0, 55, 55, 55));
        enemies.add(new Enemy("The Untouchable", 15000, 1101.7, 363.5, 864, 864, 864, 65, 65, 65, 4, 1299, 1299, 1299, 1694, 75, "Nothing", 0, 40, 40, 40));
        enemies.add(new Enemy("TokTz-Ket-Dill", 15000, 484, 159.7, 819, 819, 819, 46, 46, 46, 6, 983, 983, 983, 755, 46, "Water", 40, 20, 10, 40));
        enemies.add(new Enemy("Jungle demon", 15000, 583.8, 192.6, 745, 0, 745, 50, 0, 50, 6, 850, 0, 850, 850, 50, "Nothing", 0, 40, 40, 40));
        enemies.add(new Enemy("New Varrock guard", 16250, 1033.2, 340.9, 384, 0, 0, 40, 0, 0, 4, 1486, 0, 0, 1132, 60, "Nothing", 0, 70, 70, 70));
        enemies.add(new Enemy("Dragon-hunter mage", 16250, 903.7, 298.2, 0, 0, 325, 0, 0, 65, 5, 0, 0, 1299, 1299, 65, "Arrows", 90, 45, 65, 55));
        enemies.add(new Enemy("Dragon-hunter warrior", 16350, 949.5, 313.3, 325, 0, 0, 65, 0, 0, 5, 1299, 0, 0, 1299, 65, "Air", 90, 55, 45, 65));
        enemies.add(new Enemy("Dragon-hunter archer", 16450, 903.7, 298.2, 0, 325, 0, 0, 65, 0, 5, 0, 1299, 0, 1299, 65, "Stab", 90, 65, 55, 45));
        enemies.add(new Enemy("Airut", 16875, 2052, 677.1, 816, 816, 0, 85, 85, 0, 4, 3031, 3031, 0, 2458, 90, "Nothing", 0, 65, 55, 45));
        enemies.add(new Enemy("Chaos Elemental", 17250, 1257.3, 414.9, 1104, 1104, 1104, 1, 1, 69, 4, 1447, 1447, 2178, 1447, 69, "Bolts", 90, 45, 65, 55));
        enemies.add(new Enemy("Head mourner", 17500, 1215, 400.9, 1036, 0, 0, 72, 0, 0, 4, 1566, 0, 0, 1566, 72, "Fire", 90, 55, 45, 65));
        enemies.add(new Enemy("Mithril dragon", 17800, 1809, 596.9, 1068, 1068, 1068, 80, 80, 80, 4, 1924, 1924, 1924, 2178, 80, "Earth", 90, 55, 45, 65));
        enemies.add(new Enemy("The Inadequacy", 18000, 1322.1, 436.2, 1564, 1564, 1565, 70, 70, 70, 6, 1486, 1486, 1486, 1486, 70, "Nothing", 0, 40, 40, 40));
        enemies.add(new Enemy("The Everlasting", 18000, 1139.4, 376, 964, 964, 964, 67, 67, 67, 4, 1372, 1372, 1372, 1372, 67, "Nothing", 0, 40, 40, 40));
        enemies.add(new Enemy("Sir Hugo", 18750, 1557, 513.8, 739, 0, 0, 77, 0, 0, 4, 1783, 0, 0, 1783, 77, "Air", 90, 55, 45, 65));
        enemies.add(new Enemy("Dark Lord", 19250, 1868.4, 616.5, 1108, 0, 1108, 77, 1, 77, 4, 1783, 0, 1783, 1783, 77, "Fire", 90, 45, 65, 55));
        enemies.add(new Enemy("Ice nihil", 20000, 2170.8, 716.3, 0, 0, 768, 0, 0, 80, 4, 0, 0, 1924, 1924, 80, "Ranged", 90, 45, 65, 55));
        enemies.add(new Enemy("Smoke nihil", 20000, 2170.8, 716.3, 0, 0, 768, 0, 0, 80, 4, 0, 0, 1924, 1924, 80, "Ranged", 90, 45, 65, 55));
        enemies.add(new Enemy("Fareed", 20000, 942.9, 311.1, 864, 0, 864, 60, 0, 60, 4, 1132, 0, 1132, 1132, 60, "Water", 40, 20, 10, 40));
        enemies.add(new Enemy("Damis (form 1)", 20000, 1040.5, 343.3, 892, 0, 0, 62, 0, 0, 4, 1197, 0, 0, 1197, 62, "Earth", 40, 20, 10, 40));
        enemies.add(new Enemy("Damis (form 2)", 20000, 1040.5, 343.3, 892, 0, 0, 62, 0, 0, 3, 1197, 0, 0, 1197, 62, "Earth", 40, 20, 10, 40));
        enemies.add(new Enemy("Kamil", 21000, 1093, 360.6, 907, 0, 907, 63, 0, 63, 4, 1230, 0, 1230, 1230, 63, "Fire", 40, 20, 10, 40));
        enemies.add(new Enemy("Echo of Jas", 23750, 4585.5, 1513.2, 0, 0, 475, 0, 0, 95, 5, 0, 0, 2765, 2765, 95, "Nothing", 0, 45, 65, 55));
        enemies.add(new Enemy("Blood nihil", 25000, 2532.6, 835.7, 768, 0, 0, 80, 0, 0, 4, 1924, 0, 0, 1924, 80, "Magic", 90, 55, 45, 65));
        enemies.add(new Enemy("Ice strykewyrm", 25000, 1067, 352.1, 729, 0, 729, 76, 0, 76, 4, 1566, 0, 1566, 1566, 76, "Fire", 90, 40, 30, 10));
        enemies.add(new Enemy("Dagannoth sentinel", 25000, 661, 218.1, 1036, 1036, 892, 72, 72, 62, 4, 1566, 1566, 1197, 1486, 70, "Slash", 90, 65, 55, 45));
        enemies.add(new Enemy("Dessous", 25000, 1212.3, 400, 864, 864, 864, 60, 60, 60, 4, 1132, 1132, 1132, 1132, 60, "Air", 40, 20, 10, 40));
        enemies.add(new Enemy("Legio", 30000, 3591, 1185, 0, 0, 1102, 0, 0, 90, 10, 0, 0, 2458, 2178, 85, "Ranged", 70, 7, 70, 15));
        enemies.add(new Enemy("Lava strykewyrm", 30000, 1200, 396, 1788, 1152, 1152, 85, 85, 85, 4, 2178, 2178, 2178, 1924, 80, "Nothing", 0, 55, 55, 55));
        enemies.add(new Enemy("Dagannoth Prime", 35000, 2194.5, 724.1, 0, 0, 1788, 0, 0, 68, 4, 0, 0, 1924, 1409, 68, "Arrows", 75, 0, 60, 0));
        enemies.add(new Enemy("Dagannoth Rex", 35000, 2194.5, 724.1, 1788, 0, 0, 68, 0, 0, 4, 1924, 0, 0, 1409, 68, "Fire", 75, 0, 0, 60));
        enemies.add(new Enemy("Dagannoth Supreme", 35000, 2194.5, 724.1, 0, 1788, 0, 0, 68, 0, 4, 0, 1924, 0, 1409, 68, "Stab", 75, 60, 0, 0));
        enemies.add(new Enemy("General Graardor", 40000, 3204, 1057.3, 3000, 1676, 0, 75, 75, 0, 6, 2178, 1566, 0, 1299, 75, "Nothing", 0, 50, 10, 50));
        enemies.add(new Enemy("Vanstrom Klause", 40000, 2644.2, 872.5, 840, 0, 840, 70, 0, 70, 4, 1486, 0, 1486, 1486, 70, "Nothing", 0, 55, 55, 55));
        enemies.add(new Enemy("TzTok-Jad", 40000, 2644.2, 872.5, 8000, 8000, 8000, 70, 70, 70, 4, 3031, 3031, 3031, 1486, 70, "Nothing", 0, 40, 40, 40));
        enemies.add(new Enemy("Kalphite Queen (Phase 1)", 40000, 2680, 884.4, 980, 980, 980, 70, 70, 70, 6, 1486, 1486, 1486, 1486, 70, "Nothing", 0, 40, 10, 10));
        enemies.add(new Enemy("Kalphite Queen (Phase 2)", 40000, 2680, 884.4, 980, 980, 980, 70, 70, 70, 6, 1486, 1486, 1486, 1486, 70, "Nothing", 0, 60, 40, 40));
        enemies.add(new Enemy("King Black Dragon", 45000, 2155.2, 711.2, 864, 0, 864, 60, 0, 60, 4, 1924, 0, 1132, 1132, 60, "Nothing", 0, 40, 40, 40));
        enemies.add(new Enemy("TokHaar-Hok", 45000, 4341.6, 1432.7, 3136, 0, 0, 80, 0, 0, 4, 1924, 0, 0, 1694, 80, "Nothing", 0, 40, 40, 40));
        enemies.add(new Enemy("Ahrim the Blighted (ROTS)", 50000, 7149.6, 2359.3, 0, 0, 864, 0, 0, 90, 2, 0, 0, 2458, 1924, 90, "Nothing", 0, 40, 40, 40));
        enemies.add(new Enemy("Dharok the Wretched (ROTS)", 50000, 7149.6, 2359.3, 1296, 0, 0, 90, 0, 0, 5, 2458, 0, 0, 1924, 90, "Nothing", 0, 40, 40, 40));
        enemies.add(new Enemy("Guthan the Infested (ROTS)", 50000, 7149.6, 2359.3, 1296, 0, 0, 90, 0, 0, 5, 2458, 0, 0, 1924, 90, "Nothing", 0, 40, 40, 40));
        enemies.add(new Enemy("Karil the Tainted (ROTS)", 50000, 7149.6, 2359.3, 0, 864, 0, 0, 90, 0, 2, 0, 2458, 0, 1924, 90, "Nothing", 0, 40, 40, 40));
        enemies.add(new Enemy("Torag the Corrupted (ROTS)", 50000, 7149.6, 2359.3, 1296, 0, 0, 90, 0, 0, 5, 2458, 0, 0, 1924, 90, "Nothing", 0, 40, 40, 40));
        enemies.add(new Enemy("Verac the Defiled (ROTS)", 50000, 7149.6, 2359.3, 1296, 0, 0, 90, 0, 0, 5, 2458, 0, 0, 1924, 90, "Nothing", 0, 40, 40, 40));
        enemies.add(new Enemy("Decaying avatar", 50000, 3305.2, 1090.7, 1043, 0, 0, 70, 0, 0, 6, 1486, 0, 0, 1486, 70, "Nothing", 0, 40, 40, 40));
        enemies.add(new Enemy("K'ril Tsutsaroth", 55000, 5136, 1694.8, 1500, 0, 1500, 75, 0, 75, 5, 1486, 0, 1486, 1299, 75, "Fire", 75, 45, 40, 50));
        enemies.add(new Enemy("Nomad", 56250, 3667.9, 1210.4, 1378, 1378, 1378, 75, 75, 75, 5, 1694, 1694, 1694, 1694, 75, "Nothing", 0, 40, 40, 40));
        enemies.add(new Enemy("Commander Zilyana", 60000, 4796.55, 1582.8, 1800, 0, 2200, 75, 0, 75, 2, 2178, 0, 1694, 1299, 75, "Nothing", 0, 40, 40, 40));
        enemies.add(new Enemy("Cap'n Ekahi", 65000, 0, 0, 1100, 0, 0, 80, 0, 0, 6, 1924, 0, 0, 1924, 80, "Nothing", 0, 40, 40, 40));
        enemies.add(new Enemy("Kree'arra", 75000, 6573, 2169, 1676, 1080, 1080, 75, 75, 75, 3, 1694, 1694, 1694, 1299, 75, "Nothing", 0, 10, 70, 70));
        enemies.add(new Enemy("Ukunduka", 75000, 6228, 2055.2, 1152, 1152, 1152, 80, 80, 80, 4, 1924, 1924, 1924, 1694, 75, "Nothing", 0, 40, 40, 40));
        enemies.add(new Enemy("Corporeal Beast", 100000, 7618, 2513.9, 3000, 0, 4500, 75, 0, 75, 4, 1694, 0, 1694, 1694, 75, "Nothing", 0, 40, 40, 40));
        enemies.add(new Enemy("Queen Black Dragon", 100000, 5000, 1650, 2031, 2990, 0, 80, 80, 0, 6, 1924, 1924, 0, 2074, 80, "Nothing", 0, 50, 50, 50));
        enemies.add(new Enemy("Araxxi", 100000, 13034.1, 4301.2, 1653, 1653, 1653, 99, 99, 99, 4, 2458, 2458, 2458, 1924, 80, "Nothing", 0, 60, 55, 45));
        enemies.add(new Enemy("Commander Zilyana (hard)", 100050, 4796.55, 1582.8, 1900, 0, 1990, 75, 0, 75, 3, 1694, 0, 1694, 1694, 75, "Nothing", 0, 45, 40, 50));
        enemies.add(new Enemy("Image of Yakamaru", 150000, 28936.9, 9549.1, 0, 0, 1788, 0, 0, 99, 4, 0, 0, 2458, 2765, 99, "Nothing", 0, 55, 55, 55));
        enemies.add(new Enemy("Linza the Disgraced", 150000, 846, 279.1, 1200, 0, 0, 75, 0, 0, 6, 1694, 0, 0, 1694, 75, "Fire", 90, 55, 45, 65));
        enemies.add(new Enemy("Twin Furies", 200000, 8000, 2640, 816, 816, 0, 85, 85, 0, 3, 2178, 2178, 0, 1486, 70, "Nothing", 0, 40, 40, 40));
        enemies.add(new Enemy("Vindicta", 200000, 8000, 2640, 3000, 4500, 0, 80, 80, 0, 5, 1924, 1924, 0, 1694, 75, "Nothing", 0, 50, 50, 50));
        enemies.add(new Enemy("Gregorovic", 200000, 8000, 2640, 1152, 1152, 1152, 85, 85, 85, 4, 2178, 2178, 2178, 1694, 75, "Nothing", 0, 55, 55, 55));
        enemies.add(new Enemy("Helwyr", 200000, 8000, 2640, 1224, 0, 0, 85, 0, 0, 4, 2178, 0, 0, 1486, 70, "Nothing", 0, 40, 40, 40));
        enemies.add(new Enemy("Nex", 200000, 19480, 6428.4, 2500, 2500, 2500, 80, 80, 80, 4, 2023, 2023, 2023, 1924, 80, "Nothing", 0, 40, 40, 40));
        enemies.add(new Enemy("Kalphite King", 260000, 13231.1, 4366.25, 2560, 2560, 2560, 90, 90, 90, 5, 2343, 2343, 2343, 2178, 85, "Nothing", 0, 30, 30, 30));
        enemies.add(new Enemy("Araxxor", 300000, 43441.2, 14335.5, 1341, 1341, 1341, 99, 99, 99, 4, 2458, 2458, 2458, 2458, 85, "Nothing", 0, 50, 40, 40));
        enemies.add(new Enemy("Cormes", 500000, 500, 165, 0, 2123, 2123, 0, 85, 85, 4, 0, 2178, 2718, 2178, 80, "Stab", 90, 45, 65, 55));
        enemies.add(new Enemy("Telos (100% enrage)", 600000, 5000, 1650, 1424, 0, 1424, 92, 0, 92, 4, 2577, 0, 2577, 1924, 80, "Nothing", 0, 40, 40, 40));
        enemies.add(new Enemy("Krar", 700000, 500, 165, 2123, 2123, 0, 85, 85, 0, 5, 2178, 2178, 0, 1924, 80, "Water", 90, 55, 45, 65));
        enemies.add(new Enemy("Tuz", 700000, 500, 165, 2123, 0, 2123, 85, 0, 85, 4, 2178, 2178, 2178, 2178, 80, "Bolts", 90, 45, 65, 55));
        enemies.add(new Enemy("Vorago", 1250000, 100000, 33000, 5000, 0, 5000, 90, 0, 90, 4, 2458, 0, 2458, 2178, 90, "Nothing", 0, 40, 40, 40));
        enemies.add(new Enemy("Beastmaster Durzag", 1500000, 1000, 330, 1788, 1788, 0, 85, 85, 0, 6, 2458, 2458, 0, 2458, 95, "Nothing", 0, 55, 55, 55));
        enemies.add(new Enemy("Nex: Angel of Death", 3000000, 8000, 2640, 2123, 0, 2123, 90, 0, 90, 4, 2765, 0, 2765, 2765, 85, "Nothing", 0, 55, 55, 55));
        enemies.add(new Enemy("Yakamaru", 5000000, 5000, 1650, 0, 1653, 1653, 0, 99, 99, 4, 0, 2458, 2458, 2765, 99, "Nothing", 0, 55, 55, 55));
    }

    public static EnemyDatabase getEnemyDatabase() {
        if (enemyDatabase == null) {
            enemyDatabase = new EnemyDatabase();
        }
        return enemyDatabase;
    }

    public List<Enemy> getEnemies() {
        return enemies;
    }
}
