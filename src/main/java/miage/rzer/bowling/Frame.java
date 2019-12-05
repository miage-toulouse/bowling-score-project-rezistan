package miage.rzer.bowling;

public class Frame {

    private Integer essai1;
    private Integer essai2;
    private Frame nextFrame;

    /**
     * Constructeur
     * @param essai1
     * @param essai2
     * @param nextFrame
     */
    public Frame(Integer essai1, Integer essai2, Frame nextFrame) {
        this.essai1 = essai1;
        this.essai2 = essai2;
        this.nextFrame = nextFrame;
    }

    /**
     *
     * @param essai1
     * @param nextFrame
     */
    public Frame(Integer essai1, Frame nextFrame) {
        this.essai1 = essai1;
        this.nextFrame = nextFrame;
    }

    public Integer getEssai1() {
        return essai1;
    }

    public Integer getEssai2() {
        return essai2;
    }

    public Frame getNextFrame() {
        return nextFrame;
    }

    public int getSomme() {
         if (essai2 == null) {
             return essai1;
         }
         return essai1+essai2;
    }

    /**
     * Teste la validité d'un Frame
     * @return
     */
    public boolean isValid() {
        if (essai1 == null) {
            return false;
        }
        if (essai2 == null && essai1 != 10) {
            return false;
        }
        if (this.getSomme() > 10) {
            return false;
        }
        return true;
    }
}
