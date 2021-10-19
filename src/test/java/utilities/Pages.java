package utilities;

import org.testng.Assert;
import pages.FebruaryPage;
import pages.JanuaryPage;
import pages.ShoePage;

public class Pages {

    private ShoePage shoePage;
    private JanuaryPage januaryPage;
    private FebruaryPage februaryPage;


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






}
