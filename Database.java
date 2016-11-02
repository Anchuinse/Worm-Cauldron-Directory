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

    private void initializeSubjects()
    {
        subjects.add(new Subject("A1307-023", "Striker/Trump 2", "Subject became able to tag capes for periods of time never exceeding one hour. During this period she was able to switch any two tagged capes' powersets at will. " +
                "Was not able to gain powers herself; could not sense tagged capes' locations, only powersets as 'flavours'.", 113));
        subjects.add(new Subject("R2001-003", "Mover 8", "Subject developed flight with perfect maneuverability and a top recorded speed of 220 km/hr. Trailed by an afterimage.", 74));
        subjects.add(new Subject("B8605-124", "Thinker/Master 1-3", "Subject developed a passive aura that slowly increased the speed and quality of work by those around them." +
                " Aura effect reset if a target was forced to switch tasks.", 99));
        subjects.add(new Subject("D4234-039", "Shaker 7", "Subject displays ability to grow massive amounts of ice from any ice in the area. Although he could pull it in chunks," +
                " he prefferred to create spikes of ice in sets of 30, although with less control over exact shape.", 212));
        subjects.add(new Subject("B7160-088", "Stranger 4", "Subject is virtually undetectable by all machines including cameras, heart rate monitors, etc. Video/camera feeds seemed to not register the pixel change when subject " +
                "is in view and record the last known background behind subject until she moved.", 129));
        subjects.add(new Subject("X0104-015", "Changer 6, Shaker 3, Brute 1", "Subject's changer form consists of a pulsating, folding cloud of white ash. In human form, any physical harm stronger than the average punch " +
                "caused them to explode into their nebulus form, mitigating virtually all of the damage.", 106));
        subjects.add(new Subject("G5525-012", "Brute 4", "Subject developed the ability to manifest claws of force that are much sharper than they appear. When paired with a minor strength boost," +
                " she could shear through thin steel. Also, subject noted pain no longer effected her focus in any reasonable degree.", 121));
        subjects.add(new Subject("J3257-217", "Shaker/Blaster 6", "Subject displayed ability to create baseball-sized stones. Each stone fizzed and popped, then would explode exactly 9.3 seconds after creation," +
                " coating its surroundings in viscous lava. Subject often threw stones as a grenade.", 139));
        subjects.add(new Subject("J3219-112", "Brute 5", "Subject displays the rare shadow element. The element seems to do physical damage, although the exact kind varies." +
                "This subject possesses the ability to flare out their aura as spikes to damage everything within 4 feet of them. The spikes flared fast enough, the original hypothesis was a concussive burst" +
                " as the technician didn't see the spikes.", 135));
        subjects.add(new Subject("M0982-223", "Master/Shaker 10", "Subject is one of the most powerful capes to come from imbibing M0982. Subject places crystalline flowers that spread 'neuro-pollen' that amplifies people's emotional states and makes them more suggestible. " +
                "Sad people can be convinced to commit suicide without previous depressive symptoms while any irritation can quickly be pushed into homicidal tendencies. Field tests were abandonded, as riots often ensued " +
                "even without provocation or suggestion.", 270));
        subjects.add(new Subject("A4613-198", "Striker/Master 2", "Subject gained ability to slow the mental processing speed of people he touched, with increased effect if he reapplied the effect.", 111));
        subjects.add(new Subject("G1976-052", "Mover 4, Stranger 1", "Subject was able to reliably manifest two copies of himself and everything on his person. These copies acted independent of one another, but the 'real' subject could teleport to either copy." +
                " This would cause both copies to disappear. If either copy became more than 200 ft from the original, it would dissipate.", 138));
        subjects.add(new Subject("D8120-118", "Master 5-8", "Originally thought to have been a rare dud, subject discovered they could use bones to manifest simulacrums of the deceased." +
                " They could understand complex spoken instructions, but human constructs could not speak. All creations decayed back to the original bone in 1 minute.", 156));
        subjects.add(new Subject("E7895-059", "Master 5", "Subject could create and control a giant, monochrome version of themselves. She could only make the giant between 16 and 60 feet tall. Any creation over 30 feet was observed to be mentally draining. Besides size, the giant appeared to be a normal human on all accounts.", 174));
        subjects.add(new Subject("J2105-028", "Brute/Striker/Breaker 10", "Subject's body became a glassy white-blue. Their entire body became a zone of absolute zero, with no apparent control of the change. Upon realisation that htye may never be able to control their power" +
                " and thus never reenter non-cape society, they turned violent. Physical and heat damage were seemingly ignored, but a time cape was able to deal with the situation. Subject terminated.", 226));
        subjects.add(new Subject("K9768-023", "Tinker 2", "Subject could modify almost every household appliance to send information to their phone. After that became boring, they modified their phone " +
                "to absorb all non-encrypted data from networks, and after that became tiresome, they reorganized our computers' data storage systems. Subject hired and currently employed.", 126));
        subjects.add(new Subject("K2207-103", "Shaker 6, Brute 1", "One of the non-Tinker results, subject displays ability to draw all moisture in a given area to form a sheen of water on their skin." +
                " Their dessication aura was powerful enough to pull water out of living things that , if not removed, would die. A secondary regeneration was also obeserved that would heal most cuts within a minute." +
                " Regeneration was only observed when aura had pulled enough water to the subject.", 159));
        subjects.add(new Subject("U1085-082", "Shaker 2", "Subject grows crystal polygons that are roughly the size of walnuts from his palms. He can throw them to have them detonate with a surprisingly powerful wave." +
                " The wave of energy has a weak electrical element, but the main component is a pressure wave that pushes those caught in the area somewhere between 5 and 15 feet. Subject is not effected by his own explosions.", 109));
        subjects.add(new Subject("B4412-143", "Thinker 4", "Subject developed a version of psychometry in which, upon making physical contact with an object, they can view the object and its surroundings since its creation." +
                " The object must be less than 8 cubic feet in size, and non-manmade objects' 'creation' is whenever it first took on its approximate curret shape and size.", 94));
        subjects.add(new Subject("Z0111-037", "Blaster 1, Trump 5", "Subject fires a prismatic ray that reduces the area a parahuman can effect to only their personal reach. Does not seem to effect strikers," +
                " brutes, or anyone with a melee range, but can be strategically debilitating to blasters, shakers, and masters, among others.", 119));
        subjects.add(new Subject("A5082-041", "Mover/Stranger 7 (sub Shaker 1, Thinker 1)", "Subject, while not observed, stops all time except in a small area around themselves. Originally thought they gained speed," +
                " until a pair of timers were used to verify subject's hypothesis. Remote viewing (machine, thinker, etc.) did not 'count' as observation.", 149));
        subjects.add(new Subject("Z1882-041", "Striker 1, Brute 2", "Subject developed a set of three powers. The first is a fiery kick attack, the second is a minor regenerative ability by absorbing water." +
                " Their final, and most interesting ability, is a 'reset' abilityy that sometimes resets the damage of an attack in the next ten seconds as if it hadn't happened. This reset power isn't terribly reliable and doesn't work on large AoE attacks.", 122));
    }

    private void initializeFormulae()
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
                " However, it was quite common for paatients to be able to pull walls into existence that stood 10*10*5 feet in twenty seconds or less. The most common forms of matter were sturdy solids, although softer solids and even organic plant matter (D4234-008) have been observed.", "Defense, Range 2, Grow, Matter Type, Durable 2, Magnitude 5, Clumsy 1, Immobile", findSubjects("D4234")));
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
                "Perfect for customers desiring a brute classification. The only true non-brute subject was a tinker (G5525-161) who specialized in biological durability and regeneration, giving him a subclass of brute. 161 created a serum that allowed a dog " +
                "to sustain a land mine without apparent injury.", "STR Hyperstat, CON Hyperstat, CON 6, Defense, Durability 3", findSubjects("G5525")));
        formulae.add(new Formula("Igneous", "J3257", 6,6,8,4,7, "Sample J3257 is optimal for any customer who idolizes volcanoes. It can provide a vast array of powers, all involving a common ability to generate lava. Examples: toggled aura that heated rock to magma (J3257-013), " +
                "pools of lava used as portals (J3257-105), lava golem changer (J3257-009), animate lava vipers (J3257-104), lava skin (J3257-007). Most patients possess a secondary immunity to the heat, some even enjoying it. Other predictable outcomes included glowing eyes, and craig-like " +
                "fissures in the patient's skin (both temporary and active when using powers). Any major deviations were almost always lethal, including a subject that vomitted lava, but who's throat had no protection from the heat (J3257-005). Subject was terminated for their own wellbeing " +
                "before futher tests could be conducted.", "Attack, Power 5, Create, Lava, Obvious, Area 1", findSubjects("J3257")));
        formulae.add(new Formula("Immolation", "J3219", 10,9,6,2,7, "Rarely is a sample as specific as J3219. It only ever grants a variation on a personal energy field. Out of 213 patients, the only unique forms of energy were fire, frost, electricity, kinetic, laser, and a rare one we termed 'shadow'. " +
                "Every patient, upon activating their power, would become wreatherd in their associated element. Secondary powers, such as flaring the aura out or projecting volleys of the element were common. A small subset of patients were masters with the ability to apply the same personal " +
                "aura effect to their minions.", "Partial, Energy^, Attack, Magnitude 2, Defense, Durability 2, Regen 1, Impressive", findSubjects("J3219")));
        formulae.add(new Formula("Fragrant", "M0982", 4,10,2,4,2, "Sample M0982 imbues the patient with some form of control over hormones and pheromones. Battle applications traditionally remain limited. Notable exceptions include a perfume tinker, a shaker, and a striker who could cause muscle paralysis " +
                "and intoxication respectively (M0982-006)(M0982-100)(M0982-030). Mental deviations are more common, especially a lack of protection from personal pheromones.", "Utility, Range 1, Area 2, Time 2, Pheromones, Lasting 1", findSubjects("M0982")));
        formulae.add(new Formula("Layer", "A4613", 1,4,5,2,3, "Sample A4613 exhibits a unique array of powers that it grants patients. Almost all varieties have been observed, elemntal powers as often as those that manipulate the laws of physics or the behavior of others. Every power has the unique property that, " +
                "to reach its full potential, must be applied several times over. Many patients develop seemingly trivial powers that, with enough time for preparation, end up rivalling any competent cape. Deviations are as varied as the powers given. Tinker powers are quite common.", "Lasting 3, Layered 3", findSubjects("A4613")));
        formulae.add(new Formula("Jaunt", "G1976", 8,3,5,1,4, "Sample G1976 is so named as it grants a teleportation or portal mover power. Most patients had relatively short range limits, the largest topping out around 300m. Basic, line of sight teleportation is a commonly granted power, but many patients have unique 'flavours' of powers. " +
                "The more interesting examples include a teleporter who slowed time around their exit point (G1976-005) and a portal maker that turned all vertical surfaces in an area into portals with random destinations (G1976-109).", "Utility, Range 3, Teleport/Portal", findSubjects("G1976")));
        formulae.add(new Formula("Deus", "D8120", 9,6,6,2,6, "Sample D8120 is perfect for capes who wish to participate in combat indirectly. It provides, with 100% accuracy, a master type projection power, essentially creating a puppt for the patient to control. The only significant deviations observed involved mental changes; " +
                "no significant physical deviations were obeserved. Subject D8120-035, for example, was an introverted, docile man. When projecting his construct, a sixty foot lion, he became aggressive and violent. Subject terminated after threatening to reveal us to authorities unless we permanently boosted his powers " +
                "(a currently impossible feat).", "Utility, Create, Range 6, Utility, Sensing, Kat's a Twin!, Always On", findSubjects("D8120")));
        formulae.add(new Formula("Prince", "E7895", 3,7,5,1,5, "Sample E7895 toes the line between shaker and master for almost all subjects. The large majority of subjects gained the ability to manifest one or two 'minions' although some required direct, conscious control while others required only " +
                "general direction. Arguably these are master-type abilities (ex. a pair of shadow cats [E7895-120]), but it is difficult to see how manipulating a crystal spear (E7895-095) or a small sun (E7895-013) classifies as anything except blaster and shaker, respectively. Secondary mover ratings " +
                "from riding the manifestation can be excepted in cases where manifestations are solid enough to suppor subject.", "Manifest, Target Number 1, Range 4, target type, size increase 1", findSubjects("E7895")));
        formulae.add(new Formula("Rime", "J2105", 8,5,7,3,6, "Sample J2105 grants powers that tned to drastically lower temperature and/or inertia in an area, usually in close proximity to the subject. Some auras extend several hundred feet while other powers only effect the subject's own body. A few subjects demonstrated " +
                "the ability to blast a large area not centered on them, usually as a cone or grenade, for a similar effect. Minor deviations usually involve perpetually cold skin, constant cloudy breath, or a frosting of the subject's eyes.", "Frost, Power 5, Clumsy 1, Penetration 2, Automatic, Conditional", findSubjects("J2105")));
        formulae.add(new Formula("Pinnacle", "K9768", 8,3,4,2,4, "Although the K-series of formulas are grouped as commonly producing tinker powers, sample K9768 is the only formula to only produce tinkers. Sample K9768 tends " +
                "to produce tinkers with specializations focused around optimizing technology. Known examples include miniaturization, durable machinery, regenerating machines, and machines with near-limitless redundancies. As tinker powers only affect the brain, " +
                "only mental deviations have been observed. A notable subject developed a disgust with any non-tinker tech and refused to use 'lesser' technology. Even some rough-looking tinker tech was not 'up to standard' (K9768-052).", "Efficiency 3, Inspiration 2, Speed 2, Starting Ideas 5, Repetition 2", findSubjects("K9768")));
        formulae.add(new Formula("Lodestone", "K2207", 3,8,7,1,6, "Continuing the K-series pattern of creating tinkers, sample K2207 grants tinker powers involving attraction fields, barriers, and other area of effect, zone-type effects. Around half of " +
                "patients instead developed non-tinker powers with the same general base of zone-type powers, lending them toward a shaker classification. The granted powers can be as specific as an attraction field that draws in bacteria (K2207-006) " +
                "or as general as a forcefield sphere that prevents everything from crossing the edge (K2207-105).", "Area 4, Magnitude 4, Attract", findSubjects("K2207")));
        formulae.add(new Formula("Minutia", "U1085", 2,7,5,3,4, "Sample U1085 grants control of one or more objects, never bigger than 10cm. Some patients only control one object while others control thousands. Some create their own " +
                "objects, others must find them. The resulting PRT rating can be just as varied: Brute 3 protected by forcefields (U1085-008) up to Shaker 9 who controls gravity-point orbs (U1085-113).", "Conditional (small), Control 2, Permanent", findSubjects("U1085")));
        formulae.add(new Formula("Matrix", "B4412", 4,1,7,2,5, "Sample B4412 chiefly grants thinker powers that deal with massive amounts of data. It is common for granted powers to be quite taxing, but they are also, very commonly, powerful. The mass of data can be complex, like ranking six possible answers" +
                " to a question in order of 'correctness' (B4412-077) or simple like the names and llocations of every person around the patient (B4412-093). Mental deviations often tend toward anxiety and mania involving visual hallucinations.", "Utility, Knowing (?), Control 2", findSubjects("B4412")));
        formulae.add(new Formula("Jealousy", "Z0111", 8,7,5,0,6, "Sample Z0111 almost always grants trump-class powers that deal with copying other parahumans' powers. No serious deviations have been noted. The powers are " +
                "sometimes copied to others, sometimes to the subject and some subjects copy the power(s) in full while other patients copy the powers in a weakened or altered state.", "Utility, Time 2", findSubjects("Z0111")));
        formulae.add(new Formula("Observance", "A5082", 2,9,9,1,8, "Sample A5082 reliably grants powerful abilities in the top tier of their given categories, and was created by mixing several volatile test formulas with balancing agents." +
                " Interestingly, all powers granted by sample A5082 seem to be either only active while being observed, or they only work when not observed. It appears all powers activate automatically and cannot be switched off by the users.", "Conditional (viewed), Automatic", findSubjects("A5082")));
        formulae.add(new Formula("Medley", "Z1882", 3,2,3,0,3, "Sample Z1882 was created by mixing many stable, but mostly inert, test formulas. This sample always produces the equivalent of a grab-bag parahuman. These parahumans often have 3 or more unique powers, " +
                "but each individual power is relatively weak. The number of powers and the nature of each power varies from patient to patient, although most powers would not rate higher than a 2 or 3 on the PRT scale.", "at least 2 different powers, at least 2 different power qualities", findSubjects("Z1882")));
    }

    private void initializeSeries()
    {
        series.add(new Series("A", "The A-series represents formulas that, although they may grant a variety of powers, always have a specific style or restriction.",findFormulae("A")));
        series.add(new Series("B", "The B-series contains all formulas that deal almost exclusively with effecting the mind of the subject or the minds of those around him." +
                " Because of this, B-series formulas often result in powers with thinker or stranger ratings.",findFormulae("B")));
        series.add(new Series("C", "description",findFormulae("C")));
        series.add(new Series("D", "The D-series formulas always involve the creation of matter, objects, or minions. Perfect for those looking to have a wide, lasting effect on the battlefield.",findFormulae("D")));
        series.add(new Series("E", "description",findFormulae("E")));
        series.add(new Series("F", "description",findFormulae("F")));
        series.add(new Series("G", "description",findFormulae("G")));
        series.add(new Series("H", "description",findFormulae("H")));
        series.add(new Series("I", "description",findFormulae("I")));
        series.add(new Series("J", "The J-series of formulas grant elemental powers. This series includes both formulas that grant elemental powers in general (ex. Immolation), and " +
                "formulas that grant powers only ever involving one element (ex. Igneous).",findFormulae("J")));
        series.add(new Series("K", "The K-series of formulas tend to grant the subject tinker-type powers, or powers involving technology.",findFormulae("K")));
        series.add(new Series("L", "description",findFormulae("L")));
        series.add(new Series("M", "The M-series rarely ever effect inorganic matter. These formulas deal with biology, either that of the subject, or the biology of those around " +
                "them. Most formulas in the M-series will either primarily affect animal biology or plant biology, but not both.",findFormulae("M")));
        series.add(new Series("N", "description",findFormulae("N")));
        series.add(new Series("O", "description",findFormulae("O")));
        series.add(new Series("P", "description",findFormulae("P")));
        series.add(new Series("Q", "description",findFormulae("Q")));
        series.add(new Series("R", "The R-series are the group of formulas best suited for customers looking to obtain powers for recreational use only." +
                " These formulas tend to be our most safe and reliable, although their use in combat may be limited.",findFormulae("R")));
        series.add(new Series("S", "description",findFormulae("S")));
        series.add(new Series("T", "description",findFormulae("T")));
        series.add(new Series("U", "description",findFormulae("U")));
        series.add(new Series("V", "description",findFormulae("V")));
        series.add(new Series("W", "description",findFormulae("W")));
        series.add(new Series("X", "description",findFormulae("X")));
        series.add(new Series("Y", "description",findFormulae("Y")));
        series.add(new Series("Z", "The Z-series of formulas tend to grant trump powers, or grant rare and/or unique powers or combinations of powers.",findFormulae("Z")));
    }
}
