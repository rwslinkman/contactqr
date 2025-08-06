package nl.rwslinkman.contactqr

object SampleVCardData {
    val sample0 = "BEGIN:VCARD\n" +
            "VERSION:2.1\n" +
            "N:LastName;FirstName;;;\n" +
            "FN:FirstName LastName\n" +
            "TEL;CELL:+31600000000\n" +
            "EMAIL;HOME:personal@mail.com\n" +
            "EMAIL;WORK:work@mail.com\n" +
            "URL:https://mysite.com\n" +
            "END:VCARD"
    val sample1 = "BEGIN:VCARD\n" +
            "VERSION:3.0\n" +
            "FN:Pikachu\n" +
            "N:Chu;Pika;;;\n" +
            "EMAIL;TYPE=INTERNET:pikachu@kanto.pkmn\n" +
            "TEL;TYPE=CELL:+81-90-1234-5678\n" +
            "BDAY:1996-02-27\n" +
            "ORG:Team Ash\n" +
            "URL:https://pokeapi.co/api/v2/pokemon/pikachu\n" +
            "END:VCARD\n"
    val sample2 = "BEGIN:VCARD\n" +
            "VERSION:3.0\n" +
            "FN:Charmander\n" +
            "N:Mander;Char;;;\n" +
            "TEL;TYPE=HOME:+81-45-6789-1234\n" +
            "EMAIL;TYPE=INTERNET:flameboy@pokemon.org\n" +
            "ADR;TYPE=HOME:;;123 Fire St;Cinnabar;Volcano;00999;Kanto\n" +
            "END:VCARD\n"
    val sample3 = "BEGIN:VCARD\n" +
            "VERSION:3.0\n" +
            "FN:Bulbasaur\n" +
            "N:Saur;Bulba;;;\n" +
            "TEL;TYPE=WORK:+81-70-5555-4444\n" +
            "EMAIL:plantpower@pkmn.net\n" +
            "ORG:Verdant Roots Inc.\n" +
            "URL:https://pokeapi.co/api/v2/pokemon/bulbasaur\n" +
            "END:VCARD\n"
    val sample4 = "BEGIN:VCARD\n" +
            "VERSION:3.0\n" +
            "FN:Squirtle\n" +
            "N:Tle;Squir;;;\n" +
            "TEL;TYPE=CELL:+81-80-9999-3333\n" +
            "EMAIL:shellshock@aqua.org\n" +
            "NICKNAME:Squirty\n" +
            "BDAY:1997-03-01\n" +
            "END:VCARD\n"
    val sample5 = "BEGIN:VCARD\n" +
            "VERSION:3.0\n" +
            "FN:Jigglypuff\n" +
            "N:Puff;Jiggly;;;\n" +
            "EMAIL:singer@kanto.tv\n" +
            "TEL;TYPE=VOICE:+81-75-1111-8888\n" +
            "TITLE:Pop Idol\n" +
            "NOTE:Has a tendency to make people fall asleep.\n" +
            "END:VCARD\n"
    val sample6 = "BEGIN:VCARD\n" +
            "VERSION:3.0\n" +
            "FN:Meowth\n" +
            "N:Meowth;;;Team Rocket\n" +
            "EMAIL:talkingcat@teamrocket.biz\n" +
            "ORG:Team Rocket\n" +
            "ROLE:Field Agent\n" +
            "URL:https://pokeapi.co/api/v2/pokemon/meowth\n" +
            "END:VCARD\n"
    val sample7 = "BEGIN:VCARD\n" +
            "VERSION:3.0\n" +
            "FN:Psyduck\n" +
            "N:Duck;Psy;;;\n" +
            "TEL;TYPE=WORK:+81-90-5555-1212\n" +
            "EMAIL:headache@pond.org\n" +
            "BDAY:1995-06-30\n" +
            "END:VCARD\n"
    val sample8 = "BEGIN:VCARD\n" +
            "VERSION:3.0\n" +
            "FN:Eevee\n" +
            "N:Eevee;;;; \n" +
            "EMAIL:evolve@pkmn.net\n" +
            "URL:https://pokeapi.co/api/v2/pokemon/eevee\n" +
            "NOTE:Can evolve into many forms.\n" +
            "END:VCARD\n"
    val sample9 = "BEGIN:VCARD\n" +
            "VERSION:3.0\n" +
            "FN:Snorlax\n" +
            "N:Lax;Snor;;;\n" +
            "EMAIL:sleepmaster@pkmn.com\n" +
            "TEL:+81-99-7777-6666\n" +
            "ADR:;;456 Nap Lane;Snooze City;;88888;Kanto\n" +
            "NOTE:Loves to sleep and eat.\n" +
            "END:VCARD\n"
    val sample10 = "BEGIN:VCARD\n" +
            "VERSION:3.0\n" +
            "FN:Lapras\n" +
            "N:Lapras;;; \n" +
            "EMAIL:cruiser@waterway.pkmn\n" +
            "TEL:+81-44-5555-0000\n" +
            "ORG:Ocean Transport Services\n" +
            "ROLE:Ferry Pokémon\n" +
            "URL:https://pokeapi.co/api/v2/pokemon/lapras\n" +
            "END:VCARD\n"
    val sample11 = "BEGIN:VCARD\n" +
            "VERSION:3.0\n" +
            "FN:Pikachu\n" +
            "N:Pikachu;;;;\n" +
            "TEL;TYPE=HOME:555-1122\n" +
            "TEL;TYPE=CELL:555-3344\n" +
            "EMAIL;TYPE=INTERNET:thunderbolt@poke-mail.com\n" +
            "EMAIL;TYPE=WORK:pika.work@pokecompany.com\n" +
            "ORG:Electric Rodents Inc.\n" +
            "END:VCARD\n"
    val sample12 = "BEGIN:VCARD\n" +
            "VERSION:3.0\n" +
            "FN:Meowth\n" +
            "N:Meowth;;;;\n" +
            "TEL;TYPE=HOME:555-6666\n" +
            "TEL;TYPE=WORK:555-7777\n" +
            "EMAIL;TYPE=INTERNET:scratchmaster@poke-mail.com\n" +
            "EMAIL;TYPE=OTHER:meow@teamrocket.pkm\n" +
            "ORG:Team Rocket\n" +
            "TITLE:Treasurer\n" +
            "END:VCARD\n"
    val sample13 = "BEGIN:VCARD\n" +
            "VERSION:3.0\n" +
            "FN:Eevee\n" +
            "N:Eevee;;;;\n" +
            "TEL;TYPE=MOBILE:555-9999\n" +
            "TEL;TYPE=MAIN:555-0000\n" +
            "EMAIL;TYPE=HOME:eevee@evolutions.net\n" +
            "EMAIL;TYPE=WORK:evolve@poke-evo.com\n" +
            "ORG:Evolutions Unlimited\n" +
            "NOTE:Can evolve into many forms\n" +
            "END:VCARD\n"
    val sample14 = "BEGIN:VCARD\n" +
            "VERSION:3.0\n" +
            "FN:Lucario\n" +
            "N:Lucario;;;;\n" +
            "TEL;TYPE=CELL:555-8989\n" +
            "TEL;TYPE=WORK:555-2323\n" +
            "TEL;TYPE=HOME:555-4545\n" +
            "EMAIL:lucario@aura-warrior.com\n" +
            "EMAIL;TYPE=ALT:aura@fightingdojo.com\n" +
            "ORG:Aura Masters Guild\n" +
            "TITLE:Aura Instructor\n" +
            "END:VCARD\n"
    val sample15 = "BEGIN:VCARD\n" +
            "VERSION:3.0\n" +
            "FN:Jigglypuff\n" +
            "N:Jigglypuff;;;;\n" +
            "TEL;TYPE=VOICE:555-2233\n" +
            "TEL;TYPE=CELL:555-3344\n" +
            "TEL;TYPE=HOME:555-7788\n" +
            "EMAIL:sing2sleep@poke-mail.com\n" +
            "EMAIL;TYPE=WORK:jiggly@concerts.com\n" +
            "EMAIL;TYPE=OTHER:balloonvoice@stage.pkm\n" +
            "ORG:Sleep Concerts Inc.\n" +
            "TITLE:Lead Vocalist\n" +
            "END:VCARD\n"
    val sample16 = "BEGIN:VCARD\n" +
            "VERSION:2.1\n" +
            "N:Gengar\n" +
            "FN:Gengar\n" +
            "TEL;HOME;VOICE:555-6666\n" +
            "TEL;CELL:555-9999\n" +
            "EMAIL;INTERNET:gengar@hauntmail.com\n" +
            "EMAIL:ghosty@spooknet.pkm\n" +
            "ADR;HOME:;;Shadow Alley 13;Lavender Town;;00013;Kanto\n" +
            "ORG:Ghost Guild\n" +
            "TITLE:Master of Shadows\n" +
            "NOTE:Always smiling. Often creepy.\n" +
            "END:VCARD\n"
    val sample17 = "BEGIN:VCARD\n" +
            "VERSION:2.1\n" +
            "N:Snorlax\n" +
            "FN:Snorlax\n" +
            "TEL;VOICE:555-1212\n" +
            "EMAIL;PREF:snorlax@snoozemail.com\n" +
            "EMAIL:zzz@bedtime.org\n" +
            "ADR;WORK:;;Route 12;Kanto;;00112;Pokemon World\n" +
            "ORG:Sleep Enthusiasts Club\n" +
            "TITLE:Professional Napper\n" +
            "NOTE:Will not move unless fed\n" +
            "END:VCARD\n"
    val sample18 = "BEGIN:VCARD\n" +
            "VERSION:2.1\n" +
            "N:Bulbasaur\n" +
            "FN:Bulbasaur\n" +
            "TEL;HOME:555-4422\n" +
            "EMAIL:bulba@plantmail.com\n" +
            "EMAIL;WORK:bulbasaur@pokeplants.net\n" +
            "ADR;HOME:;;Verdant Forest;Pallet Town;;00223;Kanto\n" +
            "ORG:PokePlants Nursery\n" +
            "TITLE:Assistant Gardener\n" +
            "NOTE:Loves sunlight and water\n" +
            "END:VCARD\n"
    val sample19 = "BEGIN:VCARD\n" +
            "VERSION:2.1\n" +
            "N:Gyarados\n" +
            "FN:Gyarados\n" +
            "TEL;WORK:555-7834\n" +
            "TEL;CELL:555-2211\n" +
            "EMAIL:rage@sea-serpent.io\n" +
            "EMAIL:gyarados@watermail.com\n" +
            "ADR:;;Ocean Depths 4;Seafoam Islands;;00888;Kanto\n" +
            "ORG:Raging Waters Inc.\n" +
            "TITLE:Sea Guardian\n" +
            "NOTE:Do not make angry\n" +
            "END:VCARD\n"
    val sample20 = "BEGIN:VCARD\n" +
            "VERSION:2.1\n" +
            "N:Alakazam\n" +
            "FN:Alakazam\n" +
            "TEL;WORK;VOICE:555-4444\n" +
            "TEL;CELL:555-9876\n" +
            "EMAIL;INTERNET:alakazam@psychicmail.com\n" +
            "EMAIL:mind@telepathy.pkm\n" +
            "ADR:;;Mind Street 42;Saffron City;;00342;Kanto\n" +
            "ORG:PokePsychics Co.\n" +
            "TITLE:Chief Telepath\n" +
            "NOTE:Carries two spoons at all times\n" +
            "END:VCARD\n"
    val sample21 = "BEGIN:VCARD\n" +
            "VERSION:3.0\n" +
            "N:Slinkman;Rick;;;\n" +
            "FN:Rick Slinkman\n" +
            "ORG:Moddit\n" +
            "TEL:+31123456789\n" +
            "EMAIL:rick@example.com\n" +
            "END:VCARD"
    val allSamples = listOf(
        sample0,
        sample1,
        sample2,
        sample3,
        sample4,
        sample5,
        sample6,
        sample7,
        sample8,
        sample9,
        sample10,
        sample11,
        sample12,
        sample13,
        sample14,
        sample15,
        sample16,
        sample17,
        sample18,
        sample19,
        sample20,
        sample21,
    )

    fun randomSample(): String = allSamples.random()
}