package qt.bean;

import java.util.ArrayList;
import java.util.List;

public class AdminExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdminExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andUnameIsNull() {
            addCriterion("Uname is null");
            return (Criteria) this;
        }

        public Criteria andUnameIsNotNull() {
            addCriterion("Uname is not null");
            return (Criteria) this;
        }

        public Criteria andUnameEqualTo(String value) {
            addCriterion("Uname =", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotEqualTo(String value) {
            addCriterion("Uname <>", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameGreaterThan(String value) {
            addCriterion("Uname >", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameGreaterThanOrEqualTo(String value) {
            addCriterion("Uname >=", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameLessThan(String value) {
            addCriterion("Uname <", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameLessThanOrEqualTo(String value) {
            addCriterion("Uname <=", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameLike(String value) {
            addCriterion("Uname like", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotLike(String value) {
            addCriterion("Uname not like", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameIn(List<String> values) {
            addCriterion("Uname in", values, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotIn(List<String> values) {
            addCriterion("Uname not in", values, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameBetween(String value1, String value2) {
            addCriterion("Uname between", value1, value2, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotBetween(String value1, String value2) {
            addCriterion("Uname not between", value1, value2, "uname");
            return (Criteria) this;
        }

        public Criteria andUpasswdIsNull() {
            addCriterion("Upasswd is null");
            return (Criteria) this;
        }

        public Criteria andUpasswdIsNotNull() {
            addCriterion("Upasswd is not null");
            return (Criteria) this;
        }

        public Criteria andUpasswdEqualTo(String value) {
            addCriterion("Upasswd =", value, "upasswd");
            return (Criteria) this;
        }

        public Criteria andUpasswdNotEqualTo(String value) {
            addCriterion("Upasswd <>", value, "upasswd");
            return (Criteria) this;
        }

        public Criteria andUpasswdGreaterThan(String value) {
            addCriterion("Upasswd >", value, "upasswd");
            return (Criteria) this;
        }

        public Criteria andUpasswdGreaterThanOrEqualTo(String value) {
            addCriterion("Upasswd >=", value, "upasswd");
            return (Criteria) this;
        }

        public Criteria andUpasswdLessThan(String value) {
            addCriterion("Upasswd <", value, "upasswd");
            return (Criteria) this;
        }

        public Criteria andUpasswdLessThanOrEqualTo(String value) {
            addCriterion("Upasswd <=", value, "upasswd");
            return (Criteria) this;
        }

        public Criteria andUpasswdLike(String value) {
            addCriterion("Upasswd like", value, "upasswd");
            return (Criteria) this;
        }

        public Criteria andUpasswdNotLike(String value) {
            addCriterion("Upasswd not like", value, "upasswd");
            return (Criteria) this;
        }

        public Criteria andUpasswdIn(List<String> values) {
            addCriterion("Upasswd in", values, "upasswd");
            return (Criteria) this;
        }

        public Criteria andUpasswdNotIn(List<String> values) {
            addCriterion("Upasswd not in", values, "upasswd");
            return (Criteria) this;
        }

        public Criteria andUpasswdBetween(String value1, String value2) {
            addCriterion("Upasswd between", value1, value2, "upasswd");
            return (Criteria) this;
        }

        public Criteria andUpasswdNotBetween(String value1, String value2) {
            addCriterion("Upasswd not between", value1, value2, "upasswd");
            return (Criteria) this;
        }

        public Criteria andUsessionidIsNull() {
            addCriterion("Usessionid is null");
            return (Criteria) this;
        }

        public Criteria andUsessionidIsNotNull() {
            addCriterion("Usessionid is not null");
            return (Criteria) this;
        }

        public Criteria andUsessionidEqualTo(String value) {
            addCriterion("Usessionid =", value, "usessionid");
            return (Criteria) this;
        }

        public Criteria andUsessionidNotEqualTo(String value) {
            addCriterion("Usessionid <>", value, "usessionid");
            return (Criteria) this;
        }

        public Criteria andUsessionidGreaterThan(String value) {
            addCriterion("Usessionid >", value, "usessionid");
            return (Criteria) this;
        }

        public Criteria andUsessionidGreaterThanOrEqualTo(String value) {
            addCriterion("Usessionid >=", value, "usessionid");
            return (Criteria) this;
        }

        public Criteria andUsessionidLessThan(String value) {
            addCriterion("Usessionid <", value, "usessionid");
            return (Criteria) this;
        }

        public Criteria andUsessionidLessThanOrEqualTo(String value) {
            addCriterion("Usessionid <=", value, "usessionid");
            return (Criteria) this;
        }

        public Criteria andUsessionidLike(String value) {
            addCriterion("Usessionid like", value, "usessionid");
            return (Criteria) this;
        }

        public Criteria andUsessionidNotLike(String value) {
            addCriterion("Usessionid not like", value, "usessionid");
            return (Criteria) this;
        }

        public Criteria andUsessionidIn(List<String> values) {
            addCriterion("Usessionid in", values, "usessionid");
            return (Criteria) this;
        }

        public Criteria andUsessionidNotIn(List<String> values) {
            addCriterion("Usessionid not in", values, "usessionid");
            return (Criteria) this;
        }

        public Criteria andUsessionidBetween(String value1, String value2) {
            addCriterion("Usessionid between", value1, value2, "usessionid");
            return (Criteria) this;
        }

        public Criteria andUsessionidNotBetween(String value1, String value2) {
            addCriterion("Usessionid not between", value1, value2, "usessionid");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("Username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("Username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("Username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("Username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("Username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("Username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("Username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("Username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("Username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("Username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("Username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("Username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("Username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("Username not between", value1, value2, "username");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}