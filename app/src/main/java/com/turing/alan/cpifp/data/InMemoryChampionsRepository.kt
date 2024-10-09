package com.turing.alan.cpifp.data

class InMemoryChampionsRepository private constructor(): ChampionsRepository {


    override fun readOne(id: Int): Champion {
        val _champs = getChampions()
        return _champs.single { it.id == id }
    }



    // Función que devuelve la lista de campeones
    override fun getChampions(): List<Champion> {
        return listOf(
            Champion(
                1,
                "Ahri",
                "The Nine-Tailed Fox",
                "Innately connected to the latent power of Runeterra, Ahri is a vastaya who can reshape magic into orbs of raw energy.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Ahri_0.jpg"
            ),
            Champion(
                2,
                "Yasuo",
                "The Unforgiven",
                "An agile swordsman, Yasuo fights with the power of the wind at his beck and call, turning aside missiles and cutting down foes in the blink of an eye.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Yasuo_0.jpg"
            ),
            Champion(
                3,
                "Lux",
                "The Lady of Luminosity",
                "Luxanna Crownguard hails from Demacia, an insular realm where magical abilities are viewed with fear and suspicion.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Lux_0.jpg"
            ),
            Champion(
                4,
                "Jinx",
                "The Loose Cannon",
                "A manic and impulsive criminal from Zaun, Jinx lives to wreak havoc without care for the consequences.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Jinx_0.jpg"
            ),
            Champion(
                5,
                "Garen",
                "The Might of Demacia",
                "A proud and noble warrior, Garen fights at the head of the Dauntless Vanguard, defending Demacia with all his might and courage.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Garen_0.jpg"
            ),
            Champion(
                6,
                "Teemo",
                "The Swift Scout",
                "Undeterred by even the most dangerous and threatening of missions, Teemo scouts the world with boundless enthusiasm and a smile on his face.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Teemo_0.jpg"
            ),
            // Nuevos 20 campeones
            Champion(
                7,
                "Darius",
                "The Hand of Noxus",
                "Darius, the most feared and battle-hardened leader in Noxus, embodies the power and ruthlessness of his homeland.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Darius_0.jpg"
            ),
            Champion(
                8,
                "Zed",
                "The Master of Shadows",
                "Zed is the leader of the ancient order of the shadow warriors, and is a master of forbidden, shadow magic techniques.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Zed_0.jpg"
            ),
            Champion(
                9,
                "Lee Sin",
                "The Blind Monk",
                "Lee Sin is a master of the ancient martial art of Ionia, who channels his inner flame and spirit to strike his foes.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/LeeSin_0.jpg"
            ),
            Champion(
                10,
                "Kai'Sa",
                "Daughter of the Void",
                "Kai'Sa, daughter of the Void, has learned to survive the Void’s terrors and fights using a powerful symbiotic suit.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Kaisa_0.jpg"
            ),
            Champion(
                11,
                "Vayne",
                "The Night Hunter",
                "Shauna Vayne is a deadly, remorseless monster hunter who has dedicated her life to eradicating the supernatural forces that plague Runeterra.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Vayne_0.jpg"
            ),
            Champion(
                12,
                "Evelynn",
                "Agony's Embrace",
                "Evelynn is a demon who can seduce her prey with a sweet facade before revealing her true form and feeding on their pain.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Evelynn_0.jpg"
            ),
            Champion(
                13,
                "Akali",
                "The Rogue Assassin",
                "Once a member of the Kinkou Order, Akali now strikes alone, dedicated to defending her homeland from threats in her own way.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Akali_0.jpg"
            ),
            Champion(
                14,
                "Ekko",
                "The Boy Who Shattered Time",
                "A prodigy from the rough streets of Zaun, Ekko uses his invention, the Zero Drive, to manipulate time and outsmart his enemies.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Ekko_0.jpg"
            ),
            Champion(
                15,
                "Riven",
                "The Exile",
                "Once a swordmaster in the Noxian army, Riven was forced into exile, seeking redemption for her past deeds.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Riven_0.jpg"
            ),
            Champion(
                16,
                "Shen",
                "The Eye of Twilight",
                "As the leader of the secretive Kinkou Order, Shen balances the spiritual and physical realms, never losing his sense of duty.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Shen_0.jpg"
            ),
            Champion(
                17,
                "Irelia",
                "The Blade Dancer",
                "Using the ancient dances of her homeland, Irelia fights with blades that hover at her command, cutting down her enemies with precision.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Irelia_0.jpg"
            ),
            Champion(
                18,
                "Aatrox",
                "The Darkin Blade",
                "Once a mighty warrior, Aatrox was corrupted by the Void and is now a terrifying darkin entity who seeks destruction.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Aatrox_0.jpg"
            ),
            Champion(
                19,
                "Thresh",
                "The Chain Warden",
                "Thresh is a sadistic, unholy specter who feeds on the suffering of others, collecting their souls to torment them forever.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Thresh_0.jpg"
            ),
            Champion(
                20,
                "Fiora",
                "The Grand Duelist",
                "Fiora is the most feared duelist in all of Valoran, known for her ruthless pursuit of excellence and perfection.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Fiora_0.jpg"
            ),
            Champion(
                21,
                "Rengar",
                "The Pridestalker",
                "Rengar is a ferocious trophy hunter who stalks the most dangerous creatures in the world to fuel his bloodlust.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Rengar_0.jpg"
            ),
            Champion(
                22,
                "Katarina",
                "The Sinister Blade",
                "Katarina is a Noxian assassin of the highest caliber, known for her rapid and efficient kills on the battlefield.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Katarina_0.jpg"
            ),
            Champion(
                23,
                "Jhin",
                "The Virtuoso",
                "Khada Jhin is a meticulous criminal psychopath who believes murder is art, shaping death into grisly performance pieces.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Jhin_0.jpg"
            ),
            Champion(
                24,
                "Draven",
                "The Glorious Executioner",
                "In the Noxian empire, the name Draven is synonymous with the most elite executioner ever to enter the arena.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Draven_0.jpg"
            ),
            Champion(
                25,
                "Morgana",
                "The Fallen",
                "Morgana rejected the shackles of tradition, embracing her own path and using her dark powers to protect the downtrodden.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Morgana_0.jpg"
            ),
            Champion(
                    26,
            "Alistar",
            "The Minotaur",
            "A mighty warrior with a stormy temper, Alistar fights to free his people from the tyranny of the Noxian Empire.",
            "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Alistar_0.jpg"
        ),
        Champion(
            27,
            "Anivia",
            "The Cryophoenix",
            "Anivia is a being of ice and magic, a manifestation of the eternal cycle of life, death, and rebirth that governs the Freljord.",
            "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Anivia_0.jpg"
        ),
        Champion(
            28,
            "Ashe",
            "The Frost Archer",
            "Ashe is a master archer and the leader of the Frostborn, uniting the scattered tribes of the Freljord with her ice-enchanted bow.",
            "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Ashe_0.jpg"
        ),
        Champion(
            29,
            "Azir",
            "The Emperor of the Sands",
            "Azir is an ascended being of immense power, once the ruler of a great Shuriman empire.",
            "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Azir_0.jpg"
        ),
        Champion(
            30,
            "Bard",
            "The Wandering Caretaker",
            "Bard is a cosmic entity who travels the universe, guiding events with ancient, unknowable wisdom.",
            "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Bard_0.jpg"
        ),
        Champion(
            31,
            "Blitzcrank",
            "The Great Steam Golem",
            "Blitzcrank is a near-indestructible automaton from Zaun, designed to enhance the speed of salvage operations in the city’s Sump.",
            "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Blitzcrank_0.jpg"
        ),
        Champion(
            32,
            "Brand",
            "The Burning Vengeance",
            "Brand, once a man named Kegan Rodhe, was consumed by the flames of an ancient power, turning into a creature of pure fire and hatred.",
            "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Brand_0.jpg"
        ),
        Champion(
            33,
            "Braum",
            "The Heart of the Freljord",
            "Braum is a beloved hero of the Freljord, known for his strength, kindness, and an indestructible shield made from the door of a fortress.",
            "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Braum_0.jpg"
        ),
        Champion(
            34,
            "Caitlyn",
            "The Sheriff of Piltover",
            "Caitlyn is the best sniper in Piltover, with a mind sharper than her aim, striving to keep the peace in the City of Progress.",
            "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Caitlyn_0.jpg"
        ),
        Champion(
            35,
            "Camille",
            "The Steel Shadow",
            "Camille is a precise and ruthless operative of Piltover, wielding mechanical augmentations to keep order in the city.",
            "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Camille_0.jpg"
        ),
        Champion(
            36,
            "Cassiopeia",
            "The Serpent’s Embrace",
            "Cassiopeia is a Noxian noblewoman transformed into a deadly serpent, driven by ambition and power.",
            "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Cassiopeia_0.jpg"
        ),
        Champion(
            37,
            "Cho'Gath",
            "The Terror of the Void",
            "Cho'Gath is a monstrous Voidborn creature that devours everything in its path, growing larger and stronger with each meal.",
            "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Chogath_0.jpg"
        ),
        Champion(
            38,
            "Corki",
            "The Daring Bombardier",
            "Corki is a yordle pilot who takes to the skies in his customized flying machine, always looking for new challenges.",
            "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Corki_0.jpg"
        ),
        Champion(
            39,
            "Diana",
            "Scorn of the Moon",
            "Diana is the living embodiment of the moon's wrath, wielding its power to strike down her foes in swift, deadly arcs.",
            "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Diana_0.jpg"
        ),
        Champion(
            40,
            "Dr. Mundo",
            "The Madman of Zaun",
            "Dr. Mundo is a deranged, muscle-bound brute who thrives on pain and destruction, experimenting on himself with grotesque results.",
            "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/DrMundo_0.jpg"
        ),
        Champion(
            41,
            "Elise",
            "The Spider Queen",
            "Elise is a deadly predator who manipulates others with her beauty before ensnaring them in her webs to feed.",
            "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Elise_0.jpg"
        ),
        Champion(
            42,
            "Fiddlesticks",
            "The Ancient Fear",
            "Fiddlesticks is a malevolent scarecrow, wielding fear and death to harvest the souls of those who dare enter its domain.",
            "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Fiddlesticks_0.jpg"
        ),
        Champion(
            43,
            "Galio",
            "The Colossus",
            "Galio is a towering sentinel of stone, animated by magic to protect the people of Demacia from sorcery and threats.",
            "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Galio_0.jpg"
        ),
        Champion(
            44,
            "Gangplank",
            "The Saltwater Scourge",
            "Gangplank is a bloodthirsty pirate who rules the seas and takes whatever he wants, leaving destruction in his wake.",
            "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Gangplank_0.jpg"
        ),
        Champion(
            45,
            "Gragas",
            "The Rabble Rouser",
            "Gragas is a massive, boisterous drunkard who roams the Freljord in search of the perfect brew, leaving chaos behind him.",
            "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Gragas_0.jpg"
        ),
        Champion(
            46,
            "Heimerdinger",
            "The Revered Inventor",
            "Heimerdinger is a brilliant yordle inventor whose machines and turrets dominate the battlefield with their ingenuity.",
            "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Heimerdinger_0.jpg"
        ),
        Champion(
            47,
            "Ivern",
            "The Green Father",
            "Ivern is a peaceful forest guardian who fosters life and harmony in the natural world, protecting it from harm.",
            "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Ivern_0.jpg"
        ),
        Champion(
            48,
            "Janna",
            "The Storm's Fury",
            "Janna is a powerful wind sorceress who protects the people of Zaun with her elemental magic, controlling the weather to fight injustice.",
            "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Janna_0.jpg"
        ),
        Champion(
            49,
            "Jarvan IV",
            "The Exemplar of Demacia",
            "Jarvan IV is the prince of Demacia, a warrior king destined to protect his people with honor, courage, and a mighty lance.",
            "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/JarvanIV_0.jpg"
        ),
        Champion(
            50,
            "Jax",
            "Grandmaster at Arms",
            "Jax is a master of weapons, wielding a lamppost as his chosen instrument of destruction, unmatched in combat prowess.",
            "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Jax_0.jpg"
        ),
        Champion(
            51,
            "Jayce",
            "The Defender of Tomorrow",
            "Jayce is a brilliant inventor who fights for the future of Piltover, wielding a transforming hammer of his own creation.",
            "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Jayce_0.jpg"
        ),
        Champion(
            52,
            "Karma",
            "The Enlightened One",
            "Karma is the living embodiment of the Ionian spirit, fighting to bring peace and",
            "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Karma_0.jpg"
        ),
            Champion(
                53,
                "Karthus",
                "The Deathsinger",
                "Karthus is a powerful lich and a master of the dark arts, capable of spreading despair and death to all who oppose him.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Karthus_0.jpg"
            ),
            Champion(
                54,
                "Kassadin",
                "The Void Walker",
                "Kassadin is a master of teleportation who channels the power of the Void to slip between realities and strike down enemies.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Kassadin_0.jpg"
            ),
            Champion(
                55,
                "Kayle",
                "The Righteous",
                "Kayle is a divine warrior who punishes the wicked, upholding justice with her holy flame and golden armor.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Kayle_0.jpg"
            ),
            Champion(
                56,
                "Kennen",
                "The Heart of the Tempest",
                "Kennen is a swift and agile yordle who harnesses the power of lightning to strike down foes in a flash.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Kennen_0.jpg"
            ),
            Champion(
                57,
                "Kha'Zix",
                "The Void Reaver",
                "Kha'Zix is a monstrous predator from the Void, constantly evolving to become deadlier and more efficient at hunting.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/KhaZix_0.jpg"
            ),
            Champion(
                58,
                "Leona",
                "The Radiant Dawn",
                "Leona is a fierce warrior of the sun, who embodies the strength and valor of the Solari to protect her allies.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Leona_0.jpg"
            ),
            Champion(
                59,
                "Lissandra",
                "The Ice Witch",
                "Lissandra is a powerful ice sorceress who manipulates the frigid elements to control and deceive her enemies.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Lissandra_0.jpg"
            ),
            Champion(
                60,
                "Lucian",
                "The Purifier",
                "Lucian is a relentless hunter of the undead, wielding twin pistols and a fierce determination to avenge his fallen love.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Lucian_0.jpg"
            ),
            Champion(
                61,
                "Lulu",
                "The Fae Sorceress",
                "Lulu is a whimsical yordle who wields magic to protect her friends and transform her foes into fluffy creatures.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Lulu_0.jpg"
            ),
            Champion(
                62,
                "Malphite",
                "The Monolith",
                "Malphite is a living embodiment of earth, a massive creature who crushes foes beneath his rocky form.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Malphite_0.jpg"
            ),
            Champion(
                63,
                "Malzahar",
                "The Prophet of the Void",
                "Malzahar is a Voidborn who channels its power to manipulate and control the minds of others, drawing them into the Void.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Malzahar_0.jpg"
            ),
            Champion(
                64,
                "Maokai",
                "The Twisted Treant",
                "Maokai is a living tree who defends the forest with twisted roots and vines, using nature’s fury against his foes.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Maokai_0.jpg"
            ),
            Champion(
                65,
                "Miss Fortune",
                "The Bounty Hunter",
                "Miss Fortune is a deadly pirate captain with a penchant for gunplay, wielding dual pistols to eliminate her targets.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/MissFortune_0.jpg"
            ),
            Champion(
                66,
                "Mordekaiser",
                "The Master of Metal",
                "Mordekaiser is a terrifying warlord who controls the power of death and metal to dominate his enemies.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Mordekaiser_0.jpg"
            ),
            Champion(
                67,
                "Nami",
                "The Tidecaller",
                "Nami is a water mage from the tides of Bilgewater, using the power of the ocean to heal allies and control foes.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Nami_0.jpg"
            ),
            Champion(
                68,
                "Nasus",
                "The Curator of the Sands",
                "Nasus is a mighty being who guards the knowledge of ancient civilizations and wields incredible power to protect his home.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Nasus_0.jpg"
            ),
            Champion(
                69,
                "Nautilus",
                "The Titan of the Depths",
                "Nautilus is an armored behemoth who haunts the ocean depths, using his heavy anchor to crush those who threaten him.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Nautilus_0.jpg"
            ),
            Champion(
                70,
                "Nidalee",
                "The Bestial Huntress",
                "Nidalee is a feral warrior who transforms between human and cougar forms, using her agility and instincts to outsmart her enemies.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Nidalee_0.jpg"
            ),
            Champion(
                71,
                "Nocturne",
                "The Eternal Nightmare",
                "Nocturne is a dark entity that haunts the dreams of mortals, striking fear into their hearts in the dead of night.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Nocturne_0.jpg"
            ),
            Champion(
                72,
                "Nunu & Willump",
                "The Boy and His Yeti",
                "Nunu is a young boy with an unbreakable bond to his Yeti companion, Willump, who adventures across the Freljord.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Nunu_0.jpg"
            ),
            Champion(
                73,
                "Olaf",
                "The Berserker",
                "Olaf is a fearless Viking warrior who charges into battle with a reckless abandon, seeking glory and honor.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Olaf_0.jpg"
            ),
            Champion(
                74,
                "Orianna",
                "The Lady of Clockwork",
                "Orianna is a mechanical genius who controls a powerful ball that she uses to manipulate the battlefield.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Orianna_0.jpg"
            ),
            Champion(
                75,
                "Pantheon",
                "The Unbreakable Spear",
                "Pantheon is a legendary warrior of unmatched strength, who fights for honor with his spear and shield.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Pantheon_0.jpg"
            ),
            Champion(
                76,
                "Rakan",
                "The Charmer",
                "Rakan is a flamboyant and charming bard who uses his magic to charm and heal his allies on the battlefield.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Rakan_0.jpg"
            ),
            Champion(
                77,
                "Rammus",
                "The Armordillo",
                "Rammus is a spiky creature who rolls into battle with incredible speed, protecting himself with his armored shell.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Rammus_0.jpg"
            ),
            Champion(
                78,
                "Rek'Sai",
                "The Void Burrower",
                "Rek'Sai is a massive Void creature who burrows through the earth to ambush her prey, embodying the terrors of the Void.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/RekSai_0.jpg"
            ),
            Champion(
                79,
                "Renekton",
                "The Butcher of the Sands",
                "Renekton is a brutal and powerful warrior, a champion of Shurima who embodies the ferocity of the sands.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Renekton_0.jpg"
            ),
            Champion(
                80,
                "Rumble",
                "The Mechanized Menace",
                "Rumble is a yordle inventor who creates powerful machines and weapons to fight in battle, using his tech-savvy skills.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Rumble_0.jpg"
            ),
            Champion(
                81,
                "Ryze",
                "The Rune Mage",
                "Ryze is a powerful sorcerer who wields the arcane forces of magic, seeking to uncover the mysteries of the world.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Ryze_0.jpg"
            ),
            Champion(
                82,
                "Sejuani",
                "The Winter's Wrath",
                "Sejuani is a fierce warrior and leader of the Winter's Claw, using her ice magic to freeze her enemies in battle.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Sejuani_0.jpg"
            ),
            Champion(
                83,
                "Shaco",
                "The Demon Jester",
                "Shaco is a cunning trickster who thrives on chaos, using deception and fear to bring torment to his victims.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Shaco_0.jpg"
            ),
            Champion(
                84,
                "Shen",
                "The Eye of Twilight",
                "Shen is a ninja guardian who protects his allies and fights for balance, using shadows to teleport and strike down enemies.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Shen_0.jpg"
            ),
            Champion(
                85,
                "Shyvana",
                "The Half-Dragon",
                "Shyvana is a fierce warrior who transforms into a powerful dragon, combining the strength of both her human and dragon forms.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Shyvana_0.jpg"
            ),
            Champion(
                86,
                "Sona",
                "Maven of the Strings",
                "Sona is a virtuosic musician whose melodies inspire allies and destroy foes, channeling magic through her etwahl.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Sona_0.jpg"
            ),
            Champion(
                87,
                "Soraka",
                "The Starchild",
                "Soraka is a celestial being who heals and protects her allies, embodying compassion and tranquility on the battlefield.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Soraka_0.jpg"
            ),
            Champion(
                88,
                "Swain",
                "The Noxian Grand General",
                "Swain is a cunning tactician and a powerful mage, commanding his forces to conquer the lands for Noxus.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Swain_0.jpg"
            ),
            Champion(
                89,
                "Syndra",
                "The Dark Sovereign",
                "Syndra is a powerful sorceress who wields the forces of magic to control and manipulate her enemies at will.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Syndra_0.jpg"
            ),
            Champion(
                90,
                "Taliyah",
                "The Stoneweaver",
                "Taliyah is a skilled stone mage who can manipulate the very earth around her, shaping it to her will in battle.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Taliyah_0.jpg"
            ),
            Champion(
                91,
                "Talon",
                "The Blade's Shadow",
                "Talon is a lethal assassin who strikes swiftly and silently, wielding his blades to eliminate targets without a trace.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Talon_0.jpg"
            ),
            Champion(
                92,
                "Taric",
                "The Shield of Valoran",
                "Taric is a protector of the weak, wielding the power of light to heal and shield his allies from harm.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Taric_0.jpg"
            ),
            Champion(
                94,
                "Thresh",
                "The Chain Warden",
                "Thresh is a malevolent warden who traps souls with his lantern and chains, feeding off the fear of his victims.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Thresh_0.jpg"
            ),
            Champion(
                95,
                "Tristana",
                "The Yordle Gunner",
                "Tristana is a yordle who wields a massive cannon, using her explosives to demolish enemies from afar.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Tristana_0.jpg"
            ),
            Champion(
                96,
                "Trundle",
                "The Troll King",
                "Trundle is a formidable troll warrior who uses his brute strength to overpower foes and claim their power.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Trundle_0.jpg"
            ),
            Champion(
                97,
                "Tryndamere",
                "The Barbarian King",
                "Tryndamere is a relentless warrior who fights for his love and vengeance, wielding his sword with unmatched fury.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Tryndamere_0.jpg"
            ),
            Champion(
                98,
                "Twisted Fate",
                "The Card Master",
                "Twisted Fate is a cunning gambler who uses magical cards to control fate and turn the tides of battle.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/TwistedFate_0.jpg"
            ),
            Champion(
                99,
                "Udyr",
                "The Spirit Walker",
                "Udyr is a champion who channels the power of animal spirits, using their strength in combat to protect the balance of nature.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Udyr_0.jpg"
            ),
            Champion(
                100,
                "Vayne",
                "The Night Hunter",
                "Vayne is a master of the hunt, a relentless predator who seeks vengeance against the darkness that took her family.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Vayne_0.jpg"
            ),
            Champion(
                101,
                "Veigar",
                "The Tiny Master of Evil",
                "Veigar is a diminutive sorcerer who wields dark magic with the ambition to conquer and prove himself the greatest of all.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Veigar_0.jpg"
            ),
            Champion(
                102,
                "Viktor",
                "The Machine Herald",
                "Viktor is a brilliant inventor who strives to bring progress through technology, wielding it as both weapon and tool.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Viktor_0.jpg"
            ),
            Champion(
                103,
                "Vayne",
                "The Night Hunter",
                "Vayne is a master of the hunt, a relentless predator who seeks vengeance against the darkness that took her family.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Vayne_0.jpg"
            ),
            Champion(
                104,
                "Volibear",
                "The Relentless Storm",
                "Volibear is a massive bear spirit who embodies the ferocity of the storm, fighting to protect the natural order.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Volibear_0.jpg"
            ),
            Champion(
                105,
                "Warwick",
                "The Uncaged Wrath of Zaun",
                "Warwick is a fearsome predator who hunts down criminals and wrongdoers, driven by his thirst for vengeance.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Warwick_0.jpg"
            ),
            Champion(
                106,
                "Wukong",
                "The Monkey King",
                "Wukong is a trickster and fighter who uses agility and deception to outwit foes in battle.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Wukong_0.jpg"
            ),
            Champion(
                107,
                "Xayah",
                "The Rebel",
                "Xayah is a fierce warrior who fights for freedom, wielding blades that can slice through the fabric of reality.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Xayah_0.jpg"
            ),
            Champion(
                108,
                "Zac",
                "The Secret Weapon",
                "Zac is a gooey mass of green substance that can stretch and reform at will, using his elasticity to engage foes.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Zac_0.jpg"
            ),
            Champion(
                109,
                "Zed",
                "The Master of Shadows",
                "Zed is a lethal assassin who uses the shadows to teleport and eliminate enemies, embracing the dark arts.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Zed_0.jpg"
            ),
            Champion(
                110,
                "Zeri",
                "The Spark of Zaun",
                "Zeri is a speedster from Zaun who zips around the battlefield, using her electric powers to outpace and defeat enemies.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Zeri_0.jpg"
            ),
            Champion(
                111,
                "Zyra",
                "The Rise of the Thorn",
                "Zyra is a plant mage who uses nature’s fury to ensnare and overwhelm her enemies with vicious plants.",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Zyra_0.jpg"
            )

        )
    }

    companion object {
        // Instancia única del repositorio
        @Volatile
        private var instance: ChampionsRepository? = null

        // Método para obtener la instancia de manera segura
        fun getInstance(): ChampionsRepository {
            return instance ?: synchronized(this) {
                instance ?: InMemoryChampionsRepository().also { instance = it }
            }
        }
    }
}