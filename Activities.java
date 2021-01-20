public enum Activities implements Activity{
    ATTENDED{
        private String name = "attended";
        Supplement extension;

        @Override
        public void setExtension(Supplement extension){
            this.extension = extension;
        }

        @Override
        public String getFullActivity() {
            return this.name + " " + this.extension.getName();
        }
    },

    SEPARATED{
        private String name = "separated";
        Supplement extension;

        @Override
        public void setExtension(Supplement extension){
            this.extension = extension;
        }

        @Override
        public String getFullActivity() {
            return this.name + " " + this.extension.getName();
        }
    },

    GOT_UP{
        private String name = "got up";
        Supplement extension;

        @Override
        public void setExtension(Supplement extension){
            this.extension = extension;
        }

        @Override
        public String getFullActivity() {
            return this.name;
        }
    },

    SWIMMING{
        private String name = "swimming";
        Supplement extension;

        @Override
        public void setExtension(Supplement extension){
            this.extension = extension;
        }

        @Override
        public String getFullActivity() {
            return this.name + " " + this.extension.getName();
        }
    },

    TRIED{
        private String name = "tried";
        Supplement extension;

        @Override
        public void setExtension(Supplement extension){
            this.extension = extension;
        }

        @Override
        public String getFullActivity() {
            return this.name + " " + this.extension.getName();
        }
    },

    GO_DOWN{
        private String name = "go down";
        Supplement extension;

        @Override
        public void setExtension(Supplement extension){
            this.extension = extension;
        }

        @Override
        public String getFullActivity() {
            return this.name;
        }
    },

    BEING{
        private String name = "being";
        Supplement extension;

        @Override
        public void setExtension(Supplement extension){
            this.extension = extension;
        }

        @Override
        public String getFullActivity() {
            return this.name;
        }
    },

    COULD{
        private String name = "could";
        Supplement extension;

        @Override
        public void setExtension(Supplement extension){
            this.extension = extension;
        }

        @Override
        public String getFullActivity() {
            return this.name;
        }
    },

    CALCULATE{
        private String name = "calculate";
        Supplement extension;

        @Override
        public void setExtension(Supplement extension){
            this.extension = extension;
        }

        @Override
        public String getFullActivity() {
            return this.name + " " + this.extension.getName();
        }
    },

    USE{
        private String name = "use";
        Supplement extension;

        @Override
        public void setExtension(Supplement extension){
            this.extension = extension;
        }

        @Override
        public String getFullActivity() {
            return this.name + " " + this.extension.getName();
        }
    },

    EXPOSED{
        private String name = "exposed";
        Supplement extension;

        @Override
        public void setExtension(Supplement extension){
            this.extension = extension;
        }

        @Override
        public String getFullActivity() {
            return this.name + " " + this.extension.getName();
        }
    },

    CONTINUED{
        private String name = "continued";
        Supplement extension;

        @Override
        public void setExtension(Supplement extension){
            this.extension = extension;
        }

        @Override
        public String getFullActivity() {
            return this.name + " " + this.extension.getName();
        }
    },

    WORK{
        private String name = "work";
        Supplement extension;

        @Override
        public void setExtension(Supplement extension){
            this.extension = extension;
        }

        @Override
        public String getFullActivity() {
            return this.name;
        }
    },

    TRANSFERRED{
        private String name = "transferred";
        Supplement extension;

        @Override
        public void setExtension(Supplement extension){
            this.extension = extension;
        }

        @Override
        public String getFullActivity() {
            return this.name + " " + this.extension.getName();
        }
    },

    DEPARTED{
        private String name = "departed";
        Supplement extension;

        @Override
        public void setExtension(Supplement extension){
            this.extension = extension;
        }

        @Override
        public String getFullActivity() {
            return this.name;
        }
    },

    CHECKED{
        private String name = "checked";
        Supplement extension;

        @Override
        public void setExtension(Supplement extension){
            this.extension = extension;
        }

        @Override
        public String getFullActivity() {
            return this.name + " " + this.extension.getName();
        }
    };
}
