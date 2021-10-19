package utilities;

import org.testng.Assert;
import pages.*;

public class Pages {

    private ShoePage shoePage;
    private JanuaryPage januaryPage;
    private FebruaryPage februaryPage;
    private MarchPage marchPage;
    private AprilPage aprilPage;
    private MayPage mayPage;


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






}
