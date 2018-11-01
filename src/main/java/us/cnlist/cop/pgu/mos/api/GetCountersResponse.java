package us.cnlist.cop.pgu.mos.api;

public class GetCountersResponse {
    private String errorMessage;

    private Result result;

    private String session_id;

    private String request_id;

    private String errorCode;

    private String execTime;

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public String getSession_id() {
        return session_id;
    }

    public void setSession_id(String session_id) {
        this.session_id = session_id;
    }

    public String getRequest_id() {
        return request_id;
    }

    public void setRequest_id(String request_id) {
        this.request_id = request_id;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getExecTime() {
        return execTime;
    }

    public void setExecTime(String execTime) {
        this.execTime = execTime;
    }

    @Override
    public String toString() {
        return "ClassPojo [errorMessage = " + errorMessage + ", result = " + result + ", session_id = " + session_id + ", request_id = " + request_id + ", errorCode = " + errorCode + ", execTime = " + execTime + "]";
    }

    public static class Result {
        private String stat_title;

        private Archive[] archive;

        private Counters[] counters;

        public String getStat_title() {
            return stat_title;
        }

        public void setStat_title(String stat_title) {
            this.stat_title = stat_title;
        }

        public Archive[] getArchive() {
            return archive;
        }

        public void setArchive(Archive[] archive) {
            this.archive = archive;
        }

        public Counters[] getCounters() {
            return counters;
        }

        public void setCounters(Counters[] counters) {
            this.counters = counters;
        }

        @Override
        public String toString() {
            return "ClassPojo [stat_title = " + stat_title + ", archive = " + archive + ", counters = " + counters + "]";
        }
    }

    public static class Archive {
        private String cold_indication;

        private String period;

        private String hot_indication;

        public String getCold_indication() {
            return cold_indication;
        }

        public void setCold_indication(String cold_indication) {
            this.cold_indication = cold_indication;
        }

        public String getPeriod() {
            return period;
        }

        public void setPeriod(String period) {
            this.period = period;
        }

        public String getHot_indication() {
            return hot_indication;
        }

        public void setHot_indication(String hot_indication) {
            this.hot_indication = hot_indication;
        }

        @Override
        public String toString() {
            return "ClassPojo [cold_indication = " + cold_indication + ", period = " + period + ", hot_indication = " + hot_indication + "]";
        }
    }

    public static class Counters {
        private Indications[] indications;

        private String counterId;

        private String num;

        private String checkup;

        private String type;

        public Indications[] getIndications() {
            return indications;
        }

        public void setIndications(Indications[] indications) {
            this.indications = indications;
        }

        public String getCounterId() {
            return counterId;
        }

        public void setCounterId(String counterId) {
            this.counterId = counterId;
        }

        public String getNum() {
            return num;
        }

        public void setNum(String num) {
            this.num = num;
        }

        public String getCheckup() {
            return checkup;
        }

        public void setCheckup(String checkup) {
            this.checkup = checkup;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        @Override
        public String toString() {
            return "ClassPojo [indications = " + indications + ", counterId = " + counterId + ", num = " + num + ", checkup = " + checkup + ", type = " + type + "]";
        }
    }

    public static class Indications {
        private String indication;

        private String period;

        public String getIndication() {
            return indication;
        }

        public void setIndication(String indication) {
            this.indication = indication;
        }

        public String getPeriod() {
            return period;
        }

        public void setPeriod(String period) {
            this.period = period;
        }

        @Override
        public String toString() {
            return "ClassPojo [indication = " + indication + ", period = " + period + "]";
        }
    }


}