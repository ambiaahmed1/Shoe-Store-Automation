package utilities;

import pages.*;

public class Pages {

    private ShoePage shoePage;
    private JanuaryPage januaryPage;
    private FebruaryPage februaryPage;
    private MarchPage marchPage;
    private AprilPage aprilPage;
    private MayPage mayPage;
    private JunePage junePage;
    private JulyPage julyPage;
    private AugustPage augustPage;
    private SeptemberPage septemberPage;
    private OctoberPage octoberPage;
    private NovemberPage novemberPage;
    private DecemberPage decemberPage;
    private AllShoes allShoes;


    public ShoePage shoePage() {
        if (shoePage == null) {
            shoePage = new ShoePage();
        }
        return shoePage;
    }

    public JanuaryPage januaryPage() {
        if (januaryPage == null) {
            januaryPage = new JanuaryPage();
        }
        return januaryPage;
    }

    public FebruaryPage februaryPage() {
        if (februaryPage == null) {
            februaryPage = new FebruaryPage();
        }
        return februaryPage;
    }

    public MarchPage marchPage() {
        if (marchPage == null) {
            marchPage = new MarchPage();
        }
        return marchPage;
    }

    public AprilPage aprilPage() {
        if (aprilPage == null) {
            aprilPage = new AprilPage();
        }
        return aprilPage;
    }

    public MayPage mayPage() {
        if (mayPage == null) {
            mayPage = new MayPage();
        }
        return mayPage;
    }

    public JunePage junePage() {
        if (junePage == null) {
            junePage = new JunePage();
        }
        return junePage;
    }

    public JulyPage julyPage() {
        if (julyPage == null) {
            julyPage = new JulyPage();
        }
        return julyPage;
    }

    public AugustPage augustPage() {
        if (augustPage == null) {
            augustPage = new AugustPage();
        }
        return augustPage;
    }

    public SeptemberPage septemberPage() {
        if (septemberPage == null) {
            septemberPage = new SeptemberPage();
        }
        return septemberPage;
    }

    public OctoberPage octoberPage() {
        if (octoberPage == null) {
            octoberPage = new OctoberPage();
        }
        return octoberPage;
    }

    public NovemberPage novemberPage() {
        if (novemberPage == null) {
            novemberPage = new NovemberPage();
        }
        return novemberPage;
    }

    public DecemberPage decemberPage() {
        if (decemberPage == null) {
            decemberPage = new DecemberPage();
        }
        return decemberPage;
    }

    public AllShoes allShoes() {
        if (allShoes == null) {
            allShoes = new AllShoes();
        }
        return allShoes;
    }


}
