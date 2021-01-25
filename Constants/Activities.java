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
            return name + " " + subject.getName();
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
}
