import java.util.ArrayList;

/**
 * Created by Matt on 11/1/16.
 */
public class Database
{
    ArrayList<Series> series = new ArrayList<Series>();
    ArrayList<Subject> subjects = new ArrayList<Subject>();
    ArrayList<Formula> formulae = new ArrayList<Formula>();

    public Database()
    {
        initializeSubjects();
        initializeFormulae();
        initializeSeries();
    }

    public ArrayList<Series> getSeries()
    {
        return series;
    }

    public ArrayList<Subject> getSubjects()
    {
        return subjects;
    }

    public ArrayList<Formula> getFormulae()
    {
        return formulae;
    }

    private ArrayList<Subject> findSubjects(String formula_code)
    {
        ArrayList<Subject> subjectlist = new ArrayList<Subject>();
        for (int i=0; i<subjects.size(); ++i)
        {
            if (subjects.get(i).getID().contains(formula_code))
            {
                subjectlist.add(subjects.get(i));
            }
        }
        return subjectlist;
    }

    private ArrayList<Formula> findFormulae(String series_letter)
    {
        ArrayList<Formula> formulalist = new ArrayList<Formula>();
        for(int i=0; i<formulae.size(); ++i)
        {
            if (formulae.get(i).getCode().contains(series_letter))
            {
                formulalist.add(formulae.get(i));
            }
        }
        return formulalist;
    }

    private void initializeSubjects()                               //contains information on all Subjects
    {
        subjects.add(new Subject("A1307-023", "Striker/Trump 2", "Subject became able to tag capes for periods of time never exceeding one hour. During this period she was able to switch any two tagged capes' powersets at will. " +
                "Was not able to gain powers herself; could not sense tagged capes' locations, only power sets as 'flavours'."));
        subjects.add(new Subject("A1307-105", "Striker 7, Blaster/Shaker 4", "Subject left white, glowing handprints on everything he touched when activating his power. He could then detonate every hand print, each producing " +
                "a small, directed explosion. It appears that the subject could not selectively detonate hand prints and must detonate all of them at one time."));
        subjects.add(new Subject("R2001-003", "Mover 8", "Subject developed flight with perfect maneuverability and a top recorded speed of 220 km/hr. Trailed by an afterimage."));
        subjects.add(new Subject("B8605-124", "Thinker/Master 1-3", "Subject developed a passive aura that slowly increased the speed and quality of work by those around them." +
                " Aura effect reset if a target was forced to switch tasks."));
        subjects.add(new Subject("D4234-039", "Shaker 7", "Subject displays ability to grow massive amounts of ice from any ice in the area. Although he could pull it in chunks," +
                " he prefferred to create spikes of ice in sets of 30, although with less control over exact shape."));
        subjects.add(new Subject("B7160-088", "Stranger 4", "Subject is virtually undetectable by all machines including cameras, heart rate monitors, etc. Video/camera feeds seemed to not register the pixel change when subject " +
                "is in view and record the last known background behind subject until she moved."));
        subjects.add(new Subject("X0104-015", "Changer 6, Shaker 3, Brute 1", "Subject's changer form consists of a pulsating, folding cloud of white ash. In human form, any physical harm stronger than the average punch " +
                "caused them to explode into their nebulus form, mitigating virtually all of the damage."));
        subjects.add(new Subject("G5525-012", "Brute 4", "Subject developed the ability to manifest claws of force that are much sharper than they appear. When paired with a minor strength boost," +
                " she could shear through thin steel. Also, subject noted pain no longer effected her focus in any reasonable degree."));
        subjects.add(new Subject("J3257-217", "Shaker/Blaster 6", "Subject displayed ability to create baseball-sized stones. Each stone fizzed and popped, then would explode exactly 9.3 seconds after creation," +
                " coating its surroundings in viscous lava. Subject often threw stones as a grenade."));
        subjects.add(new Subject("J3219-112", "Brute 5", "Subject displays the rare shadow element. The element seems to do physical damage, although the exact kind varies." +
                "This subject possesses the ability to flare out their aura as spikes to damage everything within 4 feet of them. The spikes flared fast enough, the original hypothesis was a concussive burst" +
                " as the technician didn't see the spikes."));
        subjects.add(new Subject("M0982-223", "Master/Shaker 10", "Subject is one of the most powerful capes to come from imbibing M0982. Subject places crystalline flowers that spread 'neuro-pollen' that amplifies people's emotional states and makes them more suggestible. " +
                "Sad people can be convinced to commit suicide without previous depressive symptoms while any irritation can quickly be pushed into homicidal tendencies. Field tests were abandonded, as riots often ensued " +
                "even without provocation or suggestion."));
        subjects.add(new Subject("A4613-198", "Striker/Master 2", "Subject gained ability to slow the mental processing speed of people he touched, with increased effect if he reapplied the effect."));
        subjects.add(new Subject("H1976-052", "Mover 4, Stranger 1", "Subject was able to reliably manifest two copies of himself and everything on his person. These copies acted independent of one another, but the 'real' subject could teleport to either copy." +
                " This would cause both copies to disappear. If either copy became more than 200 ft from the original, it would dissipate."));
        subjects.add(new Subject("D8120-118", "Master 5-8", "Originally thought to have been a rare dud, subject discovered they could use bones to manifest simulacrums of the deceased." +
                " They could understand complex spoken instructions, but human constructs could not speak. All creations decayed back to the original bone in 1 minute."));
        subjects.add(new Subject("E7895-059", "Master 5", "Subject could create and control a giant, monochrome version of themselves. She could only make the giant between 16 and 60 feet tall. Any creation over 30 feet was observed to be mentally draining. Besides size, the giant appeared to be a normal human on all accounts."));
        subjects.add(new Subject("J2105-028", "Brute/Striker/Breaker 10", "Subject's body became a glassy white-blue. Their entire body became a zone of absolute zero, with no apparent control of the change. Upon realisation that htye may never be able to control their power" +
                " and thus never reenter non-cape society, they turned violent. Physical and heat damage were seemingly ignored, but a time cape was able to deal with the situation. Subject terminated."));
        subjects.add(new Subject("K9768-023", "Tinker 2", "Subject could modify almost every household appliance to send information to their phone. After that became boring, they modified their phone " +
                "to absorb all non-encrypted data from networks, and after that became tiresome, they reorganized our computers' data storage systems. Subject hired and currently employed."));
        subjects.add(new Subject("K2207-103", "Shaker 6, Brute 1", "One of the non-Tinker results, subject displays ability to draw all moisture in a given area to form a sheen of water on their skin." +
                " Their dessication aura was powerful enough to pull water out of living things that , if not removed, would die. A secondary regeneration was also obeserved that would heal most cuts within a minute." +
                " Regeneration was only observed when aura had pulled enough water to the subject."));
        subjects.add(new Subject("U1085-082", "Shaker 2", "Subject grows crystal polygons that are roughly the size of walnuts from his palms. He can throw them to have them detonate with a surprisingly powerful wave." +
                " The wave of energy has a weak elect rical element, but the main component is a pressure wave that pushes those caught in the area somewhere between 5 and 15 feet. Subject is not effected by his own explosions."));
        subjects.add(new Subject("U1085-008", "Brute 3", "Subject subconsciously manifested forcefields to reflect any attack with a contact surface area of >1 inch in diameter. No amount of force was shown to be able to break the fields; " +
                "they blocked automatic ammunition without problem. The forcefields would not manifest for anything larger; technicians could throw baseballs and punches without any attempted deflection."));
        subjects.add(new Subject("B4412-143", "Thinker 4", "Subject developed a version of psychometry in which, upon making physical contact with an object, they can view the object and its surroundings since its creation." +
                " The object must be less than 8 cubic feet in size, and non-manmade objects' 'creation' is whenever it first took on its approximate curret shape and size."));
        subjects.add(new Subject("Z0111-037", "Blaster 1, Trump 5", "Subject fires a prismatic ray that reduces the area a parahuman can effect to only their personal reach. Does not seem to effect strikers," +
                " brutes, or anyone with a melee range, but can be strategically debilitating to blasters, shakers, and masters, among others."));
        subjects.add(new Subject("Z0111-201", "Trump 6", "Subject demonstrated the ability to grant up to four non-capes the powers of one parahuman within his line of sight. He need only see the " +
                "target, and he could then copy the power into four non-powered individuals within 10ft of him. The power transfer was 'permanent' until the subject released it or lost consciousness."));
        subjects.add(new Subject("A5082-041", "Mover/Stranger 7 (sub Shaker 1, Thinker 1)", "Subject, while not observed, stops all time except in a small area around themselves. Originally thought they gained speed," +
                " until a pair of timers were used to verify subject's hypothesis. Remote viewing (machine, thinker, etc.) did not 'count' as observation."));
        subjects.add(new Subject("A5082-093", "Trump 10", "Subject gains a complete copy of any cape that looks at her. She also gained an intuitive understanding of the complete scope of each power " +
                "and who she is copying the power from. She loses the powers within one minute of the cape breaking sight of her."));
        subjects.add(new Subject("Z1882-041", "Striker 1, Brute 2", "Subject developed a set of three powers. The first is a fiery kick attack, the second is a minor regenerative ability by absorbing water." +
                " Their final, and most interesting ability, is a 'reset' abilityy that sometimes resets the damage of an attack in the next ten seconds as if it hadn't happened. This reset power isn't terribly reliable and doesn't work on large AoE attacks."));
        subjects.add(new Subject("D3758-101", "Master 2, Blaster 4", "Subject's homunculi is a small humanoid with no neck made primarily out of concrete. It has small wings unable to support anything but itself and can fire bowling balls, " +
                "also made of a sort of concrete or pavement with enough force to dent cars at 15ft. The homunculi is quite durable, not taking much damage unless enough force or pressure is applied to shatter it. Homunculi also came up with the idea of dropping itself on " +
                "targets for more damage when it's bowling ball 'vomit' isn't sufficient."));
        subjects.add(new Subject("D3758-056", "Master 2, Shaker 3", "Subject could create a handful of glass beetles. When these beetles were each within at least 15ft of each other they could 'sing' (as they " +
                "referred to it) to create a sonic, nausea-inducing effect. Although the beetles only make clicking sounds, subject demonstrated the ability to understand and speak to them."));
        subjects.add(new Subject("T8723-142", "Shaker 5", "Subject could turn all inorganic matter within 5ft of him into glass. He utilized this to weaken walls as well as make it harder for enemies to hide as his continued " +
                "presence on the battlefield rendered more of it transparent. He could also turn enemy clothes into glass, hampering their movement and causing injury if they broke out."));
        subjects.add(new Subject("N0116-100", "Striker 1", "With the ability to make objects more appealing, subject N0016-100 has almost no combat applications. However, the effect seems to be more " +
                "or less permanent. Subject has been employed to help our financial division by improving the perceived value of goods we sell."));
        subjects.add(new Subject("J1191-174", "Mover/Striker 6", "Subject gained the ability to move in short bursts as bursts of electricity. She could travel along any conductive surface, " +
                "and passing through organic matter electrocuted it. Subject killed in 2013 Behemoth attack."));
        subjects.add(new Subject("S4166-165", "Shaker 2", "Animals within 100 yards of the subject healed at around 10 times the normal rate. It appears that there is a maximum amount of healing as the healing rate lowered to 8 times normal " +
                "when more than 30 injuries were present. As the smaller ones closed up, the wounds still present healed faster."));
        subjects.add(new Subject("F2446-033", "Stranger/Mover 7", "The subject was entirely invisible in normal lighting and brighter. They became visible in darker environments. While invisible, they could teleport every two seconds " +
                "to any place within line of sight within 20 ft."));
        subjects.add(new Subject("U0398", "Striker/Blaster 6", "Subject could telekinetically lift any object that weighed less than three tons as long as they were in physical contact with it. They could throw cars using " +
                "this method by lobbing them over their head. In rare cases they could use this to stop slower bludgeoning attacks."));
        subjects.add(new Subject("G1062-126", "Thinker 5, Stranger 3, Shaker 1", "Subject interfaced with any and all technology within 40ft of them. They could input commands and understand the programs running on each device. They could also " +
                "read and correctly interpret the messages sent and recieved by the devices in this time, allowing espionage."));
        subjects.add(new Subject("I3275-127", "Brute 4, Mover 0", "Although the subject could revert to a crystal form that was almost impossible to damage, they didn't gain any additional strength to speak of. This made them a constant threat, " +
                "albeit a less serious one. In this form, they retain all of the movement they had in their human form."));
    }

    private void initializeFormulae()                               //contains information on all Formulae
    {
        formulae.add(new Formula("Tag", "A1307", 7,2,5,4,4, "Sample A1307 always grants a striker power with a two-step powerset. The first step involves the patient 'tagging' a target while the second allows the patient to manipulate their tagged targets in some way." +
                " Wide variety of variable subcategories have been observed with a tendency toward utility. Common deviations include desire to avoid touching objects, even in powers where involuntary discharge would be harmless (trump power recoils upon touching " +
                "anything made of wood [see A1307-003]) or a seemingly tertiary power that leaves glowing handprints everywhere. Worrisome deviations rare.", " Range 0, Target 1, Control 2, Time 2, Power Quality, Kat's a Twin!", findSubjects("A1307")));
        formulae.add(new Formula("Peregrine", "R2001", 10,1,2,1,3, "Sample R2001 reliably grants flight. In every case, the flight is accompanied by an extra effect (sparks, sounds, color change, etc.) but every effect is temporary and provides no other benefit." +
                " Only knoown deviation developed feathered wings (R2001-081). These wings appeared to be almost entirely ornamental and were used little during flight. Lowest flight speed of any patients on record was 83km/hr.", "Utility 4, Control 1, Flight, +speed 4, Impressive", findSubjects("R2001")));
        formulae.add(new Formula("Undertake", "B8605", 4,7,5,1,5, "The overarching theme of sample B8605 seems to be creating a fixation (in self or in others) on a given problem until it is solved. Powers included a blaster that caused targets to become preocuppied with cleaning an area (B8605-002), a " +
                "master/striker who could force others to become single-mindedly focused on any problem for hours (B8605-051), and a thinker with advanced problem-solving who could not stop until a solution was found (B8605-004). B8605-051 had a strong enough influence to accidentally force a test subject " +
                "to break their own arm when tasked to lick their elbow. Ironically, the only common deviation is a spacey lack of focus when not solving problems.", "Magnitude 10, Mental Speed, Problem Solving, Conditional (to completion), Ramp Up 5", findSubjects("B8605")));
        formulae.add(new Formula("Bulwark", "D4234", 5,4,8,3,6, "Sample D4324 seems to always grant a power that can 'grow' matter out of other matter of the same kind. Although several patients displayed the ability to grow matter from hundereds of locations at once, the large majority of patients could only target one or two locations at a time." +
                " However, it was quite common for patients to be able to pull walls into existence that stood 10*10*5 feet in twenty seconds or less. The most common forms of matter were sturdy solids, although softer solids and even organic plant matter (D4234-008) have been observed. It was rare, but a few patients created liquid matter instead of " +
                "solid matter. D4234 is good for those customers that want to have a lasting effect on the battlefield. A shaker classification is almost a certainty.", "Defense, Range 2, Grow, Matter Type, Durable 2, Magnitude 5, Clumsy 1, Immobile", findSubjects("D4234")));
        formulae.add(new Formula("Spectre", "B7160", 5,8,4,0,5, "Patients given sample B7160 all developed a form of avoidance aura that made them harder, or nearly impossible to detect. Some made others unconsciously avoid looking at them or be in their vicinity while the " +
                "more potent auras made others completely unaware of the patient. Subjects reported symptoms indicative of schotoma involving the patient. Several patients developed a " +
                "modified version of these auras that worked primarily on machines, causing static or corrupted footage files. No known deviations besides one possible case (B7160-087). After imbibing, patient disappeared and could no longer be detected. Unknown whether " +
                "this was a deviation or a very powerful power that also bypassed the Manton limit. An accurate power rating is nearly impossible for B7160. Powers range from barely perceptible to incredibly exploitable. Subjects will be closely monitored in case countermeasures" +
                "need to be deployed.", "Utility, Sensing, Repel, Area 3, Aura", findSubjects("B7160")));
        formulae.add(new Formula("Granule", "X0104", 8,8,7,6,6, "Sample X0104 represents one of the most consistent formulas for obtaining a reliable changer ability. Every patient developed an alternate form that consisted of a nebulus cloud of particulate matter." +
                " The exact type of matter is variable between patients. The most common deviations involve the patient's body leaking their associated element which then orbits until they shift into the nebulus and back to collect the leaked matter. " +
                "Every patient showed the ability to rotate the nebulus at high speeds to 'sand blast' targets. One notable outlier is a tinker (X0104-212). 212 could create, among other things, a grenade that turned all inorganic matter to dust.", "Nebulus, Particulate, Attack, " +
                "Particulate, Area 2, Power 2, Magnitude 2, at least 1 other Power", findSubjects("X0104")));
        formulae.add(new Formula("Heavy", "G5525", 9,2,5,2,4, "Sample G5525 has only ever provided personal effects. These usually manifest as physical transformations, but in rare cases patients have developed personal forcefields, with the most extreme example only extending " +
                "twenty inches from the patients fingers (G5525-012). Physical changes can include regeneration, claws, tails, and stone skin (G5525-001). However, most durability granted usually does not manifest in a change. It is primarily seen as a normal individual who, for example, cannot be cut (G5525-083)." +
                "Perfect for customers desiring a brute classification. The only true non-brute subject was a tinker (G5525-161) who specialized in biological durability and regeneration, giving him a subclass of brute. G5525-161 created a serum that allowed a dog " +
                "to sustain a land mine without apparent injury.", "STR Hyperstat, CON Hyperstat, CON 6, Defense, Durability 3", findSubjects("G5525")));
        formulae.add(new Formula("Igneous", "J3257", 6,6,8,4,7, "Sample J3257 is optimal for any customer who idolizes volcanoes. It can provide a vast array of powers, all involving a common ability to generate lava. Examples: toggled aura that heated rock to magma (J3257-013), " +
                "pools of lava used as portals (J3257-105), lava golem changer (J3257-009), animate lava vipers (J3257-104), lava skin (J3257-007). Most patients possess a secondary immunity to the heat, some even enjoying it. Other predictable outcomes included glowing eyes, and craig-like " +
                "fissures in the patient's skin (both temporary and active when using powers). Any major deviations were almost always lethal, including a subject that vomitted lava, but who's throat had no protection from the heat (J3257-005). Subject was terminated for their own wellbeing " +
                "before futher tests could be conducted.", "Attack, Power 5, Create, Lava, Obvious, Area 1", findSubjects("J3257")));
        formulae.add(new Formula("Immolation", "J3219", 10,9,6,2,7, "Rarely is a sample as specific as J3219. It only ever grants a variation on a personal energy field. Out of 213 patients, the only unique forms of energy were fire, frost, electricity, kinetic, laser, and a rare one we termed 'shadow'. " +
                "Every patient, upon activating their power, would become wreatherd in their associated element. Secondary powers, such as flaring the aura out or projecting volleys of the element were common. A small subset of patients were masters with the ability to apply the same personal " +
                "aura effect to their minions.", "Partial, Energy^, Attack, Magnitude 2, Defense, Durability 2, Regen 1, Impressive", findSubjects("J3219")));
        formulae.add(new Formula("Fragrant", "M0982", 4,10,2,4,2, "Sample M0982 imbues the patient with some form of control over hormones and pheromones. Resulting powers are always very original and many have humorous effects. Good for those customers that want to be a parahuman, but who don't " +
                "want to be pressured to join the cape scene. Battle applications traditionally remain limited. Notable exceptions include a perfume tinker, a shaker, and a striker who could cause muscle paralysis " +
                "and intoxication respectively (M0982-006)(M0982-100)(M0982-030). Mental deviations are more common, especially a lack of protection from personal pheromones.", "Utility, Range 1, Area 2, Time 2, Pheromones, Lasting 1", findSubjects("M0982")));
        formulae.add(new Formula("Layer", "A4613", 1,4,5,2,3, "Sample A4613 exhibits a unique array of powers that it grants patients. Almost all varieties have been observed, elemental powers as often as those that manipulate the laws of physics or the behavior of others. Every power has the unique property that, " +
                "to reach its full potential, must be applied several times over. Many patients develop seemingly trivial powers that, with enough time for preparation, end up rivalling any competent cape. Some A4613 powers had lasting effects and could be layered over time while others had to be stacked all at once before " +
                "releasing the power. Deviations are as varied as the powers given. Tinker powers are quite common, with the same trend of layering effects.", "Lasting 3, Layered 3", findSubjects("A4613")));
        formulae.add(new Formula("Jaunt", "H1976", 8,3,5,1,4, "Sample H1976 is so named as it grants a teleportation or portal mover power. Most patients had relatively short range limits, the largest topping out around 300m. Basic, line of sight teleportation is a commonly granted power, but many patients have unique 'flavours' of powers. " +
                "The more interesting examples include a teleporter who slowed time around their exit point (H1976-005) and a portal maker that turned all vertical surfaces in an area into portals with random destinations (H1976-109). H1976 is perfect for those customers that are looking to exhibit a " +
                "'trickster' motif in their costumed behavior. Subjects often aided the fight by repositioning their allies out of danger and into more advantageous positions. When solo, subjects had to exhibit ingenuity to take down more durable foes. The one weakness shared by 95% of H1976 were shakers that affected " +
                "areas larger than their maximum mover range.", "Utility, Range 3, Teleport/Portal/Switch", findSubjects("H1976")));
        formulae.add(new Formula("Deus", "D8120", 9,6,6,2,6, "Sample D8120 is perfect for capes who wish to participate in combat indirectly. It provides, with 100% accuracy, a master type projection power, essentially creating a puppet for the patient to control. The only significant deviations observed involved mental changes; " +
                "no significant physical deviations were obeserved. Some projections were merely illusions while others were incredibly durable. A few projections even demonstrated abilities of their own, one of the more powerful being one that detonated upon destruction, creating a sphere of " +
                "a jelly-like solid (D8120-301). Subject D8120-035, for example, was an introverted, docile man. When projecting his construct, a sixty foot lion, he became aggressive and violent. Subject terminated after threatening to reveal us to authorities unless we permanently boosted his powers " +
                "(a currently impossible feat).", "Utility, Create, Range 6, Utility, Sensing, Kat's a Twin!, Always On", findSubjects("D8120")));
        formulae.add(new Formula("Prince", "E7895", 3,7,5,1,5, "Sample E7895 toes the line between shaker and master for almost all subjects. The large majority of subjects gained the ability to manifest one or two 'minions' although some required direct, conscious control while others required only " +
                "general direction. Arguably these are master-type abilities (ex. a pair of shadow cats [E7895-120]), but it is difficult to see how manipulating a crystal spear (E7895-095) or a small sun (E7895-013) classifies as anything except blaster and shaker, respectively. Secondary mover ratings " +
                "from riding the manifestation can be excepted in cases where manifestations are solid enough to support subject. Customers looking for a puppeteer theme should definitely consider E7895. It may not provide a puppet in the traditional sense, " +
                "but it will guarantee the general theme will be adhered to, albeit with a secondary theme as well.", "Manifest, Target Number 1, Range 4, target type, size increase 1", findSubjects("E7895")));
        formulae.add(new Formula("Rime", "J2105", 8,5,7,3,6, "Sample J2105 grants powers that tend to drastically lower temperature and/or inertia in an area, usually in close proximity to the subject. Some auras extend several hundred feet while other powers only effect the subject's own body. A few subjects demonstrated " +
                "the ability to blast a large area not centered on them, usually as a cone or grenade, for a similar effect. Minor deviations usually involve perpetually cold skin, constant cloudy breath, or a frosting of the subject's eyes. In essence, J2105 is the prime formula for those customers looking to make a name " +
                "for themselves as a frost-themed cape. Customers should be noted that civilian life may need to be altered slightly to deal with any minor deviations that may manifest. Customers should also not that J2105 subjects are required to " +
                "keep track of their allies in combat situations to avoid accidentally injuring them.", "Frost, Power 5, Clumsy 1, Penetration 2, Automatic, Conditional", findSubjects("J2105")));
        formulae.add(new Formula("Pinnacle", "K9768", 8,3,4,2,4, "Although the K-series of formulas are grouped as commonly producing tinker powers, sample K9768 is the only formula to only produce tinkers. Sample K9768 tends " +
                "to produce tinkers with specializations focused around optimizing technology. Known examples include miniaturization, durable machinery, regenerating machines, and machines with near-limitless redundancies. K9768 tinkers can be just as useful in corporate and " +
                "industrial/economic settings as they are in combat situations. As tinker powers only affect the brain, only mental deviations have been observed. A notable subject developed a disgust with any non-tinker tech and refused to use 'lesser' technology. " +
                "Even some rough-looking tinker tech was not 'up to standard' (K9768-052).", "Efficiency 3, Inspiration 2, Speed 2, Starting Ideas 5, Repetition 2", findSubjects("K9768")));
        formulae.add(new Formula("Lodestone", "K2207", 3,8,7,1,6, "Continuing the K-series pattern of creating tinkers, sample K2207 grants tinker powers involving attraction fields, barriers, and other area of effect, zone-type effects. Around half of " +
                "patients instead developed non-tinker powers with the same general base of zone-type powers, lending them toward a shaker classification. The granted powers can be as specific as an attraction field that draws in bacteria (K2207-006) " +
                "or as general as a forcefield sphere that prevents everything from crossing the edge (K2207-105). K2207 powers are often the deciding factors in conflicts when paired with one or more complimentary parahumans.", "Area 4, Magnitude 4, Attract", findSubjects("K2207")));
        formulae.add(new Formula("Minutia", "U1085", 2,7,5,3,4, "Sample U1085 grants control of one or more objects, never bigger than 10cm. The shape and material of the manipulated objects varies from person to person; exotic materials are seen almost as often as common materials and energy types. " +
                "Some patients only control one object while others control thousands. Some create their own objects, others must find them. Customers should not assume controlling small objects means they have a small effect; many of our U1085 customers have gone on to attain notable " +
                "positions within the PRT. Ratings resulting from U1085 can be just as the powers themselves: Brute 3 protected by forcefields (U1085-008) up to Shaker 9 who controls gravity-point orbs (U1085-113).", "Conditional (small), Control 2, Permanent", findSubjects("U1085")));
        formulae.add(new Formula("Matrix", "B4412", 4,1,7,2,5, "Sample B4412 chiefly grants thinker powers that deal with massive amounts of data. It is common for granted powers to be quite taxing, but they are also, very commonly, powerful. The mass of data can be complex, like ranking six possible answers" +
                " to a question in order of 'correctness' (B4412-077) or simple like the names and locations of every person around the patient (B4412-093). In some instances subjects will have a second classification because of the nature " +
                "of information they are recieving. B4412-093 is a good example of this, gaining a sub-classification of Stranger 2 as they could avoid trained guards that were looking for them. Mental deviations often tend toward anxiety and mania involving visual hallucinations. ", "Utility, Knowing (?), Control 2", findSubjects("B4412")));
        formulae.add(new Formula("Jealousy", "Z0111", 8,7,5,0,6, "Sample Z0111 almost always grants trump-class powers that deal with copying other parahumans' powers. No serious deviations have been noted. The powers are " +
                "sometimes copied to others, sometimes to the subject and some subjects copy the power(s) in full while other patients copy the powers in a weakened or altered state. Those rare examples of non-copying powers place severe restrictions on the powers of others. " +
                "No Z0111 subjects have demonstrated the trump ability to buff the powers of others. To fully utilize a Z0111 power, customers must be adaptable to every situation. It requires an intelligent, fast-learning individual " +
                "to take advantage of every facet of the powers the subject copies.", "Utility, Time 2", findSubjects("Z0111")));
        formulae.add(new Formula("Observance", "A5082", 2,9,9,1,8, "Sample A5082 reliably grants powerful abilities in the top tier of their given categories, and was created by mixing several volatile test formulas with balancing agents." +
                " Interestingly, all powers granted by sample A5082 seem to be either only active while being observed, or they only work when not observed. It appears all powers activate automatically and cannot be switched off by the users. " +
                "Full implementation of A5082 formulas will likely require organized coordination with other team members. Every power classification, to varying degrees, has been demonstrated from A5082. Powers that only work when not observed were more likely to be mover or stranger " +
                "while those that only work while observed were more likely to be brute, shaker, or master.", "Conditional (viewed), Automatic", findSubjects("A5082")));
        formulae.add(new Formula("Medley", "Z1882", 3,2,3,0,3, "Sample Z1882 was created by mixing many stable, but mostly inert, test formulas. This sample always produces the equivalent of a grab-bag parahuman. These parahumans often have 3 or more unique powers, " +
                "but each individual power is relatively weak. The number of powers and the nature of each power varies from patient to patient, although most powers would not rate higher than a 2 or 3 on the PRT scale. This lack of raw power should not dissuade customers. This formula is perfect " +
                "for customers looking to have several options at any given time. Customers should also note that although each power may have a relatively low rating, uniquely combining each power can often raise a parahuman's rating by 2 or more.", "at least 2 different powers, at least 2 different power qualities", findSubjects("Z1882")));
        formulae.add(new Formula("Homunculus", "D3758", 7,7,4,4,3, "Sample D3758 is great for any customer that is in need of a constant companion. In every case, the subject develops the ability to create one or more sentient or semi-sentient beings from inorganic matter (taking around one minute of focus). These homuncli, as we have termed them, " +
                "have been shown to be anywhere from 10cm to 30m in length and have wildly varying personalities. Each homunculi was unique in its features, and some even exhibited powers of their own, and, although it was rare, the subject sometimes also devloped a " +
                "weaker version of their homunculi's power. More commonly, while the subject and homunculi were in close proximity the homunculi was empowered. Deviations from D3758 were often dramatic and physical, with subjects' bodies taking on a grotesque, gargoyle-like facade. " +
                "An interesting oddity was subject D3758-230 who's power was to combine their own body with technology to become a cyborg. It was thought this was the first non-homunculi power, until it was discovered that the technological parts had their own sentience. No matter the homunculi's " +
                "personality, it should be noted that they work with their creators and follow their orders. The only contrary examples are when the subject orders their homunculi to do something the homunculi believes will result in the death of the subject or homunculi. Homunculi" +
                " that are destroyed seem to retain the memories from before their destruction and, although they describe death as painful, will happily complete suicidal actions if it furthers their creator's goals.", "Utility, Create, Magnitude 2, Matter Type, Construct, Charging Time 3, Delayed 1", findSubjects("D3758")));
        formulae.add(new Formula("Persona", "Q0100", 3,8,7,2,6, "Sample Q0100 is named such as it deals with creating or modifying the appearance of one or more humans. There have been changers capable of copying the appearance of anyone they come in contact with as commonly " +
                "as there have been shakers that created mirages of random people in the vicinity (Q0100-130). The vast majority of power effects are temporary, but a select few are permanent. One of the most 'traumatic' permanent powers was an individual (Q0100-018) who possessed the " +
                "ability to switch appearances with another. This formula's deviation have an interesting facet of not making the subject 'abnormal'. The most common deviation is changing the subject's appearance to that of another human. This doesn't make civilian life impossible, " +
                "but it does make forged documentation essential in those cases where deviations are present. It also requires explaining to family members, if the relationship is wished to continue, that the subject triggered (must create a realistic trigger event).", "Utility, Humanoid, Magnitude 5", findSubjects("Q0100")));
        formulae.add(new Formula("Wonderland", "E5040", 2,8,5,2,4, "Time, gravity, and dimensional distortion powers are often sought-after, but E5040 puts an interesting spin on them. They often provide bizarre, seemingly nonsensical powers with no clear " +
                "use ingrained. Fans of Lewis Carroll's Alice in Wonderland will enjoy the unique powers provided by E5040. Even though each power may seem to be useless in combat, E5040 powers tend to have one or more caveats that make them useful, in a roundabout sort of way. " +
                "A good example is E5040-101 who was granted a space warping ability. They described the experience as the world 'bending around like silly putty' and they could float between parts that bent close to each other. While 'floating' between places, " +
                "they disappeared from reality as we know it. They could even take a volunteer with them by holding their hand, although video feeds failed to work within and volunteers became incredibly anxious when asked to describe their experiences within. " +
                "The act of traveling in this dimension often made E5040-101 appear and disappear intermitently around the battlefield.", "Exotic element", findSubjects("E5040")));
        formulae.add(new Formula("Sanguine","F1313", 3,8,6,5,5, "As its name would suggest, F1313 powers deal exclusively with blood. Although primarily human blood, there were subjects that had powers that could either use animal blood just as well as " +
                "human blood, or even a rare few that worked exclusively with animal blood. Subject F1313-026 could soak her hands in fresh animal blood to see everything it had ever seen, but it did not work with humans. Preliminary tests show that she can at least " +
                "splotches of light and dark if she soaked her hands in tree sap. This suggests that the formula doesn't deal so much with blood specifically as it does with the life essence or something similar in each organism. Precognitive abilities tend to involve large amounts of fresh " +
                "blood of the target, while other uses tend to deal with the subject's blood or others' blood equally. While the painless trait is rarely expressed in F1313 subjects, a regenerative factor is a common that counteracts the amount of blood lost by those " +
                "that must utilize their own blood in combat.", "Blood, Range 1, Magnitude 4", findSubjects("F1313")));
        formulae.add(new Formula("Jolt", "J1191", 6,5,6,3,5, "The classic electrical element formula, J1191 provides bursting, electrical powers. Many of subjects exhibit the instant electrical attacks that are stereotypical of many staple electric capes. The few exceptions " +
                "provide long, continuous currents of electricity that can often disable some of the toughest brute villains on record. It is advised that customers with these powers educate themselves about electricity as there have been several cases where former customers and subjects " +
                "accidentally killed themselves or others. These accidents ranged from a blaster not accounting for the metal platforms inside a factory to a striker attempting to revive an ally by trying to mimic an aed, they misjudged the voltage and current; their former ally was almost unrecognizable. " +
                "Major deviations tend to require subjects to avoid technology without specially made gear. This is due to most deviations involving, at least in part, a periodic, massive discharge of energy that often permanently damages electronics.", "Electricity, Power 4", findSubjects("J1191")));
        formulae.add(new Formula("Whimsy", "E3571", 3,9,5,3,4, "E3571 is not the formula to purchase if a customer is looking for a specific classification or type of power. It is, however, a perfect formula for team theming. Every power deals with an exotic, " +
                "alien world we have termed Planet 571. It seems the planet is in a perpetual state of twilight with the primary colors of it's inhabitants being differing hues of blue, green, and purple. The planet's atmosphere has a composition similar to that of Earth and " +
                "its inhabitants are only slightly more dangerous. The predatory animals are adapted to hunting at night and a significant set of patients develop changer or brute powers involving these animal's biology. The plants are more densely packed and draw much of their " +
                "nutrients from the air. Several large, carniverous species of plants exist while many others ensnare animals or possess large spines to deter herbivores. Shakers that create copies of these plants and powers that employ dimensional abilities to " +
                "and from this planet make up the majority of the other powers. If an entire team of customers imbibes E3571, no matter the powers given, they will all coalesce into a beautiful, bizarre theme.", "theming", findSubjects("E3571")));
        formulae.add(new Formula("Tireless", "R3824", 9,3,1,0,2, "Another one of our recreational formulas, R3824 provides a power that is more useful than fun. Anyone who imbibes R3824 will never have to sleep again. Some can sleep, but just do not have to, while others find it physically/mentally " +
                "impossible to fall asleep. R3824 obtains its 9 in Reliability because some subjects also developed a lack of need for water and food as well, among other, more minor necessities. Two subjects also displayed a reduced need to breathe. In a pool, one subject could go three hours " +
                "before needing to surface for air while the other surfaced after almost fifteen hours for almost unrelated reasons, they needed to defecate, and they had not yet reached their limit.", "Utilty, Tireless", findSubjects("R3824")));
        formulae.add(new Formula("Refine", "N0116", 6,6,4,1,4, "N0116 is perfect for those customers looking for a simple and straightforward N-series powers. They always increase one or more of an object's properties but do not involve modifying, manipulating, or adding " +
                "additional traits, as the more complex N-series formulas tend to do. The resulting strategies tend to be as limited and straightforward as the powers themselves. The simple nature of the formula biases the resulting classifications to brute, mover, and strikers heavily. " +
                "This is not to say a few of the other classifications aren't seen, just that they are much weaker and rarer than their more common counterparts. As far as theming goes, N0116 is perfect for those looking for a medieval theme as customers tend to require " +
                "bulky weapons and armor to fully utilize their power.", "Utility, Increase", findSubjects("N0116")));
        formulae.add(new Formula("Savant", "L4872", 7,2,3,1,2, "Sample L4872 is perfect for those that desire a non-visible power that isn't as complex as traditional thinkers and tinkers. It, in essence, provides proficiency in one or more skills. They do not receive inhuman aid (computer hackers will not be notified " +
                "of programs they cannot detect through their own means) but they represent the most skilled people in each field. L4872-058, a subject that is gifted in understanding and applying fighting styles, will not lose a one on one fight unless there are extenuating circumstances. Although it initially " +
                "appeared that L4872 granted proficiency in one skill, it was determined that it actually gives understanding of a much smaller set of information. For example, L4872-058 was actually gifted with perfect understanding of the kinesthetic movement of the human body. This allows them to predict " +
                "the force and arch of each movement. Thinkers, strikers, strangers, and movers are the only classifications that are seen with any consistency.", "Utility, Knowledge(?)", findSubjects("L4872")));
        formulae.add(new Formula("Midas", "T8723", 6,7,5,3,4, "The legendary King Midas could transmute all that he touched to gold. Although we cannot promise it will be gold, formula T8723 grants subjects the ability to change matter into various metals and rocks. Striker " +
                "ratings are common, although brute or changer ratings will apply to those subjects that affect their own person while shaker ratings are also common. A rather ingenuitive subject with the ability to self-transmute into stone was able to inflitrate a company " +
                "by posing as a statue and obtained a stranger rating. Movers, blasters, and tinkers are also seen, but at significantly lower rates. Customers should be aware that their has never been an instance of a T8723 subject that could affect " +
                "living tissue other than their own (unlike in the myth), so customers needn't worry about obtaining a too-lethal power.", "Utility, Inorganic (or other target type), Transform To, Stone or Metal, Quick-sh", findSubjects("T8723")));
        formulae.add(new Formula("Omega", "O0000", 0,0,0,0,0, "Data File Corrupted", "Mutable", findSubjects("O0000")));
        formulae.add(new Formula("Territory", "P2051", 5,7,4,1,4, "Sample P2051 always provides powers with a shaker classification that involve setting up a given territory. Inside this territory, subjects either have new abilities, " +
                "or their old abilities are greatly amplified. Setting up this territory tends to be quite slow, although their are some individuals who can set up a small territory quite fast. These areas are easily denoted by one or more lasting changes. " +
                "P2051-043 created black spires that allowed him to see everything in an area around them while P2051-048 left a sphere of constant daylight, inside which they were invisible. The spires were, as far as we could tell, permanent, while the daylight did seem to begin to fade after " +
                "three years. Although P2051 subjects tend to have lower ratings, this is only due to the fact that they require more time than normal to set up their area of effect. The PRT often raises their ratings when forced to " +
                "engage them inside their own territory.", "Utility, Create, Impressive", findSubjects("P2051")));
        formulae.add(new Formula("Rupture", "V0459", 8,8,8,2,8, "Sample V0459 is chiefly dangerous by distrupting organic tissues. Even survivors of V0459 attacks are left horribly disfigured, Even accomplished 'healing' parahumans have problems healing V0459 damage. Strikers and brutes " +
                "are the most common. In a minor subset of subjects, the tissue disruption is actually a secondary characteristic of the trait. V0459-072 was a master who placed a cancerous tumor onto people's eyes. If not removed, the tumo would eventually grow to encompass their face, at which time, " +
                "they became thralls of the subject. The tumor would continue to grow until the victims were monstrous humanoids with ten or more limbs, each tipped with claws and able to climb vertical surfaces. Subject killed by Protectorate within 13 days of villainous activity. Biological tinkers are " +
                "rare, though seen.", "Organic, Annihilation", findSubjects("V0459")));
        formulae.add(new Formula("Dilation", "W6428", 6,8,5,1,6, "Although the practical effect differs, all sample W6428 subjects gained the ability to slow down or stop time. W6428-401 was a powerful mover/shaker who slowed down time in a wide " +
                "area that started centered on him. W6428-032 on the other hand could make bubbles of slowed time to trap others. In one instance, W6428-032 used this to 'hibernate' for 3 weeks in the middle of a desert when left without food and water. To them, " +
                "it was a mere 2 seconds (rounded up from their stopwatch). These bubbles could also be utilized as shields due to their membranes being a flexible zone of stopped time. Customers that purchase W6428 should not expect master, changer or trump ratings " +
                "as these have never been seen.", "Time, Slow", findSubjects("W6428")));
        formulae.add(new Formula("Dauntless", "S2169", 8,4,4,0,4, "Sample S2169 is perfect for those that want to skirt around the outskirts of combat, protecting allies from dangers, both seen and unseen. S2169 grants increased durability (and in rare cases invulnerability) to " +
                "themselves and/or one or more of their allies. It never only effects the subject; some subjects can effect themselves as well as others, but most only effect others. A loose rule is that the more people a power effects, the weaker the durability. A notable exception " +
                "to this rule was S2169-088 who could make everyone within 50ft of him completely invincible for 12.7 seconds. However, he would then fall unconscious for 15 minutes and be unable to activate his power for 10 minutes after waking up.", "Defense, Manifest, Durability or Invincibility", findSubjects("S2169")));
        formulae.add(new Formula("Beast", "Y0009", 7,3,8,8,6, "Sample Y0009 always generates a subject with massively increased strength and durability. The deviations manifest as grotesquely swelled muscles as well as what can only be described as 'animalistic' " +
                "outgrowths all over the subjects body. Some subjects essentially became a beastial humanoid and the power seemingly discarded their original body plan. Although many of these beastial forms appear to be modeled off of animal biology, they have been repeatedly shown " +
                "to be more durable than steel of a similar density. Y0009-013 deviated into a 13ft tall primate with 10 eyes and several prehensile tentacles growing from their back. Y009-013 also displayed severe mental deviations and was placed on the PRT kill list because of this. They registered as a brute 10 and " +
                "were able to withstand Legend. Alexandria was eventually called in to assist and the two killed Y009-013 with the assistance of three parahuman teams.", "Case 53, Durability, CON, STR", findSubjects("Y0009")));
        formulae.add(new Formula("Inertia", "C4737", 7,2,6,2,6, "Sample C4737 provides powers dealing with movement and momentum. This can include speeding up, slowing down, starting, changing, or stopping movement of one or more objects. As this is a C-series formula, " +
                "there is a near 100% certainty that C4737 will grant a breaker state that will effect the subject's personal movement. This can, as all formulas do, manifest in different ways. C4737-063 had a breaker state that ignored friction and gravity while C4737-075 " +
                "gained a breaker state that absorbed all incoming kinetic energy and allowed her to utilize it in motion upon entering a different state. Other powers relating to movement should be expected, C4737-079 could shoot bolts of what she called 'motion poison', and " +
                "as movement is such a key staple of C4737, a mover classification or sub-classification should be expected, although not guaranteed.", "Utility, Motion/Inertia, second form", findSubjects("C4737")));
        formulae.add(new Formula("Gargoyle", "I3275", 7,5,5,3,4, "Sample I3275 provides increased durability by changing the subject's body into a much harder material. Some subjects developed an entirely separate changer form that they could shift in and out of at will. This " +
                "changer form was always between 5ft and 10ft tall and resembled a creature made of stone (thus this formula's name). More often, subjects gained the ability to changer their body into a harder material (a much milder transformation). The exact nature of these " +
                "transformations varied, both by type of transformation and material. I3275-099, for example, gained an unconscious, reactive power that caused him to shift his body into a titanium alloy every time his body felt a strong impact.", "Defense, Transform To, Stone or Metal", findSubjects("I33275")));
        formulae.add(new Formula("Squamate", "S4166", 7,7,4,1,5, "Seemingly based on reptilian regeneration, sample S4166 is perfect for customers looking to be a field medic. It grants regeneration and other useful healing-type abilities to others, and in over " +
                "80% of the cases, subjects also retained the abilities for themselves. Many S4166 subjects have been able to treat incredibly traumatic wounds and have their targets up and walking within minutes. S4166-121 possessed an aura that caused all wounds in " +
                "a 50 yard radius of him to clot quickly, to the point where losing an arm was not a life-threatening injury. His aura also helped serious injuries, such as lost arms, to heal. In three tests, he healed three lost arms, eventually to full usage over the course of " +
                "a month for each arm. Other subjects can grant subjects temporary 'stitches' that make wounds effectively null for several minutes, although medical treatment is required after these stitches expire.", "Utility, Regeneration", findSubjects("S4166")));
        formulae.add(new Formula("Patience", "U0398", 8,7,7,0,7, "Perfect for those customers looking to be revered as telekinetic powerhouse, sample U0398 is the most powerful U-series formula, in terms of raw telekinetic strength. Subjects on the low end of the " +
                "spectrum often lift upwards of 1800 lbs. It is common for subjects to have limitations, such as having to physically touch objects before they can lift them, having a range limit, or having to take time to 'ramp up' their power before reaching maximum strength. " +
                "U0398 subjects who can adequately utilize their powers are likely to be the hardest hitters on any given team and should expect to be well-known. A rare few U0398 subjects had more severe limitations in the vein of limiting what they could control. This includes subject " +
                "U0398-002 who could only manipulate dirt/soil. It should be noted that most U0398 subjects could not control organic matter. With planning, these limitations can considered inconsequential.", "Utility, Magnitude 8, Power 2, Control", findSubjects("U0398")));
        formulae.add(new Formula("Gloom", "F2446", 5,8,5,2,5, "Sample F2446 was designed for creatures of the night. Almost 90% of F2446 subjects developed a form of night vision, and many of their granted powers work better after dark. Some " +
                "subjects even have developed the ability to absorb light or manifest darkness. The powers of F2446 vary greatly, with each of the twelve classifications being present. Deviations vary from the subject always looking as if they are standing in shadow to " +
                "subjects developing severe photophobia. Examples of F2446 powers follow. Subject F2446-095 could generate clouds of shadow that dulled powers and senses alike. Those trapped inside report feelings mild vertigo and powered individuals say they felt as though their " +
                "powers were 'foggy'. Subject F2446-049 gained near-instant regeneration, to the point where running through the shadow of a telephone pole healed a cut across his chest that would have required forty stitches.", "shadow theme", findSubjects("F2446")));
        formulae.add(new Formula("Queen Administrator", "G1062", 8,4,4,0,4, "Master powers are almost a guarantee with sample G1062. Sample G1062 grants control over a group of objects, animals, etc. This can include a type of animal (G1062-013 could control birds while G1062-012 " +
                "could manipulate insects) or technology (G1062-126 interfaced with technology) or various other things. Some subjects are limited by the number of minions they can have at any given time, while others are only limited by the number of minions in their range. " +
                "The amount of control and other abilities also varies, G1062-013 could look through the eyes of birds, but G1062-012 could control every minute movement of every insect in her swarm. Minor secondary abilities, such as a multitasking ability, are common to help " +
                "subjects maximize their power. This formula is perfect for customers that fancy themselves battlefield strategists.", "Utility, Control", findSubjects("G1062")));
        formulae.add(new Formula("Superman", "G0081", 10,1,6,1,6, "This formula turns subjects into Alexandria-style parahumans. Every subject that has imbibed G0081 has developed unaided flight, increased durability, and at least a minor strength boost. The exact ratio of these powers " +
                "differs from subject to subject, with some subjects reaching near-sonic speed while others are nigh-indestructible. A few subjects were only stronger and/or more durable while flying, but the vast majority have " +
                "the standard powerset that is always active. Customers should know that, due to this powerset being so common, it will be slightly more difficult than average to achieve any sort of notoriety. This is a very useful, jack-of-all-trades role that is almost always useful on any " +
                "team and in any situation.", "Utility, Durability, STR, Flight", findSubjects("G0081")));
        formulae.add(new Formula("Speedster", "H2323", 8,3,5,1,5, "Sample H2323 is perfect for customers longing to possess super speed. Almost all subjects gained some sort of increased speed. The average running speed of sample H2323 subjects is around 100 feet per second. A large number of subjects " +
                "develop variations of traditional super speed. This can include trails of varying effects to personal effects such as a loss of tangibility while moving. Subject H2323-138 was able to run 82 feet per second and gained density temporarily while running. At maximum speed, subject H2323-138 could " +
                "hit with nearly four times the force of the average human. They could not speed up part of their body, they must be running to use their abilities.", "Utility, increase Speed", findSubjects("H2323")));
        formulae.add(new Formula("Beast", "X0810", 6,5,5,3,4, "Sample X0810 provides changer powers that would, mostly, be called animalistic. This can be anything from large, dense tank-like creatures to small, fast assassin-type creatures. The sub-classifications that X0810 subjects take on vary, but " +
                "they will mostly be brutes, movers, and strikers. Many of the alternative forms sport wings, toxins, or other adaptions that are seen in many animals on Earth. Interestingly, although all changes from X0810 are biological, there have been several instances where " +
                "the changes do not represent biology that is currently seen on Earth and is most likely from alien planets. No inorganic or plant matter forms have been seen in X0810, and the more serious deviations tend to be mental in nature, primarily increased aggression and " +
                "lowered mental clarity.", "Utilty, Animalistic", findSubjects("X0810")));
    }

    private void initializeSeries()                                 //contains information on all Series
    {
        series.add(new Series("A", "The A-series represents formulas that, although they may grant a variety of powers, always have a specific style or restriction. Customers should not be hesistant just because of the word 'restriction' however. " +
                "As many know, the parahumans with the most raw power often have the greatest restrictions. A-series powers are perfect for those individuals that can think around their own limitations and turn them to their strengths. And, if an" +
                " individual is smart enough or has a complimentary partner, it is likely that they can become a prominent hero or villian.",findFormulae("A")));
        series.add(new Series("B", "The B-series contains all formulas that deal almost exclusively with effecting the mind of the subject or the minds of those around him. Because of this, B-series formulas often result in powers with thinker or stranger ratings. " +
                "Thinker powers from the B-series often center around abstract concepts, dealing with information that the user has know 'natural' way of knowing, as opposed to the L-series which works around information already gained. " +
                "While these are the most common primary classifications, some subjects may have them as secondary classifications, with other primary classifications. The most common classifications besides thinker and stranger are changer, blaster, and master.",findFormulae("B")));
        series.add(new Series("C", "The C-series grants a breaker classification to all customers. Every formula inovlves the manipulation, modification, magnification, or cancelation of some principle of physics. The true magnitude of these formulas " +
                "is rarely in raw power and instead in their intelligent application. The magnificence of the C-series is often lost on those not already learned or unwilling to apply themselves in " +
                "understanding the related science.",findFormulae("C")));
        series.add(new Series("D", "The D-series formulas always involve the creation of matter, objects, or minions. Formulas tend to very reliably provide either a master or shaker rating. D-series powers tend to have a high strategic value, although their power may be minimal without " +
                "proper planning or ingenuity. With proper implementation, D-series powers can easily give customers home field advantage anywhere. Perfect for those strategists looking to have a wide, lasting effect on the battlefield.",findFormulae("D")));
        series.add(new Series("E", "The E-series is a fantasy fanatic's dream. All formulas contained within the E-series were chosen due to their whimsical, exotic, or other-worldly traits. Powers range from creating foreign landscapes and creatures, to applying traits to the user " +
                "or others never before seen on planet Earth. A team of E-series parahumans would leave onlookers spellbound. We cannot make any promises, but several of our E-series capes have inspired fantasy novels of their own. Customers interested in " +
                "a specific fantasy world trope may be interested in our mindset shaping program to increase their odds of successfully fufilling their desires .",findFormulae("E")));
        series.add(new Series("F", "The F-series can be described as the macabre counterpart to the E-series. All formulas in the F-series were selectively created to instill fear in enemies and bystanders alike. As such, F-series formulas " +
                "are more commonly purchased by prospective villains, but that is not to say all F-series customers weren't heroes. Each formula tends to grant powers related around one or more themes. Themes commonly chosen are bone, blood, " +
                "darkness, pain, and beasts.",findFormulae("F")));
        series.add(new Series("G", "The G-series represents formulas created specifically with a specific parahuman role in mind. These roles are built with common hero/villain tropes in mind like brawler or an Alexandria-style cape. This series is perfect for " +
                "customers that know the role they want to play on their future teams or for those looking for role ideas. Although these formulas tend to have less originality, they are not lacking in power and some subjects do develop incredibly unique, interesting," +
                " and/or eye-catching powers. Any G-series formulas would be a solid choice.",findFormulae("G")));
        series.add(new Series("H", "The H-series is a loose conglomerate of all formulas with a high probablity of granting mover powers. Some formulas are more traditionally 'pure' movers while others often supply mover abilities " +
                "as a secondary part of another power. H-series are good for those customers that want to be part of the action but do not want to risk obtaining a terribly destructive power or those desiring to support teams as a scout, secondary combatant, or other utility role.",findFormulae("H")));
        series.add(new Series("I", "The I-series provides customers with the durability to become their future team's tank and main brawler. I-series formulas are perfect for customers that envy any and all capes that can shrug off a hit without " +
                "blinking an eye. Like most brutes, I-series capes rarely have any ranged abilities. What they lack in long range combat they make up for when combat inevitably becomes short range. It should be noted that not all cases of " +
                "durability also include a comparative reduction in pain or increase in pain tolerance.",findFormulae("I")));
        series.add(new Series("J", "The J-series of formulas grant elemental powers. This series includes both formulas that grant elemental powers in general (ex. Immolation), and formulas that grant powers only ever involving one element " +
                "(ex. Igneous). Formulas in this series shy away from the rarer classifications (trump, changer, stranger, and tinker) in favor of the more common. This isn't to say that the powers granted from J-Series formulas aren't as valuable " +
                "as those granted by any other formula. Prospective blasters, especially, should take a serious look at the J-Series.",findFormulae("J")));
        series.add(new Series("K", "The K-series of formulas tend to grant the subject tinker-type powers, or powers involving technology. This series is often good for customers who do not desire to be part of flashy 'cape life', as the powers " +
                "often lend themselves to improving unseen traits. This series is very good for those who want to work behind the scenes, or who wish for abilities without becoming involved. Not to say, however, that K-series formulas cannot be prominent " +
                "fighting capes. Many PRT and villian teams alike desire the versatility of a tinker or the utility of a technology specialist.",findFormulae("K")));
        series.add(new Series("L", "The L-series represents the large majority of thinker powers not covered in the B-series. While the B-series most often deals with complex, abstract thought such as prediction and mental" +
                " processing speed, L-series formulas grant thinker powers that deal with much more concrete information. Skill mastery, problem-solving, and memory being chief among them. This series is perfect for customers desiring a thinker power " +
                "that will put them at the strategists table or easily elevate them to any desired executive position in any corporate setting.",findFormulae("L")));
        series.add(new Series("M", "The M-series rarely ever effect inorganic matter. These formulas deal with biology, either that of the subject, or the biology of those around them. Most formulas in the M-series will either primarily affect animal or plant physiology, " +
                "but not both. It should be noted that even if one is well-versed in the biological sciences, they should not assume knowledge of their powers, as many examples of what can only be termed 'alien biology' have been noted throughout testing. M-series is perfect " +
                "for customers looking to display their atunement with nature or their animalistic ferocity.",findFormulae("M")));
        series.add(new Series("N", "The N-series formulas involve encompasses all object-oriented powers. These are defined as any power that augments an object's natural properties or granting it new ones. Some formulas may allow customers to produce long-term effects while " +
                "others make more temporary changes. Object-oriented powers may allow for a wide variety of classifications, from armor that makes it's wearer nigh-indestructible to an axe that cuts steel as easily as water. All manner of powers " +
                "may await those that purchase an N-series formula, and with the current rarity of object-oriented powersets, the subsequent originality will quickly make any active customer very well-known.",findFormulae("N")));
        series.add(new Series("O", "Data File Corrupted",findFormulae("O")));
        series.add(new Series("P", "The P-series of formulas are perfect for customers who want to leave a legacy behind. Each formula in the P-series was chosen because the granted powers had a high probability of causing permanent changes. " +
                "Many of these powers don't lend themselves well to surprise combat situations, but when planned out properly, P-series powers have wide potential applications. Some of the formulas lend themselves to recreational use as well " +
                "as more traditional parahuman activities.",findFormulae("P")));
        series.add(new Series("Q", "The Q-series are grouped for convenient access for those customers interested in espionage and/or sabotage. Usually eliciting a stranger, mover, changer, or master classification, these formulas each " +
                "carry a different specialty. Although many customers believe the Q-series capes have a tendency for villainous behavior, the Protectorate is actually much in need of capes with specialties in information gathering. " +
                "All of our customers who chose a Q-series formula and then applied to the Protectorate were granted positions and soon became prominent members of their respective teams.",findFormulae("Q")));
        series.add(new Series("R", "The R-series are the group of formulas best suited for customers looking to obtain powers for recreational use only. As these powers aren't designed for combat, shakers and blasters are almost unseen while movers, thinkers, and strangers are by " +
                "far the most common. These formulas tend to be our most safe and reliable for obtaining one specific power. Perfect for fun on the weekends or as a once in a lifetime gift. It should be noted that gift recipients will have to be brought to our facility to imbibe  " +
                "the formulas, as it is too dangerous for any customer to take a vial outside of our facility without special permission and an escort.",findFormulae("R")));
        series.add(new Series("S", "The S-series are perfect for customers who want to support parahuman teams as a protector or medic. The focus of these formulas revolve around mitigating or healing damage. The exact role the customer desires " +
                "can be further narrowed down if required. Some formulas grant powers better suited to use in the midst of combat while others allow customers to remain at base and help their teams before or after combat.",findFormulae("S")));
        series.add(new Series("T", "The T-series is a strange series of formulas that all grant abilities pertaining to change. They all involve transforming an existing thing or things into something else, sometimes barely even resembling " +
                "the original object. The classifications of the resulting powers are surprisingly broad, with none being much more common than another. Any power gained from the T-series will almost certainly be unique.",findFormulae("T")));
        series.add(new Series("U", "The U-series conveniently groups together all formulas dealing with telekinesis or any of its derivatives.It is one of the smallest, most specific series in our directory, but it caters to a wide variety of " +
                "clients. The applications of U-series formulas range from strictly recreational to high level combat. If a customer has even an inclination toward telekinesis, they would be well advised to take the time to browse the U-series.",findFormulae("U")));
        series.add(new Series("V", "The V-series contain a set of formulas designed and chosen for their lethality. We caution customers in advance that using lethal force, whether or not they are employed by the Protectorate, " +
                "is likely to result in severe backlash. But if a customer wants to truly be deadly and feared because of it, this is the series for them.",findFormulae("V")));
        series.add(new Series("W", "The W-series represents all formulas that reliably bestow 'exotic element' powers. These can include powers dealing with time, space, radiation, and dimensional manipulation, among others. Understandably, " +
                "the W-series formulas tend to be priced higher than average, as they provide powers that are both original and powerful. Customers should be cautioned, however, that even if they can afford a W-series formula, it does " +
                "not mean it is the best option for them. Customers should always purchase the formula that is most in line with their goals and who they are as a person.",findFormulae("W")));
        series.add(new Series("X", "The X-series consists of all formulas most likely to result in changer powers. Customers should be cautioned that changer powers are unlikely to go unnoticed and those imbibing a formula from the X-series " +
                "almost guarantees a life as a career cape. Most formulas commonly provide at least a low Brute rating alongside any other sub-classifications.",findFormulae("X")));
        series.add(new Series("Y", "The Y-series contains the formulas with the overall highest deviation score of all commercially available formulas. These formulas are among the most powerful and fearsome abilities, but " +
                "many subjects have developed serious deviations. Even those without entirely life-altering changes have almost all been affected permanently in some way by a Y-series formula. Our research branch is constantly working " +
                "to improve our formulas, and when a stable-enough Y-series derivative is created, it will be added to a different, more appropriate series. If the customer is willing and wanting to take a gamble, the Y-series is a high-stakes " +
                "game with almost priceless rewards.",findFormulae("Y")));
        series.add(new Series("Z", "The Z-series of formulas tend to grant trump powers, or grant rare/unique combinations of powers. This series is perfect for those customers that always want one more trick up their sleeves in combat. " +
                "Inexperienced enemies will likely be thrown into a state of utter confusion. For those looking to make a profit, many teams would invest quite a lot to obtain a useful trump.",findFormulae("Z")));
    }
}
