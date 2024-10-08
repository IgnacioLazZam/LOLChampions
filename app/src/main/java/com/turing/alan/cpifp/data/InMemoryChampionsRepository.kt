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