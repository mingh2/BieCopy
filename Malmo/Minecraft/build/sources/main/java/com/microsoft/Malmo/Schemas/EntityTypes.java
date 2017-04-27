//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.27 at 08:14:59 AM PDT 
//


package com.microsoft.Malmo.Schemas;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EntityTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EntityTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Creeper"/>
 *     &lt;enumeration value="Skeleton"/>
 *     &lt;enumeration value="Spider"/>
 *     &lt;enumeration value="Giant"/>
 *     &lt;enumeration value="Zombie"/>
 *     &lt;enumeration value="Slime"/>
 *     &lt;enumeration value="Ghast"/>
 *     &lt;enumeration value="PigZombie"/>
 *     &lt;enumeration value="Enderman"/>
 *     &lt;enumeration value="CaveSpider"/>
 *     &lt;enumeration value="Silverfish"/>
 *     &lt;enumeration value="Blaze"/>
 *     &lt;enumeration value="LavaSlime"/>
 *     &lt;enumeration value="EnderDragon"/>
 *     &lt;enumeration value="WitherBoss"/>
 *     &lt;enumeration value="Bat"/>
 *     &lt;enumeration value="Witch"/>
 *     &lt;enumeration value="Endermite"/>
 *     &lt;enumeration value="Guardian"/>
 *     &lt;enumeration value="Pig"/>
 *     &lt;enumeration value="Sheep"/>
 *     &lt;enumeration value="Cow"/>
 *     &lt;enumeration value="Chicken"/>
 *     &lt;enumeration value="Squid"/>
 *     &lt;enumeration value="Wolf"/>
 *     &lt;enumeration value="MushroomCow"/>
 *     &lt;enumeration value="SnowMan"/>
 *     &lt;enumeration value="Ozelot"/>
 *     &lt;enumeration value="VillagerGolem"/>
 *     &lt;enumeration value="EntityHorse"/>
 *     &lt;enumeration value="Rabbit"/>
 *     &lt;enumeration value="Villager"/>
 *     &lt;enumeration value="EnderCrystal"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EntityTypes")
@XmlEnum
public enum EntityTypes {

    @XmlEnumValue("Creeper")
    CREEPER("Creeper"),
    @XmlEnumValue("Skeleton")
    SKELETON("Skeleton"),
    @XmlEnumValue("Spider")
    SPIDER("Spider"),
    @XmlEnumValue("Giant")
    GIANT("Giant"),
    @XmlEnumValue("Zombie")
    ZOMBIE("Zombie"),
    @XmlEnumValue("Slime")
    SLIME("Slime"),
    @XmlEnumValue("Ghast")
    GHAST("Ghast"),
    @XmlEnumValue("PigZombie")
    PIG_ZOMBIE("PigZombie"),
    @XmlEnumValue("Enderman")
    ENDERMAN("Enderman"),
    @XmlEnumValue("CaveSpider")
    CAVE_SPIDER("CaveSpider"),
    @XmlEnumValue("Silverfish")
    SILVERFISH("Silverfish"),
    @XmlEnumValue("Blaze")
    BLAZE("Blaze"),
    @XmlEnumValue("LavaSlime")
    LAVA_SLIME("LavaSlime"),
    @XmlEnumValue("EnderDragon")
    ENDER_DRAGON("EnderDragon"),
    @XmlEnumValue("WitherBoss")
    WITHER_BOSS("WitherBoss"),
    @XmlEnumValue("Bat")
    BAT("Bat"),
    @XmlEnumValue("Witch")
    WITCH("Witch"),
    @XmlEnumValue("Endermite")
    ENDERMITE("Endermite"),
    @XmlEnumValue("Guardian")
    GUARDIAN("Guardian"),
    @XmlEnumValue("Pig")
    PIG("Pig"),
    @XmlEnumValue("Sheep")
    SHEEP("Sheep"),
    @XmlEnumValue("Cow")
    COW("Cow"),
    @XmlEnumValue("Chicken")
    CHICKEN("Chicken"),
    @XmlEnumValue("Squid")
    SQUID("Squid"),
    @XmlEnumValue("Wolf")
    WOLF("Wolf"),
    @XmlEnumValue("MushroomCow")
    MUSHROOM_COW("MushroomCow"),
    @XmlEnumValue("SnowMan")
    SNOW_MAN("SnowMan"),
    @XmlEnumValue("Ozelot")
    OZELOT("Ozelot"),
    @XmlEnumValue("VillagerGolem")
    VILLAGER_GOLEM("VillagerGolem"),
    @XmlEnumValue("EntityHorse")
    ENTITY_HORSE("EntityHorse"),
    @XmlEnumValue("Rabbit")
    RABBIT("Rabbit"),
    @XmlEnumValue("Villager")
    VILLAGER("Villager"),
    @XmlEnumValue("EnderCrystal")
    ENDER_CRYSTAL("EnderCrystal");
    private final String value;

    EntityTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EntityTypes fromValue(String v) {
        for (EntityTypes c: EntityTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
