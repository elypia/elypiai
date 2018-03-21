package com.elypia.elypiai.test;

import com.elypia.elypiai.pathofexile.*;
import com.elypia.elypiai.pathofexile.data.*;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PathOfExileTest {

    @Test
    public void pathOfExile() {
        PathOfExile poe = new PathOfExile();
        assertNotNull(poe);
        assertNull(poe.getStashTabs());
    }

    @Test
    public void parseSinglePublicStash() {
        String json = "{\"id\":\"6e744b0f76179835e1f681ce81c513ea190cb021b34eaacafe4c3d4f6990395f\",\"public\":true,\"accountName\":\"5a4oK\",\"lastCharacterName\":\"temniypoputchik_Oni\",\"stash\":\"What i need\",\"stashType\":\"PremiumStash\",\"items\":[{\"verified\":false,\"w\":2,\"h\":4,\"ilvl\":71,\"icon\":\"http://web.poecdn.com/image/Art/2DItems/Weapons/TwoHandWeapons/Bows/SarkhamsReach.png?scale=1&scaleIndex=0&w=2&h=4&v=f333c2e4005ee20a84270731baa5fa6a\",\"league\":\"Hardcore\",\"id\":\"176b5e6f7af0a5bb4b48d7fdafa47501a179f4ea095815a58c82c4b5244b3cdb\",\"sockets\":[{\"group\":0,\"attr\":\"D\",\"sColour\":\"G\"}],\"name\":\"<<set:MS>><<set:M>><<set:S>>Roth's Reach\",\"typeLine\":\"Recurve Bow\",\"identified\":true,\"note\":\"~price 10 exa\",\"properties\":[{\"name\":\"Bow\",\"values\":[],\"displayMode\":0},{\"name\":\"Quality\",\"values\":[[\"+17%\",1]],\"displayMode\":0,\"type\":6},{\"name\":\"Physical Damage\",\"values\":[[\"20-63\",1]],\"displayMode\":0,\"type\":9},{\"name\":\"Critical Strike Chance\",\"values\":[[\"6.50%\",0]],\"displayMode\":0,\"type\":12},{\"name\":\"Attacks per Second\",\"values\":[[\"1.31\",1]],\"displayMode\":0,\"type\":13}],\"requirements\":[{\"name\":\"Level\",\"values\":[[\"18\",0]],\"displayMode\":0},{\"name\":\"Dex\",\"values\":[[\"65\",0]],\"displayMode\":1}],\"explicitMods\":[\"68% increased Physical Damage\",\"5% increased Attack Speed\",\"Skills Chain +1 times\",\"30% increased Projectile Speed\",\"34% increased Elemental Damage with Attack Skills\"],\"flavourText\":[\"\\\"Exiled to the sea; what a joke. \\r\",\"I'm more free than I've ever been.\\\"\\r\",\"- Captain Weylam \\\"Rot-tooth\\\" Roth of the Black Crest\"],\"frameType\":3,\"category\":{\"weapons\":[\"bow\"]},\"x\":10,\"y\":0,\"inventoryId\":\"Stash1\",\"socketedItems\":[]},{\"verified\":false,\"w\":1,\"h\":1,\"ilvl\":0,\"icon\":\"http://web.poecdn.com/image/Art/2DItems/Gems/LeapSlam.png?scale=1&scaleIndex=0&w=1&h=1&v=73d0b5f9f1c52f0e0e87f74a80a549ab\",\"support\":false,\"league\":\"Hardcore\",\"id\":\"8d84024bd2f99bd467b671e6915bc999f6e26f512c7f7034f54ff182781198e6\",\"name\":\"\",\"typeLine\":\"Leap Slam\",\"identified\":true,\"properties\":[{\"name\":\"Attack, AoE, Movement, Melee\",\"values\":[],\"displayMode\":0},{\"name\":\"Level\",\"values\":[[\"1\",0]],\"displayMode\":0,\"type\":5},{\"name\":\"Mana Cost\",\"values\":[[\"15\",0]],\"displayMode\":0}],\"additionalProperties\":[{\"name\":\"Experience\",\"values\":[[\"9569/9569\",0]],\"displayMode\":2,\"progress\":1,\"type\":20}],\"requirements\":[{\"name\":\"Level\",\"values\":[[\"10\",0]],\"displayMode\":0},{\"name\":\"Str\",\"values\":[[\"29\",0]],\"displayMode\":1}],\"nextLevelRequirements\":[{\"name\":\"Level\",\"values\":[[\"13\",0]],\"displayMode\":0},{\"name\":\"Str\",\"values\":[[\"35\",0]],\"displayMode\":1}],\"secDescrText\":\"Jump into the air, damaging enemies (and knocking back some) with your main hand where you land. Enemies you would land on are pushed out of the way. Requires an axe, mace, sword or staff. Cannot be supported by Multistrike.\",\"explicitMods\":[\"20% chance to Knock Enemies Back on hit\"],\"descrText\":\"Place into an item socket of the right colour to gain this skill. Right click to remove from a socket.\",\"frameType\":4,\"category\":{\"gems\":[\"activegem\"]},\"x\":0,\"y\":1,\"inventoryId\":\"Stash2\"},{\"verified\":false,\"w\":1,\"h\":1,\"ilvl\":1,\"icon\":\"http://web.poecdn.com/image/Art/2DItems/Jewels/HighQuestRewardRed.png?scale=1&scaleIndex=0&w=1&h=1&v=fcfea32513c2b1566a61fddfd1c341c9\",\"league\":\"Hardcore\",\"id\":\"d9503c22d6a753bed25ee06b63e8b17ad5f898cc7266a6eccebe6f993ee8944f\",\"name\":\"<<set:MS>><<set:M>><<set:S>>Conqueror's Efficiency\",\"typeLine\":\"Crimson Jewel\",\"identified\":true,\"properties\":[{\"name\":\"Limited to\",\"values\":[[\"1\",0]],\"displayMode\":0}],\"explicitMods\":[\"3% reduced Mana Cost of Skills\",\"4% increased Skill Effect Duration\",\"2% reduced Mana Reserved\"],\"descrText\":\"Place into an allocated Jewel Socket on the Passive Skill Tree. Right click to remove from the Socket.\",\"flavourText\":[\"The stone may yet bleed.\"],\"frameType\":3,\"category\":{\"jewels\":[]},\"x\":11,\"y\":5,\"inventoryId\":\"Stash3\"},{\"verified\":false,\"w\":1,\"h\":1,\"ilvl\":73,\"icon\":\"http://web.poecdn.com/image/Art/2DItems/Amulets/TurquoiseAmulet.png?scale=1&scaleIndex=0&w=1&h=1&v=484a8eac4316c65308deea4efcfbb621\",\"league\":\"Hardcore\",\"id\":\"358da932979a1121115fd923e0d57fd9fb7f179ddca77a7abfe6e1d767034924\",\"name\":\"<<set:MS>><<set:M>><<set:S>>Soul Beads\",\"typeLine\":\"Turquoise Amulet\",\"identified\":true,\"requirements\":[{\"name\":\"Level\",\"values\":[[\"57\",0]],\"displayMode\":0}],\"implicitMods\":[\"+18 to Dexterity and Intelligence\"],\"explicitMods\":[\"11% increased Spell Damage\",\"Adds 18 to 31 Fire Damage to Attacks\",\"37% increased Global Critical Strike Chance\",\"+25 to maximum Mana\",\"+27% to Fire Resistance\",\"+23% to Cold Resistance\"],\"frameType\":2,\"category\":{\"accessories\":[\"amulet\"]},\"x\":0,\"y\":0,\"inventoryId\":\"Stash4\"},{\"verified\":false,\"w\":1,\"h\":1,\"ilvl\":0,\"icon\":\"http://web.poecdn.com/image/Art/2DItems/Gems/Support/IncreasedDuration.png?scale=1&scaleIndex=0&w=1&h=1&v=14b3a91933f0b921d1b573358e31f768\",\"support\":true,\"league\":\"Hardcore\",\"id\":\"2ce90c7a129f83de3406769e8b9e09763be5e5ad4311bf475cf5d4375831f705\",\"name\":\"\",\"typeLine\":\"Increased Duration Support\",\"identified\":true,\"properties\":[{\"name\":\"Support, Duration\",\"values\":[],\"displayMode\":0},{\"name\":\"Level\",\"values\":[[\"1\",0]],\"displayMode\":0,\"type\":5},{\"name\":\"Mana Multiplier\",\"values\":[[\"140%\",0]],\"displayMode\":0}],\"additionalProperties\":[{\"name\":\"Experience\",\"values\":[[\"1/285815\",0]],\"displayMode\":2,\"progress\":0.0000034987667731911642,\"type\":20}],\"requirements\":[{\"name\":\"Level\",\"values\":[[\"31\",0]],\"displayMode\":0},{\"name\":\"Str\",\"values\":[[\"52\",0]],\"displayMode\":1}],\"secDescrText\":\"Supports any skill with a duration.\",\"explicitMods\":[\"Supported Skills have 45% increased Skill Effect Duration\"],\"descrText\":\"This is a Support Gem. It does not grant a bonus to your character, but to skills in sockets connected to it. Place into an item socket connected to a socket containing the Active Skill Gem you wish to augment. Right click to remove from a socket.\",\"frameType\":4,\"category\":{\"gems\":[\"supportgem\"]},\"x\":0,\"y\":2,\"inventoryId\":\"Stash5\"},{\"verified\":false,\"w\":1,\"h\":2,\"ilvl\":71,\"icon\":\"http://web.poecdn.com/gen/image/YTo3OntzOjEwOiJsZWFn/dWVOYW1lIjtzOjg6Ikhh/cmRjb3JlIjtzOjk6ImFj/Y291bnRJZCI7TzoxODoi/R3JpbmRiXERhdGFiYXNl/XElkIjoxOntzOjI6Imlk/IjtpOjA7fXM6MTA6InNp/bXBsaWZpZWQiO2I6MTtz/OjEzOiJpbnZlbnRvcnlU/eXBlIjtpOjE7aToyO2E6/Mzp7czoxOiJmIjtzOjMz/OiJBcnQvMkRJdGVtcy9G/bGFza3MvZXZhc2lvbmZs/YXNrMDEiO3M6Mjoic3Ai/O2Q6MC42MDg1MTkyNjk3/NzY4NzYzO3M6NToibGV2/ZWwiO2k6MDt9aToxO2k6/NDtpOjA7aTo5O30,/4fe6746e52/Item.png\",\"league\":\"Hardcore\",\"id\":\"bcd6e8fa61888422a1faed414577030569395da4290012e1bbe54b017071011b\",\"name\":\"\",\"typeLine\":\"Jade Flask\",\"identified\":true,\"properties\":[{\"name\":\"Lasts %0 Seconds\",\"values\":[[\"4.00\",0]],\"displayMode\":3},{\"name\":\"Consumes %0 of %1 Charges on use\",\"values\":[[\"30\",0],[\"60\",0]],\"displayMode\":3},{\"name\":\"Currently has %0 Charges\",\"values\":[[\"0\",0]],\"displayMode\":3}],\"requirements\":[{\"name\":\"Level\",\"values\":[[\"27\",0]],\"displayMode\":0}],\"utilityMods\":[\"+3000 to Evasion Rating\"],\"descrText\":\"Right click to drink. Can only hold charges while in belt. Refills as you kill monsters.\",\"frameType\":0,\"category\":{\"flasks\":[]},\"x\":10,\"y\":8,\"inventoryId\":\"Stash6\"},{\"verified\":false,\"w\":1,\"h\":2,\"ilvl\":62,\"icon\":\"http://web.poecdn.com/gen/image/YTo3OntzOjEwOiJsZWFn/dWVOYW1lIjtzOjg6Ikhh/cmRjb3JlIjtzOjk6ImFj/Y291bnRJZCI7TzoxODoi/R3JpbmRiXERhdGFiYXNl/XElkIjoxOntzOjI6Imlk/IjtpOjA7fXM6MTA6InNp/bXBsaWZpZWQiO2I6MTtz/OjEzOiJpbnZlbnRvcnlU/eXBlIjtpOjE7aToyO2E6/Mzp7czoxOiJmIjtzOjMw/OiJBcnQvMkRJdGVtcy9G/bGFza3MvbGlmZWZsYXNr/MTAiO3M6Mjoic3AiO2Q6/MC42MDg1MTkyNjk3NzY4/NzYzO3M6NToibGV2ZWwi/O2k6MDt9aToxO2k6NDtp/OjA7aTo5O30,/a62e5c5492/Item.png\",\"league\":\"Hardcore\",\"id\":\"5e968f419af74b6c673927fd0f083ab3599573d2879d1f6e9c27085a761ea9fa\",\"name\":\"\",\"typeLine\":\"<<set:MS>><<set:M>><<set:S>>Cautious Divine Life Flask of Warding\",\"identified\":true,\"properties\":[{\"name\":\"Quality\",\"values\":[[\"+20%\",1]],\"displayMode\":0,\"type\":6},{\"name\":\"Recovers %0 Life over %1 Seconds\",\"values\":[[\"2880\",1],[\"7.00\",0]],\"displayMode\":3},{\"name\":\"Consumes %0 of %1 Charges on use\",\"values\":[[\"15\",0],[\"45\",0]],\"displayMode\":3},{\"name\":\"Currently has %0 Charges\",\"values\":[[\"0\",0]],\"displayMode\":3}],\"requirements\":[{\"name\":\"Level\",\"values\":[[\"60\",0]],\"displayMode\":0}],\"explicitMods\":[\"100% increased Recovery when on Low Life\",\"Immune to Curses during Flask effect\\nRemoves Curses on use\"],\"descrText\":\"Right click to drink. Can only hold charges while in belt. Refills as you kill monsters.\",\"frameType\":1,\"category\":{\"flasks\":[]},\"x\":11,\"y\":6,\"inventoryId\":\"Stash7\"},{\"verified\":false,\"w\":1,\"h\":1,\"ilvl\":72,\"icon\":\"http://web.poecdn.com/image/Art/2DItems/Amulets/TurquoiseAmulet.png?scale=1&scaleIndex=0&w=1&h=1&v=484a8eac4316c65308deea4efcfbb621\",\"league\":\"Hardcore\",\"id\":\"ec668472eadc44c1cbca519d5f1b085cc68adda7aaa1440511d6724b699d3506\",\"name\":\"<<set:MS>><<set:M>><<set:S>>Pandemonium Beads\",\"typeLine\":\"Turquoise Amulet\",\"identified\":true,\"requirements\":[{\"name\":\"Level\",\"values\":[[\"57\",0]],\"displayMode\":0}],\"implicitMods\":[\"+18 to Dexterity and Intelligence\"],\"explicitMods\":[\"20% increased Spell Damage\",\"+11 to all Attributes\",\"+32 to maximum Life\",\"+43% to Cold Resistance\"],\"frameType\":2,\"category\":{\"accessories\":[\"amulet\"]},\"x\":0,\"y\":7,\"inventoryId\":\"Stash8\"},{\"verified\":false,\"w\":1,\"h\":1,\"ilvl\":0,\"icon\":\"http://web.poecdn.com/image/Art/2DItems/Gems/ImmortalCall.png?scale=1&scaleIndex=0&w=1&h=1&v=3843ced383e5dca18e076e57e9f67819\",\"support\":false,\"league\":\"Hardcore\",\"id\":\"c4a85d530351912d143119656fb542bf9408457f2329bb8dfeb32a00f49866bf\",\"name\":\"\",\"typeLine\":\"Immortal Call\",\"identified\":true,\"properties\":[{\"name\":\"Spell, Duration\",\"values\":[],\"displayMode\":0},{\"name\":\"Level\",\"values\":[[\"1\",0]],\"displayMode\":0,\"type\":5},{\"name\":\"Mana Cost\",\"values\":[[\"21\",0]],\"displayMode\":0},{\"name\":\"Cooldown Time\",\"values\":[[\"3.00 sec\",0]],\"displayMode\":0},{\"name\":\"Cast Time\",\"values\":[[\"0.85 sec\",0]],\"displayMode\":0}],\"additionalProperties\":[{\"name\":\"Experience\",\"values\":[[\"1/252595\",0]],\"displayMode\":2,\"progress\":0.0000039589067455381155,\"type\":20}],\"requirements\":[{\"name\":\"Level\",\"values\":[[\"34\",0]],\"displayMode\":0},{\"name\":\"Str\",\"values\":[[\"79\",0]],\"displayMode\":1}],\"secDescrText\":\"Discharges Endurance Charges, making the character invulnerable to physical damage for a short time, proportional to how many endurance charges were expended.\",\"explicitMods\":[\"Base duration is 0.40 seconds\",\"100% increased Buff Duration per Endurance Charge\"],\"descrText\":\"Place into an item socket of the right colour to gain this skill. Right click to remove from a socket.\",\"frameType\":4,\"category\":{\"gems\":[\"activegem\"]},\"x\":0,\"y\":6,\"inventoryId\":\"Stash9\"},{\"verified\":false,\"w\":1,\"h\":1,\"ilvl\":0,\"icon\":\"http://web.poecdn.com/image/Art/2DItems/Gems/HeraldofIce.png?scale=1&scaleIndex=0&w=1&h=1&v=098e32bf010edc365f1ec453f3477bc7\",\"support\":false,\"league\":\"Hardcore\",\"id\":\"3431d653f0728e1c58db7a2f1cfee5191b5534bb8883b752e487e1cd4949a9a7\",\"name\":\"\",\"typeLine\":\"Herald of Ice\",\"identified\":true,\"properties\":[{\"name\":\"Spell, AoE, Cold, Herald\",\"values\":[],\"displayMode\":0},{\"name\":\"Level\",\"values\":[[\"1\",0]],\"displayMode\":0,\"type\":5},{\"name\":\"Mana Reserved\",\"values\":[[\"25%\",0]],\"displayMode\":0},{\"name\":\"Cooldown Time\",\"values\":[[\"1.00 sec\",0]],\"displayMode\":0},{\"name\":\"Cast Time\",\"values\":[[\"1.00 sec\",0]],\"displayMode\":0},{\"name\":\"Effectiveness of Added Damage\",\"values\":[[\"80%\",0]],\"displayMode\":0}],\"additionalProperties\":[{\"name\":\"Experience\",\"values\":[[\"1/49725\",0]],\"displayMode\":2,\"progress\":0.00002011060860240832,\"type\":20}],\"requirements\":[{\"name\":\"Level\",\"values\":[[\"16\",0]],\"displayMode\":0},{\"name\":\"Dex\",\"values\":[[\"26\",0]],\"displayMode\":1},{\"name\":\"Int\",\"values\":[[\"18\",0]],\"displayMode\":1}],\"secDescrText\":\"Channel ice through your hands, adding cold damage to spells and attacks. If you shatter an enemy, they explode and deal AoE cold damage to enemies near them. The AoE cold damage inflicted by this skill is not affected by modifiers to spell damage.\",\"explicitMods\":[\"Deals 18 to 26 Cold Damage\",\"Damage cannot be Reflected\",\"Adds 4 to 5 Cold Damage to Attacks\",\"Adds 4 to 5 Cold Damage to Spells\"],\"descrText\":\"Place into an item socket of the right colour to gain this skill. Right click to remove from a socket.\",\"frameType\":4,\"category\":{\"gems\":[\"activegem\"]},\"x\":0,\"y\":5,\"inventoryId\":\"Stash10\"},{\"verified\":false,\"w\":1,\"h\":1,\"ilvl\":1,\"icon\":\"http://web.poecdn.com/image/Art/2DItems/Jewels/MidQuestRewardRed.png?scale=1&scaleIndex=0&w=1&h=1&v=aa8cbeb565cc7d9ea0c852f2889ab9d2\",\"league\":\"Hardcore\",\"id\":\"e768eb8f423f0ffc5cbf2e1e687f3e9f4289ff48565f2876b4a03033c3047c90\",\"name\":\"<<set:MS>><<set:M>><<set:S>>Warlord's Reach\",\"typeLine\":\"Crimson Jewel\",\"identified\":true,\"properties\":[{\"name\":\"Limited to\",\"values\":[[\"1\",0]],\"displayMode\":0}],\"explicitMods\":[\"8% increased Attack Damage\",\"+1 to Melee Weapon and Unarmed Attack range\"],\"descrText\":\"Place into an allocated Jewel Socket on the Passive Skill Tree. Right click to remove from the Socket.\",\"flavourText\":[\"A steady hand can hold back an army.\"],\"frameType\":3,\"category\":{\"jewels\":[]},\"x\":11,\"y\":4,\"inventoryId\":\"Stash11\"},{\"verified\":false,\"w\":1,\"h\":1,\"ilvl\":0,\"icon\":\"http://web.poecdn.com/image/Art/2DItems/Gems/Support/LifeLeech.png?scale=1&scaleIndex=0&w=1&h=1&v=a286b7cb68bee2319a14a80c1e4bcf9c\",\"support\":true,\"league\":\"Hardcore\",\"id\":\"27134d26d7bd46362435339f2be02f76b21ac4018cc72e6c5e9e4c83436df071\",\"name\":\"\",\"typeLine\":\"Life Leech Support\",\"identified\":true,\"properties\":[{\"name\":\"Support\",\"values\":[],\"displayMode\":0},{\"name\":\"Level\",\"values\":[[\"1\",0]],\"displayMode\":0,\"type\":5},{\"name\":\"Mana Multiplier\",\"values\":[[\"130%\",0]],\"displayMode\":0}],\"additionalProperties\":[{\"name\":\"Experience\",\"values\":[[\"1/285815\",0]],\"displayMode\":2,\"progress\":0.0000034987667731911642,\"type\":20}],\"requirements\":[{\"name\":\"Level\",\"values\":[[\"31\",0]],\"displayMode\":0},{\"name\":\"Str\",\"values\":[[\"52\",0]],\"displayMode\":1}],\"secDescrText\":\"Supports any skill that hits enemies, causing those hits to leech life based on damage dealt.\",\"explicitMods\":[\"Supported Skills have 2% of Damage Leeched as Life\"],\"descrText\":\"This is a Support Gem. It does not grant a bonus to your character, but to skills in sockets connected to it. Place into an item socket connected to a socket containing the Active Skill Gem you wish to augment. Right click to remove from a socket.\",\"frameType\":4,\"category\":{\"gems\":[\"supportgem\"]},\"x\":0,\"y\":3,\"inventoryId\":\"Stash12\"},{\"verified\":false,\"w\":1,\"h\":1,\"ilvl\":0,\"icon\":\"http://web.poecdn.com/image/Art/2DItems/Gems/SiphonGem.png?scale=1&scaleIndex=0&w=1&h=1&v=3c8bba854543b5f696b81cc6517dbcf7\",\"support\":false,\"league\":\"Hardcore\",\"id\":\"6261eb58d7cd12acc4dc938f353ca7ba12f37a3d2bf494c7dbef6e7b24e9b226\",\"name\":\"\",\"typeLine\":\"Essence Drain\",\"identified\":true,\"properties\":[{\"name\":\"Projectile, Spell, Duration, Chaos\",\"values\":[],\"displayMode\":0},{\"name\":\"Level\",\"values\":[[\"1\",0]],\"displayMode\":0,\"type\":5},{\"name\":\"Mana Cost\",\"values\":[[\"9\",0]],\"displayMode\":0},{\"name\":\"Cast Time\",\"values\":[[\"0.75 sec\",0]],\"displayMode\":0},{\"name\":\"Critical Strike Chance\",\"values\":[[\"5.00%\",0]],\"displayMode\":0},{\"name\":\"Effectiveness of Added Damage\",\"values\":[[\"60%\",0]],\"displayMode\":0}],\"additionalProperties\":[{\"name\":\"Experience\",\"values\":[[\"1/15249\",0]],\"displayMode\":2,\"progress\":0.00006557806773344055,\"type\":20}],\"requirements\":[{\"name\":\"Level\",\"values\":[[\"12\",0]],\"displayMode\":0},{\"name\":\"Dex\",\"values\":[[\"14\",0]],\"displayMode\":1},{\"name\":\"Int\",\"values\":[[\"21\",0]],\"displayMode\":1}],\"secDescrText\":\"Fires a projectile that applies a damage over time debuff when it hits. You are healed for a portion of the debuff damage. The debuff is spread by Contagion.\",\"explicitMods\":[\"Deals 6 to 9 Chaos Damage\",\"Deals 21.3 Base Chaos Damage per second\",\"Base duration is 3.80 seconds\",\"Modifiers to Spell Damage apply to this Skill's Damage Over Time effect\",\"Regenerate 0.50% of Debuff Damage as Life\"],\"descrText\":\"Place into an item socket of the right colour to gain this skill. Right click to remove from a socket.\",\"frameType\":4,\"category\":{\"gems\":[\"activegem\"]},\"x\":0,\"y\":4,\"inventoryId\":\"Stash13\"},{\"verified\":false,\"w\":1,\"h\":2,\"ilvl\":68,\"icon\":\"http://web.poecdn.com/gen/image/YTo3OntzOjEwOiJsZWFn/dWVOYW1lIjtzOjg6Ikhh/cmRjb3JlIjtzOjk6ImFj/Y291bnRJZCI7TzoxODoi/R3JpbmRiXERhdGFiYXNl/XElkIjoxOntzOjI6Imlk/IjtpOjA7fXM6MTA6InNp/bXBsaWZpZWQiO2I6MTtz/OjEzOiJpbnZlbnRvcnlU/eXBlIjtpOjE7aToyO2E6/Mzp7czoxOiJmIjtzOjMz/OiJBcnQvMkRJdGVtcy9G/bGFza3MvZXZhc2lvbmZs/YXNrMDEiO3M6Mjoic3Ai/O2Q6MC42MDg1MTkyNjk3/NzY4NzYzO3M6NToibGV2/ZWwiO2k6MDt9aToxO2k6/NDtpOjA7aTo5O30,/4fe6746e52/Item.png\",\"league\":\"Hardcore\",\"id\":\"dac306afc3a91e423e870c23aed8d944f38d29badd6c756645632a4e317bcbda\",\"name\":\"\",\"typeLine\":\"Jade Flask\",\"identified\":true,\"properties\":[{\"name\":\"Lasts %0 Seconds\",\"values\":[[\"4.00\",0]],\"displayMode\":3},{\"name\":\"Consumes %0 of %1 Charges on use\",\"values\":[[\"30\",0],[\"60\",0]],\"displayMode\":3},{\"name\":\"Currently has %0 Charges\",\"values\":[[\"0\",0]],\"displayMode\":3}],\"requirements\":[{\"name\":\"Level\",\"values\":[[\"27\",0]],\"displayMode\":0}],\"utilityMods\":[\"+3000 to Evasion Rating\"],\"descrText\":\"Right click to drink. Can only hold charges while in belt. Refills as you kill monsters.\",\"frameType\":0,\"category\":{\"flasks\":[]},\"x\":11,\"y\":8,\"inventoryId\":\"Stash14\"},{\"verified\":false,\"w\":1,\"h\":2,\"ilvl\":52,\"icon\":\"http://web.poecdn.com/gen/image/YTo3OntzOjEwOiJsZWFn/dWVOYW1lIjtzOjg6Ikhh/cmRjb3JlIjtzOjk6ImFj/Y291bnRJZCI7TzoxODoi/R3JpbmRiXERhdGFiYXNl/XElkIjoxOntzOjI6Imlk/IjtpOjA7fXM6MTA6InNp/bXBsaWZpZWQiO2I6MTtz/OjEzOiJpbnZlbnRvcnlU/eXBlIjtpOjE7aToyO2E6/Mzp7czoxOiJmIjtzOjI1/OiJBcnQvMkRJdGVtcy9G/bGFza3Mvc3ByaW50Ijtz/OjI6InNwIjtkOjAuNjA4/NTE5MjY5Nzc2ODc2Mztz/OjU6ImxldmVsIjtpOjA7/fWk6MTtpOjQ7aTowO2k6/OTt9/1ef1b1e6c2/Item.png\",\"league\":\"Hardcore\",\"id\":\"8bfb9fb7925e3a40b89bf52d7edd1257afe19db1b8527a13c80e00b2d338b99c\",\"name\":\"\",\"typeLine\":\"<<set:MS>><<set:M>><<set:S>>Surgeon's Quicksilver Flask of Adrenaline\",\"identified\":true,\"properties\":[{\"name\":\"Lasts %0 Seconds\",\"values\":[[\"4.00\",0]],\"displayMode\":3},{\"name\":\"Consumes %0 of %1 Charges on use\",\"values\":[[\"20\",0],[\"50\",0]],\"displayMode\":3},{\"name\":\"Currently has %0 Charges\",\"values\":[[\"0\",0]],\"displayMode\":3}],\"requirements\":[{\"name\":\"Level\",\"values\":[[\"6\",0]],\"displayMode\":0}],\"utilityMods\":[\"40% increased Movement Speed\"],\"explicitMods\":[\"20% chance to gain a Flask Charge when you deal a Critical Strike\",\"24% increased Movement Speed during Flask effect\"],\"descrText\":\"Right click to drink. Can only hold charges while in belt. Refills as you kill monsters.\",\"frameType\":1,\"category\":{\"flasks\":[]},\"x\":11,\"y\":10,\"inventoryId\":\"Stash15\"}]}";
        JSONObject object = new JSONObject(json);
        Stash stash = new Stash(null, object);

        assertAll("Ensure Parsing Result Data Correctly",
            () -> assertEquals("6e744b0f76179835e1f681ce81c513ea190cb021b34eaacafe4c3d4f6990395f", stash.getId()),
            () -> assertEquals(true, stash.isPublic()),
            () -> assertEquals("5a4oK", stash.getAccountName()),
            () -> assertEquals("temniypoputchik_Oni", stash.getLastCharacterName()),
            () -> assertEquals("What i need", stash.getName()),
            () -> assertEquals(StashType.PREMIUM_STASH, stash.getStashType()),
            () -> assertEquals(false, stash.getItems().isEmpty())
        );
    }

    @Test
    public void parseSingleStashItem() {
        String json = "{\"verified\":false,\"w\":2,\"h\":4,\"ilvl\":71,\"icon\":\"http://web.poecdn.com/image/Art/2DItems/Weapons/TwoHandWeapons/Bows/SarkhamsReach.png?scale=1&scaleIndex=0&w=2&h=4&v=f333c2e4005ee20a84270731baa5fa6a\",\"league\":\"Hardcore\",\"id\":\"176b5e6f7af0a5bb4b48d7fdafa47501a179f4ea095815a58c82c4b5244b3cdb\",\"sockets\":[{\"group\":0,\"attr\":\"D\",\"sColour\":\"G\"}],\"name\":\"<<set:MS>><<set:M>><<set:S>>Roth's Reach\",\"typeLine\":\"Recurve Bow\",\"identified\":true,\"note\":\"~price 10 exa\",\"properties\":[{\"name\":\"Bow\",\"values\":[],\"displayMode\":0},{\"name\":\"Quality\",\"values\":[[\"+17%\",1]],\"displayMode\":0,\"type\":6},{\"name\":\"Physical Damage\",\"values\":[[\"20-63\",1]],\"displayMode\":0,\"type\":9},{\"name\":\"Critical Strike Chance\",\"values\":[[\"6.50%\",0]],\"displayMode\":0,\"type\":12},{\"name\":\"Attacks per Second\",\"values\":[[\"1.31\",1]],\"displayMode\":0,\"type\":13}],\"requirements\":[{\"name\":\"Level\",\"values\":[[\"18\",0]],\"displayMode\":0},{\"name\":\"Dex\",\"values\":[[\"65\",0]],\"displayMode\":1}],\"explicitMods\":[\"68% increased Physical Damage\",\"5% increased Attack Speed\",\"Skills Chain +1 times\",\"30% increased Projectile Speed\",\"34% increased Elemental Damage with Attack Skills\"],\"flavourText\":[\"\\\"Exiled to the sea; what a joke. \\r\",\"I'm more free than I've ever been.\\\"\\r\",\"- Captain Weylam \\\"Rot-tooth\\\" Roth of the Black Crest\"],\"frameType\":3,\"category\":{\"weapons\":[\"bow\"]},\"x\":10,\"y\":0,\"inventoryId\":\"Stash1\",\"socketedItems\":[]}";
        JSONObject object = new JSONObject(json);
        StashItem item = new StashItem(null, object);

        assertAll("Ensure Parsing Result Data Correctly",
            () -> assertEquals(false, item.isVerified()),
            () -> assertEquals(2, item.getWidth()),
            () -> assertEquals(4, item.getHeight()),
            () -> assertEquals(71, item.getLevel()),
            () -> assertEquals("http://web.poecdn.com/image/Art/2DItems/Weapons/TwoHandWeapons/Bows/SarkhamsReach.png?scale=1&scaleIndex=0&w=2&h=4&v=f333c2e4005ee20a84270731baa5fa6a", item.getIcon()),
            () -> assertEquals("Hardcore", item.getLeague()),
            () -> assertEquals("176b5e6f7af0a5bb4b48d7fdafa47501a179f4ea095815a58c82c4b5244b3cdb", item.getId()),
            () -> assertEquals("Roth's Reach", item.getName()),
            () -> assertEquals("Recurve Bow", item.getTypeLine()),
            () -> assertEquals(true, item.isIdentified()),
            () -> assertEquals("~price 10 exa", item.getNote()),
            () -> assertEquals(3, item.getFrameType()),
            () -> assertEquals(10, item.getXPos()),
            () -> assertEquals(0, item.getYPos()),
            () -> assertEquals("Stash1", item.getInventoryId())
        );
    }

    @Test
    public void parseSingleLeague() {
        String json = "{\"id\":\"Hardcore\",\"description\":\"#LeagueHardcore\",\"registerAt\":null,\"event\":false,\"url\":\"http://pathofexile.com/forum/view-thread/71276\",\"startAt\":\"2013-01-23T21:00:00Z\",\"endAt\":null,\"rules\":[{\"id\":4,\"name\":\"Hardcore\",\"description\":\"A character killed in Hardcore is moved to its parent league.\"}]}";
        JSONObject object = new JSONObject(json);
        League league = new League(null, object);

        assertAll("Ensure Parsing Result Data Correctly",
            () -> assertEquals("Hardcore", league.getId()),
            () -> assertEquals("#LeagueHardcore", league.getDescription()),
            () -> assertEquals(null, league.getRegisterAt()),
            () -> assertEquals(false, league.isEvent()),
            () -> assertEquals("http://pathofexile.com/forum/view-thread/71276", league.getUrl()),
            () -> assertEquals("2013-01-23T21:00:00Z", league.getStartDate().toString()),
            () -> assertEquals(null, league.getEndDate()),
            () -> assertEquals(1, league.getRules().size())
        );
    }

    @Test
    public void parseSingleLeagueWithEndDate() {
        String json = "{\"id\":\"Jan30 3h Rush HC\",\"description\":\"A 3 hour hardcore ladder rush with prizes. See the forum for details.\",\"registerAt\":null,\"event\":false,\"url\":null,\"startAt\":\"2012-01-29T21:00:00Z\",\"endAt\":\"2012-01-30T00:00:00Z\",\"rules\":[{\"id\":4,\"name\":\"Hardcore\",\"description\":\"A character killed in Hardcore is moved to its parent league.\"}]}";
        JSONObject object = new JSONObject(json);

        League league = new League(null, object);
        assertAll("Ensure Parsing Result Data Correctly",
            () -> assertEquals("Jan30 3h Rush HC", league.getId()),
            () -> assertEquals("A 3 hour hardcore ladder rush with prizes. See the forum for details.", league.getDescription()),
            () -> assertEquals(null, league.getRegisterAt()),
            () -> assertEquals(false, league.isEvent()),
            () -> assertEquals(null, league.getUrl()),
            () -> assertEquals("2012-01-29T21:00:00Z", league.getStartDate().toString()),
            () -> assertEquals("2012-01-30T00:00:00Z", league.getEndDate().toString()),
            () -> assertEquals(1, league.getRules().size())
        );

        LeagueRule rule = league.getRules().iterator().next();
        assertAll("League Rules",
            () -> assertEquals(4, rule.getId()),
            () -> assertEquals("Hardcore", rule.getName()),
            () -> assertEquals("A character killed in Hardcore is moved to its parent league.", rule.getDescription())
        );
    }

    @Test
    public void parseLadderEntry() {
        String json = "{\"rank\":2,\"dead\":false,\"online\":true,\"character\":{\"name\":\"TaylorSwiftVEVO\",\"level\":100,\"class\":\"Scion\",\"id\":\"b23f488245ffebc87616c9acf76fbbb3d534e0490a8b30a9be48f8fcc3941be0\",\"experience\":4250334444},\"account\":{\"name\":\"PeakingDuck\",\"challenges\":{\"total\":28},\"twitch\":{\"name\":\"peakingduck\"}}}";
        JSONObject object = new JSONObject(json);
        LadderEntry entry = new LadderEntry(null, object);

        assertAll("Ensure Parsing Result Data Correctly",
            () -> assertEquals(2, entry.getRank()),
            () -> assertEquals(false, entry.isDead()),
            () -> assertEquals(true, entry.isOnline()),
            () -> assertEquals("TaylorSwiftVEVO", entry.getExile().getName()),
            () -> assertEquals(100, entry.getExile().getLevel()),
            () -> assertEquals(AscendancyType.SCION, entry.getExile().getAscendancy()),
            () -> assertEquals(4250334444L, entry.getExile().getExperience()),
            () -> assertEquals("PeakingDuck", entry.getAccount().getName()),
            () -> assertEquals(28, entry.getAccount().getChallenges()),
            () -> assertEquals("peakingduck", entry.getAccount().getTwitch())
        );
    }

    @Test
    public void parseLadderEntryUserWithSubClass() {
        String json = "{\"rank\":3,\"dead\":false,\"online\":false,\"character\":{\"name\":\"Dear_Santa_UA\",\"level\":100,\"class\":\"Occultist\",\"experience\":4250334444},\"account\":{\"name\":\"Valerchik\",\"challenges\":{\"total\":0}}}";
        JSONObject object = new JSONObject(json);
        LadderEntry entry = new LadderEntry(null, object);

        assertAll("Ensure Parsing Result Data Correctly",
            () -> assertEquals(3, entry.getRank()),
            () -> assertEquals(false, entry.isDead()),
            () -> assertEquals(false, entry.isOnline()),
            () -> assertEquals("Dear_Santa_UA", entry.getExile().getName()),
            () -> assertEquals(100, entry.getExile().getLevel()),
            () -> assertEquals(AscendancyType.WITCH, entry.getExile().getAscendancy()),
            () -> assertEquals(AscendancyClass.OCCULTIST, entry.getExile().getAscendancyClass()),
            () -> assertEquals(4250334444L, entry.getExile().getExperience()),
            () -> assertEquals("Valerchik", entry.getAccount().getName()),
            () -> assertEquals(0, entry.getAccount().getChallenges())
        );
    }

    @Test
    public void parseLadderEntryWithGuild() {
        String json = "{\"rank\":4,\"dead\":false,\"online\":false,\"character\":{\"name\":\"VaalMulliSpark\",\"level\":100,\"class\":\"Scion\",\"experience\":4250334444},\"account\":{\"name\":\"spinzter\",\"guild\":{\"id\":\"28542\",\"name\":\"Kiinnosted\",\"tag\":\"\",\"createdAt\":\"2013-10-27T14:29:25Z\",\"statusMessage\":\"paras glaani :D\"},\"challenges\":{\"total\":14},\"twitch\":{\"name\":\"gourangaa\"}}}";
        JSONObject object = new JSONObject(json);

        LadderEntry entry = new LadderEntry(null, object);
        assertAll("Ensure Parsing Result Data Correctly",
            () -> assertEquals(4, entry.getRank()),
            () -> assertEquals(false, entry.isDead()),
            () -> assertEquals(false, entry.isOnline())
        );

        Exile exile = entry.getExile();
        assertAll("Ensure Parsing Result Data Correctly",
            () -> assertEquals("VaalMulliSpark", exile.getName()),
            () -> assertEquals(100, exile.getLevel()),
            () -> assertEquals(AscendancyType.SCION, exile.getAscendancy()),
            () -> assertEquals(4250334444L, exile.getExperience())
        );

        Account account = entry.getAccount();
        assertAll("Ensure Parsing Result Data Correctly",
            () -> assertEquals("spinzter", account.getName()),
            () -> assertEquals(14, account.getChallenges()),
            () -> assertEquals("gourangaa", account.getTwitch())
        );

        Guild guild = entry.getAccount().getGuild();
        assertAll("Ensure Parsing Result Data Correctly",
            () -> assertEquals(28542, guild.getId()),
            () -> assertEquals("Kiinnosted", guild.getName()),
            () -> assertEquals(null, guild.getTag()),
            () -> assertEquals("2013-10-27T14:29:25Z", guild.getCreationDate().toString()),
            () -> assertEquals("paras glaani :D", guild.getStatus())
        );
    }

    @Test
    public void parseLadderEntryWithId() {
        PathOfExile poe = new PathOfExile();
        String json = "{\"rank\":6,\"dead\":false,\"online\":false,\"character\":{\"name\":\"xVisco\",\"level\":100,\"class\":\"Templar\",\"id\":\"b96614016b65e349212a77a9996edc34faa3c164529141064a2cef24ca132277\",\"experience\":4250334444},\"account\":{\"name\":\"xVisco\",\"challenges\":{\"total\":0}}}";
        JSONObject object = new JSONObject(json);

        LadderEntry entry = new LadderEntry(poe, object);
        assertAll("Ensure Parsing Result Data Correctly",
            () -> assertEquals(6, entry.getRank()),
            () -> assertEquals(false, entry.isDead()),
            () -> assertEquals(false, entry.isOnline())
        );

        Exile exile = entry.getExile();
        assertAll("Ensure Parsing Result Data Correctly",
            () -> assertEquals("xVisco", exile.getName()),
            () -> assertEquals(100, exile.getLevel()),
            () -> assertEquals(AscendancyType.TEMPLAR, exile.getAscendancy()),
            () -> assertEquals("b96614016b65e349212a77a9996edc34faa3c164529141064a2cef24ca132277", exile.getId()),
            () -> assertEquals(4250334444L, exile.getExperience())
        );

        Account account = entry.getAccount();
        assertAll("Ensure Parsing Result Data Correctly",
            () -> assertEquals("xVisco", account.getName()),
            () -> assertEquals(0, account.getChallenges()),
            () -> assertEquals(null, account.getTwitch())
        );

        Guild guild = entry.getAccount().getGuild();
        assertNull(guild);

        assertEquals(account.getPoE(), poe);
    }

    @Test
    public void parsePvpMatch() {
        String json = "{\"id\":\"EU01-73-STD Swiss\",\"startAt\":\"2015-01-11T15:00:00Z\",\"endAt\":\"2015-01-11T16:24:00Z\",\"url\":\"http://pathofexile.com/forum/view-thread/1170447\",\"description\":\"Best of Seven Low Level Dueling\",\"glickoRatings\":false,\"pvp\":true,\"style\":\"Swiss\",\"registerAt\":\"2015-01-11T14:30:00Z\"}";
        JSONObject object = new JSONObject(json);
        PvPMatch match = new PvPMatch(null, object);

        assertAll("Ensure Parsing Result Data Correctly",
            () -> assertEquals("EU01-73-STD Swiss", match.getId()),
            () -> assertEquals("2015-01-11T15:00:00Z", match.getStartDate().toString()),
            () -> assertEquals("2015-01-11T16:24:00Z", match.getEndDate().toString()),
            () -> assertEquals("http://pathofexile.com/forum/view-thread/1170447", match.getUrl()),
            () -> assertEquals("Best of Seven Low Level Dueling", match.getDescription()),
            () -> assertEquals(false, match.isGlickoRatings()),
            () -> assertEquals(true, match.isPvp()),
            () -> assertEquals(MatchStyle.SWISS, match.getStyle()),
            () -> assertEquals("2015-01-11T14:30:00Z", match.getRegisterDate().toString())
        );
    }

    @Test
    public void invalidEnumCases() {
        assertNull(AscendancyType.getByName("random shit lol"));
        assertNull(GemAttribute.getByName("random shit lol"));
        assertNull(GemColor.getByName("random shit lol"));
        assertNull(StashType.getByName("random shit lol"));
    }
}
