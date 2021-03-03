package Constants;

import Inanimate.Entity;
import Inanimate.Supplement;
import Place.Place;

public enum Activities implements Activity {
    ATTENDED{
        private String name = "attended by";

        @Override
        public String getName() {
            return this.name;
        }
    },

    SEPARATED{
        private String name = "separated";

        @Override
        public String getName() {
            return this.name;
        }
    },

    GOT_UP{
        private String name = "got up";

        @Override
        public String getName() {
            return this.name;
        }
    },

    SWIMMING{
        private String name = "swimming";
        private Poses pose;

        public void setPose(Poses pose){
            this.pose = pose;
        }
        @Override
        public String getName() {
            return this.name + " in " + pose.getName() + " pose(s)";
        }
    },

    TRIED{
        private String name = "tried";

        @Override
        public String getName() {
            return this.name;
        }
    },

    GO_DOWN{
        private String name = "go down";

        @Override
        public String getName() {
            return this.name;
        }
    },

    BEING{
        private String name = "being";

        @Override
        public String getName() {
            return this.name;
        }
    },

    COULDNOT{
        private String name = "couldn't";

        @Override
        public String getName() {
            return this.name;
        }
    },

    CALCULATE{
        private String name = "calculate";

        @Override
        public String getName() {
            return this.name;
        }
    },

    USE{
        private String name = "use";

        @Override
        public String getName() {
            return this.name;
        }
    },

    EXPOSED{
        private String name = "exposed";
        private Entity subject;

        public void setSubject(Entity subject){
            this.subject = subject;
        }

        @Override
        public String getName() {
            return name + " " + subject.getInanimate();
        }
    },

    DONTAFFECTED{
        private String name = "don't affected";

        @Override
        public String getName() {
            return this.name;
        }
    },

    CONTINUED{
        private String name = "continued";

        @Override
        public String getName() {
            return this.name;
        }
    },

    WORK{
        private String name = "work";

        @Override
        public String getName() {
            return this.name;
        }
    },

    TRANSFERRED{
        private String name = "transferred";
        private Supplement object;
        private Place from;
        private Place to;

        public void setObject(Supplement object){
            this.object = object;
        }

        public void setFrom(Place from){
            this.from = from;
        }

        public void setTo(Place to){
            this.to = to;
        }

        @Override
        public String getName() {
            return this.name + " " + object.getSupplement() + " from " + from.getName() + " to " + to.getName();
        }
    },

    DEPARTED{
        private String name = "departed";

        @Override
        public String getName() {
            return this.name;
        }
    },

    CHECKED{
        private String name = "checked";

        @Override
        public String getName() {
            return this.name;
        }
    },

    CHOOSE{
        private String name = "choose";

        @Override
        public String getName() {
            return this.name;
        }
    },

    TAKE{
        private String name = "take";

        @Override
        public String getName() {
            return this.name;
        }
    },

    DESIGN{
        private String name = "design";

        @Override
        public String getName() {
            return this.name;
        }
    },
    
    STAY{
        private String name = "stay";

        @Override
        public String getName() {
            return this.name;
        }
    },

    CLOSE{
        private String name = "close";

        @Override
        public String getName() {
            return this.name;
        }
    },

    
    ASK{
        private String name = "ask";
        private String about;


        public void setAbout(String about) {
            this.about = about;
        }
        @Override
        public String getName() {
            return this.name + " about " + about;
        }
    },

    LAUGH{
        private String name = "laugh";

        @Override
        public String getName() {
            return this.name;
        }
    },

    PRETENDED{
        private String name = "pretended";

        @Override
        public String getName() {
            return this.name;
        }
    },

    DONTHEAR{
        private String name = "don't hear";

        @Override
        public String getName() {
            return this.name;
        }
    },

    FINISH{
        private String name = "finish";

        // x class что надо закончить через Activity

        @Override
        public String getName() {
            return this.name;
        }
    },

    CONFESS{
        private String name = "confess";

        @Override
        public String getName() {
            return this.name;
        }
    },

    DISCOVER{
        private String name = "discover";

        @Override
        public String getName() {
            return this.name;
        }
    },

    ALLOW{
        private String name = "allow";

        @Override
        public String getName() {
            return this.name;
        }
    },

    SAVE{
        private String name = "save";

        @Override
        public String getName() {
            return this.name;
        }
    };

	public void setSubject(Entity confusion) {
	}

	public void setFrom(Place initial) {
	}

	public void setTo(Place ultimate) {
	}

	public void setObject(Supplement device) {
	}

	public void setPose(Poses different) {
	}

	public void setAbout(String about) {

	}
}
