package com.sinopharm.craw.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InptBillGpoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InptBillGpoExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Short value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Short value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Short value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Short value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Short value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Short value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Short> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Short> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Short value1, Short value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Short value1, Short value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOrderremarksIsNull() {
            addCriterion("ORDERREMARKS is null");
            return (Criteria) this;
        }

        public Criteria andOrderremarksIsNotNull() {
            addCriterion("ORDERREMARKS is not null");
            return (Criteria) this;
        }

        public Criteria andOrderremarksEqualTo(String value) {
            addCriterion("ORDERREMARKS =", value, "orderremarks");
            return (Criteria) this;
        }

        public Criteria andOrderremarksNotEqualTo(String value) {
            addCriterion("ORDERREMARKS <>", value, "orderremarks");
            return (Criteria) this;
        }

        public Criteria andOrderremarksGreaterThan(String value) {
            addCriterion("ORDERREMARKS >", value, "orderremarks");
            return (Criteria) this;
        }

        public Criteria andOrderremarksGreaterThanOrEqualTo(String value) {
            addCriterion("ORDERREMARKS >=", value, "orderremarks");
            return (Criteria) this;
        }

        public Criteria andOrderremarksLessThan(String value) {
            addCriterion("ORDERREMARKS <", value, "orderremarks");
            return (Criteria) this;
        }

        public Criteria andOrderremarksLessThanOrEqualTo(String value) {
            addCriterion("ORDERREMARKS <=", value, "orderremarks");
            return (Criteria) this;
        }

        public Criteria andOrderremarksLike(String value) {
            addCriterion("ORDERREMARKS like", value, "orderremarks");
            return (Criteria) this;
        }

        public Criteria andOrderremarksNotLike(String value) {
            addCriterion("ORDERREMARKS not like", value, "orderremarks");
            return (Criteria) this;
        }

        public Criteria andOrderremarksIn(List<String> values) {
            addCriterion("ORDERREMARKS in", values, "orderremarks");
            return (Criteria) this;
        }

        public Criteria andOrderremarksNotIn(List<String> values) {
            addCriterion("ORDERREMARKS not in", values, "orderremarks");
            return (Criteria) this;
        }

        public Criteria andOrderremarksBetween(String value1, String value2) {
            addCriterion("ORDERREMARKS between", value1, value2, "orderremarks");
            return (Criteria) this;
        }

        public Criteria andOrderremarksNotBetween(String value1, String value2) {
            addCriterion("ORDERREMARKS not between", value1, value2, "orderremarks");
            return (Criteria) this;
        }

        public Criteria andTotaldetailcountIsNull() {
            addCriterion("TOTALDETAILCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andTotaldetailcountIsNotNull() {
            addCriterion("TOTALDETAILCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andTotaldetailcountEqualTo(Short value) {
            addCriterion("TOTALDETAILCOUNT =", value, "totaldetailcount");
            return (Criteria) this;
        }

        public Criteria andTotaldetailcountNotEqualTo(Short value) {
            addCriterion("TOTALDETAILCOUNT <>", value, "totaldetailcount");
            return (Criteria) this;
        }

        public Criteria andTotaldetailcountGreaterThan(Short value) {
            addCriterion("TOTALDETAILCOUNT >", value, "totaldetailcount");
            return (Criteria) this;
        }

        public Criteria andTotaldetailcountGreaterThanOrEqualTo(Short value) {
            addCriterion("TOTALDETAILCOUNT >=", value, "totaldetailcount");
            return (Criteria) this;
        }

        public Criteria andTotaldetailcountLessThan(Short value) {
            addCriterion("TOTALDETAILCOUNT <", value, "totaldetailcount");
            return (Criteria) this;
        }

        public Criteria andTotaldetailcountLessThanOrEqualTo(Short value) {
            addCriterion("TOTALDETAILCOUNT <=", value, "totaldetailcount");
            return (Criteria) this;
        }

        public Criteria andTotaldetailcountIn(List<Short> values) {
            addCriterion("TOTALDETAILCOUNT in", values, "totaldetailcount");
            return (Criteria) this;
        }

        public Criteria andTotaldetailcountNotIn(List<Short> values) {
            addCriterion("TOTALDETAILCOUNT not in", values, "totaldetailcount");
            return (Criteria) this;
        }

        public Criteria andTotaldetailcountBetween(Short value1, Short value2) {
            addCriterion("TOTALDETAILCOUNT between", value1, value2, "totaldetailcount");
            return (Criteria) this;
        }

        public Criteria andTotaldetailcountNotBetween(Short value1, Short value2) {
            addCriterion("TOTALDETAILCOUNT not between", value1, value2, "totaldetailcount");
            return (Criteria) this;
        }

        public Criteria andOrderdetailidIsNull() {
            addCriterion("ORDERDETAILID is null");
            return (Criteria) this;
        }

        public Criteria andOrderdetailidIsNotNull() {
            addCriterion("ORDERDETAILID is not null");
            return (Criteria) this;
        }

        public Criteria andOrderdetailidEqualTo(String value) {
            addCriterion("ORDERDETAILID =", value, "orderdetailid");
            return (Criteria) this;
        }

        public Criteria andOrderdetailidNotEqualTo(String value) {
            addCriterion("ORDERDETAILID <>", value, "orderdetailid");
            return (Criteria) this;
        }

        public Criteria andOrderdetailidGreaterThan(String value) {
            addCriterion("ORDERDETAILID >", value, "orderdetailid");
            return (Criteria) this;
        }

        public Criteria andOrderdetailidGreaterThanOrEqualTo(String value) {
            addCriterion("ORDERDETAILID >=", value, "orderdetailid");
            return (Criteria) this;
        }

        public Criteria andOrderdetailidLessThan(String value) {
            addCriterion("ORDERDETAILID <", value, "orderdetailid");
            return (Criteria) this;
        }

        public Criteria andOrderdetailidLessThanOrEqualTo(String value) {
            addCriterion("ORDERDETAILID <=", value, "orderdetailid");
            return (Criteria) this;
        }

        public Criteria andOrderdetailidLike(String value) {
            addCriterion("ORDERDETAILID like", value, "orderdetailid");
            return (Criteria) this;
        }

        public Criteria andOrderdetailidNotLike(String value) {
            addCriterion("ORDERDETAILID not like", value, "orderdetailid");
            return (Criteria) this;
        }

        public Criteria andOrderdetailidIn(List<String> values) {
            addCriterion("ORDERDETAILID in", values, "orderdetailid");
            return (Criteria) this;
        }

        public Criteria andOrderdetailidNotIn(List<String> values) {
            addCriterion("ORDERDETAILID not in", values, "orderdetailid");
            return (Criteria) this;
        }

        public Criteria andOrderdetailidBetween(String value1, String value2) {
            addCriterion("ORDERDETAILID between", value1, value2, "orderdetailid");
            return (Criteria) this;
        }

        public Criteria andOrderdetailidNotBetween(String value1, String value2) {
            addCriterion("ORDERDETAILID not between", value1, value2, "orderdetailid");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNull() {
            addCriterion("ORDERID is null");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNotNull() {
            addCriterion("ORDERID is not null");
            return (Criteria) this;
        }

        public Criteria andOrderidEqualTo(String value) {
            addCriterion("ORDERID =", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotEqualTo(String value) {
            addCriterion("ORDERID <>", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThan(String value) {
            addCriterion("ORDERID >", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThanOrEqualTo(String value) {
            addCriterion("ORDERID >=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThan(String value) {
            addCriterion("ORDERID <", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThanOrEqualTo(String value) {
            addCriterion("ORDERID <=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLike(String value) {
            addCriterion("ORDERID like", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotLike(String value) {
            addCriterion("ORDERID not like", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidIn(List<String> values) {
            addCriterion("ORDERID in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotIn(List<String> values) {
            addCriterion("ORDERID not in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidBetween(String value1, String value2) {
            addCriterion("ORDERID between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotBetween(String value1, String value2) {
            addCriterion("ORDERID not between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andContractidIsNull() {
            addCriterion("CONTRACTID is null");
            return (Criteria) this;
        }

        public Criteria andContractidIsNotNull() {
            addCriterion("CONTRACTID is not null");
            return (Criteria) this;
        }

        public Criteria andContractidEqualTo(String value) {
            addCriterion("CONTRACTID =", value, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidNotEqualTo(String value) {
            addCriterion("CONTRACTID <>", value, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidGreaterThan(String value) {
            addCriterion("CONTRACTID >", value, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidGreaterThanOrEqualTo(String value) {
            addCriterion("CONTRACTID >=", value, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidLessThan(String value) {
            addCriterion("CONTRACTID <", value, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidLessThanOrEqualTo(String value) {
            addCriterion("CONTRACTID <=", value, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidLike(String value) {
            addCriterion("CONTRACTID like", value, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidNotLike(String value) {
            addCriterion("CONTRACTID not like", value, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidIn(List<String> values) {
            addCriterion("CONTRACTID in", values, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidNotIn(List<String> values) {
            addCriterion("CONTRACTID not in", values, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidBetween(String value1, String value2) {
            addCriterion("CONTRACTID between", value1, value2, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidNotBetween(String value1, String value2) {
            addCriterion("CONTRACTID not between", value1, value2, "contractid");
            return (Criteria) this;
        }

        public Criteria andAddressidIsNull() {
            addCriterion("ADDRESSID is null");
            return (Criteria) this;
        }

        public Criteria andAddressidIsNotNull() {
            addCriterion("ADDRESSID is not null");
            return (Criteria) this;
        }

        public Criteria andAddressidEqualTo(String value) {
            addCriterion("ADDRESSID =", value, "addressid");
            return (Criteria) this;
        }

        public Criteria andAddressidNotEqualTo(String value) {
            addCriterion("ADDRESSID <>", value, "addressid");
            return (Criteria) this;
        }

        public Criteria andAddressidGreaterThan(String value) {
            addCriterion("ADDRESSID >", value, "addressid");
            return (Criteria) this;
        }

        public Criteria andAddressidGreaterThanOrEqualTo(String value) {
            addCriterion("ADDRESSID >=", value, "addressid");
            return (Criteria) this;
        }

        public Criteria andAddressidLessThan(String value) {
            addCriterion("ADDRESSID <", value, "addressid");
            return (Criteria) this;
        }

        public Criteria andAddressidLessThanOrEqualTo(String value) {
            addCriterion("ADDRESSID <=", value, "addressid");
            return (Criteria) this;
        }

        public Criteria andAddressidLike(String value) {
            addCriterion("ADDRESSID like", value, "addressid");
            return (Criteria) this;
        }

        public Criteria andAddressidNotLike(String value) {
            addCriterion("ADDRESSID not like", value, "addressid");
            return (Criteria) this;
        }

        public Criteria andAddressidIn(List<String> values) {
            addCriterion("ADDRESSID in", values, "addressid");
            return (Criteria) this;
        }

        public Criteria andAddressidNotIn(List<String> values) {
            addCriterion("ADDRESSID not in", values, "addressid");
            return (Criteria) this;
        }

        public Criteria andAddressidBetween(String value1, String value2) {
            addCriterion("ADDRESSID between", value1, value2, "addressid");
            return (Criteria) this;
        }

        public Criteria andAddressidNotBetween(String value1, String value2) {
            addCriterion("ADDRESSID not between", value1, value2, "addressid");
            return (Criteria) this;
        }

        public Criteria andProcurecatalogidIsNull() {
            addCriterion("PROCURECATALOGID is null");
            return (Criteria) this;
        }

        public Criteria andProcurecatalogidIsNotNull() {
            addCriterion("PROCURECATALOGID is not null");
            return (Criteria) this;
        }

        public Criteria andProcurecatalogidEqualTo(String value) {
            addCriterion("PROCURECATALOGID =", value, "procurecatalogid");
            return (Criteria) this;
        }

        public Criteria andProcurecatalogidNotEqualTo(String value) {
            addCriterion("PROCURECATALOGID <>", value, "procurecatalogid");
            return (Criteria) this;
        }

        public Criteria andProcurecatalogidGreaterThan(String value) {
            addCriterion("PROCURECATALOGID >", value, "procurecatalogid");
            return (Criteria) this;
        }

        public Criteria andProcurecatalogidGreaterThanOrEqualTo(String value) {
            addCriterion("PROCURECATALOGID >=", value, "procurecatalogid");
            return (Criteria) this;
        }

        public Criteria andProcurecatalogidLessThan(String value) {
            addCriterion("PROCURECATALOGID <", value, "procurecatalogid");
            return (Criteria) this;
        }

        public Criteria andProcurecatalogidLessThanOrEqualTo(String value) {
            addCriterion("PROCURECATALOGID <=", value, "procurecatalogid");
            return (Criteria) this;
        }

        public Criteria andProcurecatalogidLike(String value) {
            addCriterion("PROCURECATALOGID like", value, "procurecatalogid");
            return (Criteria) this;
        }

        public Criteria andProcurecatalogidNotLike(String value) {
            addCriterion("PROCURECATALOGID not like", value, "procurecatalogid");
            return (Criteria) this;
        }

        public Criteria andProcurecatalogidIn(List<String> values) {
            addCriterion("PROCURECATALOGID in", values, "procurecatalogid");
            return (Criteria) this;
        }

        public Criteria andProcurecatalogidNotIn(List<String> values) {
            addCriterion("PROCURECATALOGID not in", values, "procurecatalogid");
            return (Criteria) this;
        }

        public Criteria andProcurecatalogidBetween(String value1, String value2) {
            addCriterion("PROCURECATALOGID between", value1, value2, "procurecatalogid");
            return (Criteria) this;
        }

        public Criteria andProcurecatalogidNotBetween(String value1, String value2) {
            addCriterion("PROCURECATALOGID not between", value1, value2, "procurecatalogid");
            return (Criteria) this;
        }

        public Criteria andGoodsidIsNull() {
            addCriterion("GOODSID is null");
            return (Criteria) this;
        }

        public Criteria andGoodsidIsNotNull() {
            addCriterion("GOODSID is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsidEqualTo(String value) {
            addCriterion("GOODSID =", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidNotEqualTo(String value) {
            addCriterion("GOODSID <>", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidGreaterThan(String value) {
            addCriterion("GOODSID >", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidGreaterThanOrEqualTo(String value) {
            addCriterion("GOODSID >=", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidLessThan(String value) {
            addCriterion("GOODSID <", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidLessThanOrEqualTo(String value) {
            addCriterion("GOODSID <=", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidLike(String value) {
            addCriterion("GOODSID like", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidNotLike(String value) {
            addCriterion("GOODSID not like", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidIn(List<String> values) {
            addCriterion("GOODSID in", values, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidNotIn(List<String> values) {
            addCriterion("GOODSID not in", values, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidBetween(String value1, String value2) {
            addCriterion("GOODSID between", value1, value2, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidNotBetween(String value1, String value2) {
            addCriterion("GOODSID not between", value1, value2, "goodsid");
            return (Criteria) this;
        }

        public Criteria andProductnameIsNull() {
            addCriterion("PRODUCTNAME is null");
            return (Criteria) this;
        }

        public Criteria andProductnameIsNotNull() {
            addCriterion("PRODUCTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andProductnameEqualTo(String value) {
            addCriterion("PRODUCTNAME =", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotEqualTo(String value) {
            addCriterion("PRODUCTNAME <>", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameGreaterThan(String value) {
            addCriterion("PRODUCTNAME >", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCTNAME >=", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLessThan(String value) {
            addCriterion("PRODUCTNAME <", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLessThanOrEqualTo(String value) {
            addCriterion("PRODUCTNAME <=", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLike(String value) {
            addCriterion("PRODUCTNAME like", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotLike(String value) {
            addCriterion("PRODUCTNAME not like", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameIn(List<String> values) {
            addCriterion("PRODUCTNAME in", values, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotIn(List<String> values) {
            addCriterion("PRODUCTNAME not in", values, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameBetween(String value1, String value2) {
            addCriterion("PRODUCTNAME between", value1, value2, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotBetween(String value1, String value2) {
            addCriterion("PRODUCTNAME not between", value1, value2, "productname");
            return (Criteria) this;
        }

        public Criteria andProductspelnameIsNull() {
            addCriterion("PRODUCTSPELNAME is null");
            return (Criteria) this;
        }

        public Criteria andProductspelnameIsNotNull() {
            addCriterion("PRODUCTSPELNAME is not null");
            return (Criteria) this;
        }

        public Criteria andProductspelnameEqualTo(String value) {
            addCriterion("PRODUCTSPELNAME =", value, "productspelname");
            return (Criteria) this;
        }

        public Criteria andProductspelnameNotEqualTo(String value) {
            addCriterion("PRODUCTSPELNAME <>", value, "productspelname");
            return (Criteria) this;
        }

        public Criteria andProductspelnameGreaterThan(String value) {
            addCriterion("PRODUCTSPELNAME >", value, "productspelname");
            return (Criteria) this;
        }

        public Criteria andProductspelnameGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCTSPELNAME >=", value, "productspelname");
            return (Criteria) this;
        }

        public Criteria andProductspelnameLessThan(String value) {
            addCriterion("PRODUCTSPELNAME <", value, "productspelname");
            return (Criteria) this;
        }

        public Criteria andProductspelnameLessThanOrEqualTo(String value) {
            addCriterion("PRODUCTSPELNAME <=", value, "productspelname");
            return (Criteria) this;
        }

        public Criteria andProductspelnameLike(String value) {
            addCriterion("PRODUCTSPELNAME like", value, "productspelname");
            return (Criteria) this;
        }

        public Criteria andProductspelnameNotLike(String value) {
            addCriterion("PRODUCTSPELNAME not like", value, "productspelname");
            return (Criteria) this;
        }

        public Criteria andProductspelnameIn(List<String> values) {
            addCriterion("PRODUCTSPELNAME in", values, "productspelname");
            return (Criteria) this;
        }

        public Criteria andProductspelnameNotIn(List<String> values) {
            addCriterion("PRODUCTSPELNAME not in", values, "productspelname");
            return (Criteria) this;
        }

        public Criteria andProductspelnameBetween(String value1, String value2) {
            addCriterion("PRODUCTSPELNAME between", value1, value2, "productspelname");
            return (Criteria) this;
        }

        public Criteria andProductspelnameNotBetween(String value1, String value2) {
            addCriterion("PRODUCTSPELNAME not between", value1, value2, "productspelname");
            return (Criteria) this;
        }

        public Criteria andProductwbnameIsNull() {
            addCriterion("PRODUCTWBNAME is null");
            return (Criteria) this;
        }

        public Criteria andProductwbnameIsNotNull() {
            addCriterion("PRODUCTWBNAME is not null");
            return (Criteria) this;
        }

        public Criteria andProductwbnameEqualTo(String value) {
            addCriterion("PRODUCTWBNAME =", value, "productwbname");
            return (Criteria) this;
        }

        public Criteria andProductwbnameNotEqualTo(String value) {
            addCriterion("PRODUCTWBNAME <>", value, "productwbname");
            return (Criteria) this;
        }

        public Criteria andProductwbnameGreaterThan(String value) {
            addCriterion("PRODUCTWBNAME >", value, "productwbname");
            return (Criteria) this;
        }

        public Criteria andProductwbnameGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCTWBNAME >=", value, "productwbname");
            return (Criteria) this;
        }

        public Criteria andProductwbnameLessThan(String value) {
            addCriterion("PRODUCTWBNAME <", value, "productwbname");
            return (Criteria) this;
        }

        public Criteria andProductwbnameLessThanOrEqualTo(String value) {
            addCriterion("PRODUCTWBNAME <=", value, "productwbname");
            return (Criteria) this;
        }

        public Criteria andProductwbnameLike(String value) {
            addCriterion("PRODUCTWBNAME like", value, "productwbname");
            return (Criteria) this;
        }

        public Criteria andProductwbnameNotLike(String value) {
            addCriterion("PRODUCTWBNAME not like", value, "productwbname");
            return (Criteria) this;
        }

        public Criteria andProductwbnameIn(List<String> values) {
            addCriterion("PRODUCTWBNAME in", values, "productwbname");
            return (Criteria) this;
        }

        public Criteria andProductwbnameNotIn(List<String> values) {
            addCriterion("PRODUCTWBNAME not in", values, "productwbname");
            return (Criteria) this;
        }

        public Criteria andProductwbnameBetween(String value1, String value2) {
            addCriterion("PRODUCTWBNAME between", value1, value2, "productwbname");
            return (Criteria) this;
        }

        public Criteria andProductwbnameNotBetween(String value1, String value2) {
            addCriterion("PRODUCTWBNAME not between", value1, value2, "productwbname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameIsNull() {
            addCriterion("GOODSNAME is null");
            return (Criteria) this;
        }

        public Criteria andGoodsnameIsNotNull() {
            addCriterion("GOODSNAME is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsnameEqualTo(String value) {
            addCriterion("GOODSNAME =", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotEqualTo(String value) {
            addCriterion("GOODSNAME <>", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameGreaterThan(String value) {
            addCriterion("GOODSNAME >", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameGreaterThanOrEqualTo(String value) {
            addCriterion("GOODSNAME >=", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameLessThan(String value) {
            addCriterion("GOODSNAME <", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameLessThanOrEqualTo(String value) {
            addCriterion("GOODSNAME <=", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameLike(String value) {
            addCriterion("GOODSNAME like", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotLike(String value) {
            addCriterion("GOODSNAME not like", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameIn(List<String> values) {
            addCriterion("GOODSNAME in", values, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotIn(List<String> values) {
            addCriterion("GOODSNAME not in", values, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameBetween(String value1, String value2) {
            addCriterion("GOODSNAME between", value1, value2, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotBetween(String value1, String value2) {
            addCriterion("GOODSNAME not between", value1, value2, "goodsname");
            return (Criteria) this;
        }

        public Criteria andMedicinemodelIsNull() {
            addCriterion("MEDICINEMODEL is null");
            return (Criteria) this;
        }

        public Criteria andMedicinemodelIsNotNull() {
            addCriterion("MEDICINEMODEL is not null");
            return (Criteria) this;
        }

        public Criteria andMedicinemodelEqualTo(String value) {
            addCriterion("MEDICINEMODEL =", value, "medicinemodel");
            return (Criteria) this;
        }

        public Criteria andMedicinemodelNotEqualTo(String value) {
            addCriterion("MEDICINEMODEL <>", value, "medicinemodel");
            return (Criteria) this;
        }

        public Criteria andMedicinemodelGreaterThan(String value) {
            addCriterion("MEDICINEMODEL >", value, "medicinemodel");
            return (Criteria) this;
        }

        public Criteria andMedicinemodelGreaterThanOrEqualTo(String value) {
            addCriterion("MEDICINEMODEL >=", value, "medicinemodel");
            return (Criteria) this;
        }

        public Criteria andMedicinemodelLessThan(String value) {
            addCriterion("MEDICINEMODEL <", value, "medicinemodel");
            return (Criteria) this;
        }

        public Criteria andMedicinemodelLessThanOrEqualTo(String value) {
            addCriterion("MEDICINEMODEL <=", value, "medicinemodel");
            return (Criteria) this;
        }

        public Criteria andMedicinemodelLike(String value) {
            addCriterion("MEDICINEMODEL like", value, "medicinemodel");
            return (Criteria) this;
        }

        public Criteria andMedicinemodelNotLike(String value) {
            addCriterion("MEDICINEMODEL not like", value, "medicinemodel");
            return (Criteria) this;
        }

        public Criteria andMedicinemodelIn(List<String> values) {
            addCriterion("MEDICINEMODEL in", values, "medicinemodel");
            return (Criteria) this;
        }

        public Criteria andMedicinemodelNotIn(List<String> values) {
            addCriterion("MEDICINEMODEL not in", values, "medicinemodel");
            return (Criteria) this;
        }

        public Criteria andMedicinemodelBetween(String value1, String value2) {
            addCriterion("MEDICINEMODEL between", value1, value2, "medicinemodel");
            return (Criteria) this;
        }

        public Criteria andMedicinemodelNotBetween(String value1, String value2) {
            addCriterion("MEDICINEMODEL not between", value1, value2, "medicinemodel");
            return (Criteria) this;
        }

        public Criteria andOutlookIsNull() {
            addCriterion("OUTLOOK is null");
            return (Criteria) this;
        }

        public Criteria andOutlookIsNotNull() {
            addCriterion("OUTLOOK is not null");
            return (Criteria) this;
        }

        public Criteria andOutlookEqualTo(String value) {
            addCriterion("OUTLOOK =", value, "outlook");
            return (Criteria) this;
        }

        public Criteria andOutlookNotEqualTo(String value) {
            addCriterion("OUTLOOK <>", value, "outlook");
            return (Criteria) this;
        }

        public Criteria andOutlookGreaterThan(String value) {
            addCriterion("OUTLOOK >", value, "outlook");
            return (Criteria) this;
        }

        public Criteria andOutlookGreaterThanOrEqualTo(String value) {
            addCriterion("OUTLOOK >=", value, "outlook");
            return (Criteria) this;
        }

        public Criteria andOutlookLessThan(String value) {
            addCriterion("OUTLOOK <", value, "outlook");
            return (Criteria) this;
        }

        public Criteria andOutlookLessThanOrEqualTo(String value) {
            addCriterion("OUTLOOK <=", value, "outlook");
            return (Criteria) this;
        }

        public Criteria andOutlookLike(String value) {
            addCriterion("OUTLOOK like", value, "outlook");
            return (Criteria) this;
        }

        public Criteria andOutlookNotLike(String value) {
            addCriterion("OUTLOOK not like", value, "outlook");
            return (Criteria) this;
        }

        public Criteria andOutlookIn(List<String> values) {
            addCriterion("OUTLOOK in", values, "outlook");
            return (Criteria) this;
        }

        public Criteria andOutlookNotIn(List<String> values) {
            addCriterion("OUTLOOK not in", values, "outlook");
            return (Criteria) this;
        }

        public Criteria andOutlookBetween(String value1, String value2) {
            addCriterion("OUTLOOK between", value1, value2, "outlook");
            return (Criteria) this;
        }

        public Criteria andOutlookNotBetween(String value1, String value2) {
            addCriterion("OUTLOOK not between", value1, value2, "outlook");
            return (Criteria) this;
        }

        public Criteria andFactorIsNull() {
            addCriterion("FACTOR is null");
            return (Criteria) this;
        }

        public Criteria andFactorIsNotNull() {
            addCriterion("FACTOR is not null");
            return (Criteria) this;
        }

        public Criteria andFactorEqualTo(String value) {
            addCriterion("FACTOR =", value, "factor");
            return (Criteria) this;
        }

        public Criteria andFactorNotEqualTo(String value) {
            addCriterion("FACTOR <>", value, "factor");
            return (Criteria) this;
        }

        public Criteria andFactorGreaterThan(String value) {
            addCriterion("FACTOR >", value, "factor");
            return (Criteria) this;
        }

        public Criteria andFactorGreaterThanOrEqualTo(String value) {
            addCriterion("FACTOR >=", value, "factor");
            return (Criteria) this;
        }

        public Criteria andFactorLessThan(String value) {
            addCriterion("FACTOR <", value, "factor");
            return (Criteria) this;
        }

        public Criteria andFactorLessThanOrEqualTo(String value) {
            addCriterion("FACTOR <=", value, "factor");
            return (Criteria) this;
        }

        public Criteria andFactorLike(String value) {
            addCriterion("FACTOR like", value, "factor");
            return (Criteria) this;
        }

        public Criteria andFactorNotLike(String value) {
            addCriterion("FACTOR not like", value, "factor");
            return (Criteria) this;
        }

        public Criteria andFactorIn(List<String> values) {
            addCriterion("FACTOR in", values, "factor");
            return (Criteria) this;
        }

        public Criteria andFactorNotIn(List<String> values) {
            addCriterion("FACTOR not in", values, "factor");
            return (Criteria) this;
        }

        public Criteria andFactorBetween(String value1, String value2) {
            addCriterion("FACTOR between", value1, value2, "factor");
            return (Criteria) this;
        }

        public Criteria andFactorNotBetween(String value1, String value2) {
            addCriterion("FACTOR not between", value1, value2, "factor");
            return (Criteria) this;
        }

        public Criteria andMaterialnameIsNull() {
            addCriterion("MATERIALNAME is null");
            return (Criteria) this;
        }

        public Criteria andMaterialnameIsNotNull() {
            addCriterion("MATERIALNAME is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialnameEqualTo(String value) {
            addCriterion("MATERIALNAME =", value, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialnameNotEqualTo(String value) {
            addCriterion("MATERIALNAME <>", value, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialnameGreaterThan(String value) {
            addCriterion("MATERIALNAME >", value, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialnameGreaterThanOrEqualTo(String value) {
            addCriterion("MATERIALNAME >=", value, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialnameLessThan(String value) {
            addCriterion("MATERIALNAME <", value, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialnameLessThanOrEqualTo(String value) {
            addCriterion("MATERIALNAME <=", value, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialnameLike(String value) {
            addCriterion("MATERIALNAME like", value, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialnameNotLike(String value) {
            addCriterion("MATERIALNAME not like", value, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialnameIn(List<String> values) {
            addCriterion("MATERIALNAME in", values, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialnameNotIn(List<String> values) {
            addCriterion("MATERIALNAME not in", values, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialnameBetween(String value1, String value2) {
            addCriterion("MATERIALNAME between", value1, value2, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialnameNotBetween(String value1, String value2) {
            addCriterion("MATERIALNAME not between", value1, value2, "materialname");
            return (Criteria) this;
        }

        public Criteria andUnitIsNull() {
            addCriterion("UNIT is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("UNIT =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("UNIT <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("UNIT >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("UNIT >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("UNIT <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("UNIT <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("UNIT like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("UNIT not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("UNIT in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("UNIT not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("UNIT between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("UNIT not between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andMinunitIsNull() {
            addCriterion("MINUNIT is null");
            return (Criteria) this;
        }

        public Criteria andMinunitIsNotNull() {
            addCriterion("MINUNIT is not null");
            return (Criteria) this;
        }

        public Criteria andMinunitEqualTo(String value) {
            addCriterion("MINUNIT =", value, "minunit");
            return (Criteria) this;
        }

        public Criteria andMinunitNotEqualTo(String value) {
            addCriterion("MINUNIT <>", value, "minunit");
            return (Criteria) this;
        }

        public Criteria andMinunitGreaterThan(String value) {
            addCriterion("MINUNIT >", value, "minunit");
            return (Criteria) this;
        }

        public Criteria andMinunitGreaterThanOrEqualTo(String value) {
            addCriterion("MINUNIT >=", value, "minunit");
            return (Criteria) this;
        }

        public Criteria andMinunitLessThan(String value) {
            addCriterion("MINUNIT <", value, "minunit");
            return (Criteria) this;
        }

        public Criteria andMinunitLessThanOrEqualTo(String value) {
            addCriterion("MINUNIT <=", value, "minunit");
            return (Criteria) this;
        }

        public Criteria andMinunitLike(String value) {
            addCriterion("MINUNIT like", value, "minunit");
            return (Criteria) this;
        }

        public Criteria andMinunitNotLike(String value) {
            addCriterion("MINUNIT not like", value, "minunit");
            return (Criteria) this;
        }

        public Criteria andMinunitIn(List<String> values) {
            addCriterion("MINUNIT in", values, "minunit");
            return (Criteria) this;
        }

        public Criteria andMinunitNotIn(List<String> values) {
            addCriterion("MINUNIT not in", values, "minunit");
            return (Criteria) this;
        }

        public Criteria andMinunitBetween(String value1, String value2) {
            addCriterion("MINUNIT between", value1, value2, "minunit");
            return (Criteria) this;
        }

        public Criteria andMinunitNotBetween(String value1, String value2) {
            addCriterion("MINUNIT not between", value1, value2, "minunit");
            return (Criteria) this;
        }

        public Criteria andCompanynamescIsNull() {
            addCriterion("COMPANYNAMESC is null");
            return (Criteria) this;
        }

        public Criteria andCompanynamescIsNotNull() {
            addCriterion("COMPANYNAMESC is not null");
            return (Criteria) this;
        }

        public Criteria andCompanynamescEqualTo(String value) {
            addCriterion("COMPANYNAMESC =", value, "companynamesc");
            return (Criteria) this;
        }

        public Criteria andCompanynamescNotEqualTo(String value) {
            addCriterion("COMPANYNAMESC <>", value, "companynamesc");
            return (Criteria) this;
        }

        public Criteria andCompanynamescGreaterThan(String value) {
            addCriterion("COMPANYNAMESC >", value, "companynamesc");
            return (Criteria) this;
        }

        public Criteria andCompanynamescGreaterThanOrEqualTo(String value) {
            addCriterion("COMPANYNAMESC >=", value, "companynamesc");
            return (Criteria) this;
        }

        public Criteria andCompanynamescLessThan(String value) {
            addCriterion("COMPANYNAMESC <", value, "companynamesc");
            return (Criteria) this;
        }

        public Criteria andCompanynamescLessThanOrEqualTo(String value) {
            addCriterion("COMPANYNAMESC <=", value, "companynamesc");
            return (Criteria) this;
        }

        public Criteria andCompanynamescLike(String value) {
            addCriterion("COMPANYNAMESC like", value, "companynamesc");
            return (Criteria) this;
        }

        public Criteria andCompanynamescNotLike(String value) {
            addCriterion("COMPANYNAMESC not like", value, "companynamesc");
            return (Criteria) this;
        }

        public Criteria andCompanynamescIn(List<String> values) {
            addCriterion("COMPANYNAMESC in", values, "companynamesc");
            return (Criteria) this;
        }

        public Criteria andCompanynamescNotIn(List<String> values) {
            addCriterion("COMPANYNAMESC not in", values, "companynamesc");
            return (Criteria) this;
        }

        public Criteria andCompanynamescBetween(String value1, String value2) {
            addCriterion("COMPANYNAMESC between", value1, value2, "companynamesc");
            return (Criteria) this;
        }

        public Criteria andCompanynamescNotBetween(String value1, String value2) {
            addCriterion("COMPANYNAMESC not between", value1, value2, "companynamesc");
            return (Criteria) this;
        }

        public Criteria andSplitcompanynameIsNull() {
            addCriterion("SPLITCOMPANYNAME is null");
            return (Criteria) this;
        }

        public Criteria andSplitcompanynameIsNotNull() {
            addCriterion("SPLITCOMPANYNAME is not null");
            return (Criteria) this;
        }

        public Criteria andSplitcompanynameEqualTo(String value) {
            addCriterion("SPLITCOMPANYNAME =", value, "splitcompanyname");
            return (Criteria) this;
        }

        public Criteria andSplitcompanynameNotEqualTo(String value) {
            addCriterion("SPLITCOMPANYNAME <>", value, "splitcompanyname");
            return (Criteria) this;
        }

        public Criteria andSplitcompanynameGreaterThan(String value) {
            addCriterion("SPLITCOMPANYNAME >", value, "splitcompanyname");
            return (Criteria) this;
        }

        public Criteria andSplitcompanynameGreaterThanOrEqualTo(String value) {
            addCriterion("SPLITCOMPANYNAME >=", value, "splitcompanyname");
            return (Criteria) this;
        }

        public Criteria andSplitcompanynameLessThan(String value) {
            addCriterion("SPLITCOMPANYNAME <", value, "splitcompanyname");
            return (Criteria) this;
        }

        public Criteria andSplitcompanynameLessThanOrEqualTo(String value) {
            addCriterion("SPLITCOMPANYNAME <=", value, "splitcompanyname");
            return (Criteria) this;
        }

        public Criteria andSplitcompanynameLike(String value) {
            addCriterion("SPLITCOMPANYNAME like", value, "splitcompanyname");
            return (Criteria) this;
        }

        public Criteria andSplitcompanynameNotLike(String value) {
            addCriterion("SPLITCOMPANYNAME not like", value, "splitcompanyname");
            return (Criteria) this;
        }

        public Criteria andSplitcompanynameIn(List<String> values) {
            addCriterion("SPLITCOMPANYNAME in", values, "splitcompanyname");
            return (Criteria) this;
        }

        public Criteria andSplitcompanynameNotIn(List<String> values) {
            addCriterion("SPLITCOMPANYNAME not in", values, "splitcompanyname");
            return (Criteria) this;
        }

        public Criteria andSplitcompanynameBetween(String value1, String value2) {
            addCriterion("SPLITCOMPANYNAME between", value1, value2, "splitcompanyname");
            return (Criteria) this;
        }

        public Criteria andSplitcompanynameNotBetween(String value1, String value2) {
            addCriterion("SPLITCOMPANYNAME not between", value1, value2, "splitcompanyname");
            return (Criteria) this;
        }

        public Criteria andTrustcompanynameIsNull() {
            addCriterion("TRUSTCOMPANYNAME is null");
            return (Criteria) this;
        }

        public Criteria andTrustcompanynameIsNotNull() {
            addCriterion("TRUSTCOMPANYNAME is not null");
            return (Criteria) this;
        }

        public Criteria andTrustcompanynameEqualTo(String value) {
            addCriterion("TRUSTCOMPANYNAME =", value, "trustcompanyname");
            return (Criteria) this;
        }

        public Criteria andTrustcompanynameNotEqualTo(String value) {
            addCriterion("TRUSTCOMPANYNAME <>", value, "trustcompanyname");
            return (Criteria) this;
        }

        public Criteria andTrustcompanynameGreaterThan(String value) {
            addCriterion("TRUSTCOMPANYNAME >", value, "trustcompanyname");
            return (Criteria) this;
        }

        public Criteria andTrustcompanynameGreaterThanOrEqualTo(String value) {
            addCriterion("TRUSTCOMPANYNAME >=", value, "trustcompanyname");
            return (Criteria) this;
        }

        public Criteria andTrustcompanynameLessThan(String value) {
            addCriterion("TRUSTCOMPANYNAME <", value, "trustcompanyname");
            return (Criteria) this;
        }

        public Criteria andTrustcompanynameLessThanOrEqualTo(String value) {
            addCriterion("TRUSTCOMPANYNAME <=", value, "trustcompanyname");
            return (Criteria) this;
        }

        public Criteria andTrustcompanynameLike(String value) {
            addCriterion("TRUSTCOMPANYNAME like", value, "trustcompanyname");
            return (Criteria) this;
        }

        public Criteria andTrustcompanynameNotLike(String value) {
            addCriterion("TRUSTCOMPANYNAME not like", value, "trustcompanyname");
            return (Criteria) this;
        }

        public Criteria andTrustcompanynameIn(List<String> values) {
            addCriterion("TRUSTCOMPANYNAME in", values, "trustcompanyname");
            return (Criteria) this;
        }

        public Criteria andTrustcompanynameNotIn(List<String> values) {
            addCriterion("TRUSTCOMPANYNAME not in", values, "trustcompanyname");
            return (Criteria) this;
        }

        public Criteria andTrustcompanynameBetween(String value1, String value2) {
            addCriterion("TRUSTCOMPANYNAME between", value1, value2, "trustcompanyname");
            return (Criteria) this;
        }

        public Criteria andTrustcompanynameNotBetween(String value1, String value2) {
            addCriterion("TRUSTCOMPANYNAME not between", value1, value2, "trustcompanyname");
            return (Criteria) this;
        }

        public Criteria andCompanyidtbIsNull() {
            addCriterion("COMPANYIDTB is null");
            return (Criteria) this;
        }

        public Criteria andCompanyidtbIsNotNull() {
            addCriterion("COMPANYIDTB is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyidtbEqualTo(String value) {
            addCriterion("COMPANYIDTB =", value, "companyidtb");
            return (Criteria) this;
        }

        public Criteria andCompanyidtbNotEqualTo(String value) {
            addCriterion("COMPANYIDTB <>", value, "companyidtb");
            return (Criteria) this;
        }

        public Criteria andCompanyidtbGreaterThan(String value) {
            addCriterion("COMPANYIDTB >", value, "companyidtb");
            return (Criteria) this;
        }

        public Criteria andCompanyidtbGreaterThanOrEqualTo(String value) {
            addCriterion("COMPANYIDTB >=", value, "companyidtb");
            return (Criteria) this;
        }

        public Criteria andCompanyidtbLessThan(String value) {
            addCriterion("COMPANYIDTB <", value, "companyidtb");
            return (Criteria) this;
        }

        public Criteria andCompanyidtbLessThanOrEqualTo(String value) {
            addCriterion("COMPANYIDTB <=", value, "companyidtb");
            return (Criteria) this;
        }

        public Criteria andCompanyidtbLike(String value) {
            addCriterion("COMPANYIDTB like", value, "companyidtb");
            return (Criteria) this;
        }

        public Criteria andCompanyidtbNotLike(String value) {
            addCriterion("COMPANYIDTB not like", value, "companyidtb");
            return (Criteria) this;
        }

        public Criteria andCompanyidtbIn(List<String> values) {
            addCriterion("COMPANYIDTB in", values, "companyidtb");
            return (Criteria) this;
        }

        public Criteria andCompanyidtbNotIn(List<String> values) {
            addCriterion("COMPANYIDTB not in", values, "companyidtb");
            return (Criteria) this;
        }

        public Criteria andCompanyidtbBetween(String value1, String value2) {
            addCriterion("COMPANYIDTB between", value1, value2, "companyidtb");
            return (Criteria) this;
        }

        public Criteria andCompanyidtbNotBetween(String value1, String value2) {
            addCriterion("COMPANYIDTB not between", value1, value2, "companyidtb");
            return (Criteria) this;
        }

        public Criteria andCompanynametbIsNull() {
            addCriterion("COMPANYNAMETB is null");
            return (Criteria) this;
        }

        public Criteria andCompanynametbIsNotNull() {
            addCriterion("COMPANYNAMETB is not null");
            return (Criteria) this;
        }

        public Criteria andCompanynametbEqualTo(String value) {
            addCriterion("COMPANYNAMETB =", value, "companynametb");
            return (Criteria) this;
        }

        public Criteria andCompanynametbNotEqualTo(String value) {
            addCriterion("COMPANYNAMETB <>", value, "companynametb");
            return (Criteria) this;
        }

        public Criteria andCompanynametbGreaterThan(String value) {
            addCriterion("COMPANYNAMETB >", value, "companynametb");
            return (Criteria) this;
        }

        public Criteria andCompanynametbGreaterThanOrEqualTo(String value) {
            addCriterion("COMPANYNAMETB >=", value, "companynametb");
            return (Criteria) this;
        }

        public Criteria andCompanynametbLessThan(String value) {
            addCriterion("COMPANYNAMETB <", value, "companynametb");
            return (Criteria) this;
        }

        public Criteria andCompanynametbLessThanOrEqualTo(String value) {
            addCriterion("COMPANYNAMETB <=", value, "companynametb");
            return (Criteria) this;
        }

        public Criteria andCompanynametbLike(String value) {
            addCriterion("COMPANYNAMETB like", value, "companynametb");
            return (Criteria) this;
        }

        public Criteria andCompanynametbNotLike(String value) {
            addCriterion("COMPANYNAMETB not like", value, "companynametb");
            return (Criteria) this;
        }

        public Criteria andCompanynametbIn(List<String> values) {
            addCriterion("COMPANYNAMETB in", values, "companynametb");
            return (Criteria) this;
        }

        public Criteria andCompanynametbNotIn(List<String> values) {
            addCriterion("COMPANYNAMETB not in", values, "companynametb");
            return (Criteria) this;
        }

        public Criteria andCompanynametbBetween(String value1, String value2) {
            addCriterion("COMPANYNAMETB between", value1, value2, "companynametb");
            return (Criteria) this;
        }

        public Criteria andCompanynametbNotBetween(String value1, String value2) {
            addCriterion("COMPANYNAMETB not between", value1, value2, "companynametb");
            return (Criteria) this;
        }

        public Criteria andMiddlepackIsNull() {
            addCriterion("MIDDLEPACK is null");
            return (Criteria) this;
        }

        public Criteria andMiddlepackIsNotNull() {
            addCriterion("MIDDLEPACK is not null");
            return (Criteria) this;
        }

        public Criteria andMiddlepackEqualTo(String value) {
            addCriterion("MIDDLEPACK =", value, "middlepack");
            return (Criteria) this;
        }

        public Criteria andMiddlepackNotEqualTo(String value) {
            addCriterion("MIDDLEPACK <>", value, "middlepack");
            return (Criteria) this;
        }

        public Criteria andMiddlepackGreaterThan(String value) {
            addCriterion("MIDDLEPACK >", value, "middlepack");
            return (Criteria) this;
        }

        public Criteria andMiddlepackGreaterThanOrEqualTo(String value) {
            addCriterion("MIDDLEPACK >=", value, "middlepack");
            return (Criteria) this;
        }

        public Criteria andMiddlepackLessThan(String value) {
            addCriterion("MIDDLEPACK <", value, "middlepack");
            return (Criteria) this;
        }

        public Criteria andMiddlepackLessThanOrEqualTo(String value) {
            addCriterion("MIDDLEPACK <=", value, "middlepack");
            return (Criteria) this;
        }

        public Criteria andMiddlepackLike(String value) {
            addCriterion("MIDDLEPACK like", value, "middlepack");
            return (Criteria) this;
        }

        public Criteria andMiddlepackNotLike(String value) {
            addCriterion("MIDDLEPACK not like", value, "middlepack");
            return (Criteria) this;
        }

        public Criteria andMiddlepackIn(List<String> values) {
            addCriterion("MIDDLEPACK in", values, "middlepack");
            return (Criteria) this;
        }

        public Criteria andMiddlepackNotIn(List<String> values) {
            addCriterion("MIDDLEPACK not in", values, "middlepack");
            return (Criteria) this;
        }

        public Criteria andMiddlepackBetween(String value1, String value2) {
            addCriterion("MIDDLEPACK between", value1, value2, "middlepack");
            return (Criteria) this;
        }

        public Criteria andMiddlepackNotBetween(String value1, String value2) {
            addCriterion("MIDDLEPACK not between", value1, value2, "middlepack");
            return (Criteria) this;
        }

        public Criteria andMaxpackIsNull() {
            addCriterion("MAXPACK is null");
            return (Criteria) this;
        }

        public Criteria andMaxpackIsNotNull() {
            addCriterion("MAXPACK is not null");
            return (Criteria) this;
        }

        public Criteria andMaxpackEqualTo(String value) {
            addCriterion("MAXPACK =", value, "maxpack");
            return (Criteria) this;
        }

        public Criteria andMaxpackNotEqualTo(String value) {
            addCriterion("MAXPACK <>", value, "maxpack");
            return (Criteria) this;
        }

        public Criteria andMaxpackGreaterThan(String value) {
            addCriterion("MAXPACK >", value, "maxpack");
            return (Criteria) this;
        }

        public Criteria andMaxpackGreaterThanOrEqualTo(String value) {
            addCriterion("MAXPACK >=", value, "maxpack");
            return (Criteria) this;
        }

        public Criteria andMaxpackLessThan(String value) {
            addCriterion("MAXPACK <", value, "maxpack");
            return (Criteria) this;
        }

        public Criteria andMaxpackLessThanOrEqualTo(String value) {
            addCriterion("MAXPACK <=", value, "maxpack");
            return (Criteria) this;
        }

        public Criteria andMaxpackLike(String value) {
            addCriterion("MAXPACK like", value, "maxpack");
            return (Criteria) this;
        }

        public Criteria andMaxpackNotLike(String value) {
            addCriterion("MAXPACK not like", value, "maxpack");
            return (Criteria) this;
        }

        public Criteria andMaxpackIn(List<String> values) {
            addCriterion("MAXPACK in", values, "maxpack");
            return (Criteria) this;
        }

        public Criteria andMaxpackNotIn(List<String> values) {
            addCriterion("MAXPACK not in", values, "maxpack");
            return (Criteria) this;
        }

        public Criteria andMaxpackBetween(String value1, String value2) {
            addCriterion("MAXPACK between", value1, value2, "maxpack");
            return (Criteria) this;
        }

        public Criteria andMaxpackNotBetween(String value1, String value2) {
            addCriterion("MAXPACK not between", value1, value2, "maxpack");
            return (Criteria) this;
        }

        public Criteria andIsbasedrugIsNull() {
            addCriterion("ISBASEDRUG is null");
            return (Criteria) this;
        }

        public Criteria andIsbasedrugIsNotNull() {
            addCriterion("ISBASEDRUG is not null");
            return (Criteria) this;
        }

        public Criteria andIsbasedrugEqualTo(String value) {
            addCriterion("ISBASEDRUG =", value, "isbasedrug");
            return (Criteria) this;
        }

        public Criteria andIsbasedrugNotEqualTo(String value) {
            addCriterion("ISBASEDRUG <>", value, "isbasedrug");
            return (Criteria) this;
        }

        public Criteria andIsbasedrugGreaterThan(String value) {
            addCriterion("ISBASEDRUG >", value, "isbasedrug");
            return (Criteria) this;
        }

        public Criteria andIsbasedrugGreaterThanOrEqualTo(String value) {
            addCriterion("ISBASEDRUG >=", value, "isbasedrug");
            return (Criteria) this;
        }

        public Criteria andIsbasedrugLessThan(String value) {
            addCriterion("ISBASEDRUG <", value, "isbasedrug");
            return (Criteria) this;
        }

        public Criteria andIsbasedrugLessThanOrEqualTo(String value) {
            addCriterion("ISBASEDRUG <=", value, "isbasedrug");
            return (Criteria) this;
        }

        public Criteria andIsbasedrugLike(String value) {
            addCriterion("ISBASEDRUG like", value, "isbasedrug");
            return (Criteria) this;
        }

        public Criteria andIsbasedrugNotLike(String value) {
            addCriterion("ISBASEDRUG not like", value, "isbasedrug");
            return (Criteria) this;
        }

        public Criteria andIsbasedrugIn(List<String> values) {
            addCriterion("ISBASEDRUG in", values, "isbasedrug");
            return (Criteria) this;
        }

        public Criteria andIsbasedrugNotIn(List<String> values) {
            addCriterion("ISBASEDRUG not in", values, "isbasedrug");
            return (Criteria) this;
        }

        public Criteria andIsbasedrugBetween(String value1, String value2) {
            addCriterion("ISBASEDRUG between", value1, value2, "isbasedrug");
            return (Criteria) this;
        }

        public Criteria andIsbasedrugNotBetween(String value1, String value2) {
            addCriterion("ISBASEDRUG not between", value1, value2, "isbasedrug");
            return (Criteria) this;
        }

        public Criteria andQualitylevelIsNull() {
            addCriterion("QUALITYLEVEL is null");
            return (Criteria) this;
        }

        public Criteria andQualitylevelIsNotNull() {
            addCriterion("QUALITYLEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andQualitylevelEqualTo(String value) {
            addCriterion("QUALITYLEVEL =", value, "qualitylevel");
            return (Criteria) this;
        }

        public Criteria andQualitylevelNotEqualTo(String value) {
            addCriterion("QUALITYLEVEL <>", value, "qualitylevel");
            return (Criteria) this;
        }

        public Criteria andQualitylevelGreaterThan(String value) {
            addCriterion("QUALITYLEVEL >", value, "qualitylevel");
            return (Criteria) this;
        }

        public Criteria andQualitylevelGreaterThanOrEqualTo(String value) {
            addCriterion("QUALITYLEVEL >=", value, "qualitylevel");
            return (Criteria) this;
        }

        public Criteria andQualitylevelLessThan(String value) {
            addCriterion("QUALITYLEVEL <", value, "qualitylevel");
            return (Criteria) this;
        }

        public Criteria andQualitylevelLessThanOrEqualTo(String value) {
            addCriterion("QUALITYLEVEL <=", value, "qualitylevel");
            return (Criteria) this;
        }

        public Criteria andQualitylevelLike(String value) {
            addCriterion("QUALITYLEVEL like", value, "qualitylevel");
            return (Criteria) this;
        }

        public Criteria andQualitylevelNotLike(String value) {
            addCriterion("QUALITYLEVEL not like", value, "qualitylevel");
            return (Criteria) this;
        }

        public Criteria andQualitylevelIn(List<String> values) {
            addCriterion("QUALITYLEVEL in", values, "qualitylevel");
            return (Criteria) this;
        }

        public Criteria andQualitylevelNotIn(List<String> values) {
            addCriterion("QUALITYLEVEL not in", values, "qualitylevel");
            return (Criteria) this;
        }

        public Criteria andQualitylevelBetween(String value1, String value2) {
            addCriterion("QUALITYLEVEL between", value1, value2, "qualitylevel");
            return (Criteria) this;
        }

        public Criteria andQualitylevelNotBetween(String value1, String value2) {
            addCriterion("QUALITYLEVEL not between", value1, value2, "qualitylevel");
            return (Criteria) this;
        }

        public Criteria andPurchasetypeIsNull() {
            addCriterion("PURCHASETYPE is null");
            return (Criteria) this;
        }

        public Criteria andPurchasetypeIsNotNull() {
            addCriterion("PURCHASETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPurchasetypeEqualTo(String value) {
            addCriterion("PURCHASETYPE =", value, "purchasetype");
            return (Criteria) this;
        }

        public Criteria andPurchasetypeNotEqualTo(String value) {
            addCriterion("PURCHASETYPE <>", value, "purchasetype");
            return (Criteria) this;
        }

        public Criteria andPurchasetypeGreaterThan(String value) {
            addCriterion("PURCHASETYPE >", value, "purchasetype");
            return (Criteria) this;
        }

        public Criteria andPurchasetypeGreaterThanOrEqualTo(String value) {
            addCriterion("PURCHASETYPE >=", value, "purchasetype");
            return (Criteria) this;
        }

        public Criteria andPurchasetypeLessThan(String value) {
            addCriterion("PURCHASETYPE <", value, "purchasetype");
            return (Criteria) this;
        }

        public Criteria andPurchasetypeLessThanOrEqualTo(String value) {
            addCriterion("PURCHASETYPE <=", value, "purchasetype");
            return (Criteria) this;
        }

        public Criteria andPurchasetypeLike(String value) {
            addCriterion("PURCHASETYPE like", value, "purchasetype");
            return (Criteria) this;
        }

        public Criteria andPurchasetypeNotLike(String value) {
            addCriterion("PURCHASETYPE not like", value, "purchasetype");
            return (Criteria) this;
        }

        public Criteria andPurchasetypeIn(List<String> values) {
            addCriterion("PURCHASETYPE in", values, "purchasetype");
            return (Criteria) this;
        }

        public Criteria andPurchasetypeNotIn(List<String> values) {
            addCriterion("PURCHASETYPE not in", values, "purchasetype");
            return (Criteria) this;
        }

        public Criteria andPurchasetypeBetween(String value1, String value2) {
            addCriterion("PURCHASETYPE between", value1, value2, "purchasetype");
            return (Criteria) this;
        }

        public Criteria andPurchasetypeNotBetween(String value1, String value2) {
            addCriterion("PURCHASETYPE not between", value1, value2, "purchasetype");
            return (Criteria) this;
        }

        public Criteria andSourceidIsNull() {
            addCriterion("SOURCEID is null");
            return (Criteria) this;
        }

        public Criteria andSourceidIsNotNull() {
            addCriterion("SOURCEID is not null");
            return (Criteria) this;
        }

        public Criteria andSourceidEqualTo(String value) {
            addCriterion("SOURCEID =", value, "sourceid");
            return (Criteria) this;
        }

        public Criteria andSourceidNotEqualTo(String value) {
            addCriterion("SOURCEID <>", value, "sourceid");
            return (Criteria) this;
        }

        public Criteria andSourceidGreaterThan(String value) {
            addCriterion("SOURCEID >", value, "sourceid");
            return (Criteria) this;
        }

        public Criteria andSourceidGreaterThanOrEqualTo(String value) {
            addCriterion("SOURCEID >=", value, "sourceid");
            return (Criteria) this;
        }

        public Criteria andSourceidLessThan(String value) {
            addCriterion("SOURCEID <", value, "sourceid");
            return (Criteria) this;
        }

        public Criteria andSourceidLessThanOrEqualTo(String value) {
            addCriterion("SOURCEID <=", value, "sourceid");
            return (Criteria) this;
        }

        public Criteria andSourceidLike(String value) {
            addCriterion("SOURCEID like", value, "sourceid");
            return (Criteria) this;
        }

        public Criteria andSourceidNotLike(String value) {
            addCriterion("SOURCEID not like", value, "sourceid");
            return (Criteria) this;
        }

        public Criteria andSourceidIn(List<String> values) {
            addCriterion("SOURCEID in", values, "sourceid");
            return (Criteria) this;
        }

        public Criteria andSourceidNotIn(List<String> values) {
            addCriterion("SOURCEID not in", values, "sourceid");
            return (Criteria) this;
        }

        public Criteria andSourceidBetween(String value1, String value2) {
            addCriterion("SOURCEID between", value1, value2, "sourceid");
            return (Criteria) this;
        }

        public Criteria andSourceidNotBetween(String value1, String value2) {
            addCriterion("SOURCEID not between", value1, value2, "sourceid");
            return (Criteria) this;
        }

        public Criteria andSourcenameIsNull() {
            addCriterion("SOURCENAME is null");
            return (Criteria) this;
        }

        public Criteria andSourcenameIsNotNull() {
            addCriterion("SOURCENAME is not null");
            return (Criteria) this;
        }

        public Criteria andSourcenameEqualTo(String value) {
            addCriterion("SOURCENAME =", value, "sourcename");
            return (Criteria) this;
        }

        public Criteria andSourcenameNotEqualTo(String value) {
            addCriterion("SOURCENAME <>", value, "sourcename");
            return (Criteria) this;
        }

        public Criteria andSourcenameGreaterThan(String value) {
            addCriterion("SOURCENAME >", value, "sourcename");
            return (Criteria) this;
        }

        public Criteria andSourcenameGreaterThanOrEqualTo(String value) {
            addCriterion("SOURCENAME >=", value, "sourcename");
            return (Criteria) this;
        }

        public Criteria andSourcenameLessThan(String value) {
            addCriterion("SOURCENAME <", value, "sourcename");
            return (Criteria) this;
        }

        public Criteria andSourcenameLessThanOrEqualTo(String value) {
            addCriterion("SOURCENAME <=", value, "sourcename");
            return (Criteria) this;
        }

        public Criteria andSourcenameLike(String value) {
            addCriterion("SOURCENAME like", value, "sourcename");
            return (Criteria) this;
        }

        public Criteria andSourcenameNotLike(String value) {
            addCriterion("SOURCENAME not like", value, "sourcename");
            return (Criteria) this;
        }

        public Criteria andSourcenameIn(List<String> values) {
            addCriterion("SOURCENAME in", values, "sourcename");
            return (Criteria) this;
        }

        public Criteria andSourcenameNotIn(List<String> values) {
            addCriterion("SOURCENAME not in", values, "sourcename");
            return (Criteria) this;
        }

        public Criteria andSourcenameBetween(String value1, String value2) {
            addCriterion("SOURCENAME between", value1, value2, "sourcename");
            return (Criteria) this;
        }

        public Criteria andSourcenameNotBetween(String value1, String value2) {
            addCriterion("SOURCENAME not between", value1, value2, "sourcename");
            return (Criteria) this;
        }

        public Criteria andBidpriceIsNull() {
            addCriterion("BIDPRICE is null");
            return (Criteria) this;
        }

        public Criteria andBidpriceIsNotNull() {
            addCriterion("BIDPRICE is not null");
            return (Criteria) this;
        }

        public Criteria andBidpriceEqualTo(String value) {
            addCriterion("BIDPRICE =", value, "bidprice");
            return (Criteria) this;
        }

        public Criteria andBidpriceNotEqualTo(String value) {
            addCriterion("BIDPRICE <>", value, "bidprice");
            return (Criteria) this;
        }

        public Criteria andBidpriceGreaterThan(String value) {
            addCriterion("BIDPRICE >", value, "bidprice");
            return (Criteria) this;
        }

        public Criteria andBidpriceGreaterThanOrEqualTo(String value) {
            addCriterion("BIDPRICE >=", value, "bidprice");
            return (Criteria) this;
        }

        public Criteria andBidpriceLessThan(String value) {
            addCriterion("BIDPRICE <", value, "bidprice");
            return (Criteria) this;
        }

        public Criteria andBidpriceLessThanOrEqualTo(String value) {
            addCriterion("BIDPRICE <=", value, "bidprice");
            return (Criteria) this;
        }

        public Criteria andBidpriceLike(String value) {
            addCriterion("BIDPRICE like", value, "bidprice");
            return (Criteria) this;
        }

        public Criteria andBidpriceNotLike(String value) {
            addCriterion("BIDPRICE not like", value, "bidprice");
            return (Criteria) this;
        }

        public Criteria andBidpriceIn(List<String> values) {
            addCriterion("BIDPRICE in", values, "bidprice");
            return (Criteria) this;
        }

        public Criteria andBidpriceNotIn(List<String> values) {
            addCriterion("BIDPRICE not in", values, "bidprice");
            return (Criteria) this;
        }

        public Criteria andBidpriceBetween(String value1, String value2) {
            addCriterion("BIDPRICE between", value1, value2, "bidprice");
            return (Criteria) this;
        }

        public Criteria andBidpriceNotBetween(String value1, String value2) {
            addCriterion("BIDPRICE not between", value1, value2, "bidprice");
            return (Criteria) this;
        }

        public Criteria andUsingrangIsNull() {
            addCriterion("USINGRANG is null");
            return (Criteria) this;
        }

        public Criteria andUsingrangIsNotNull() {
            addCriterion("USINGRANG is not null");
            return (Criteria) this;
        }

        public Criteria andUsingrangEqualTo(String value) {
            addCriterion("USINGRANG =", value, "usingrang");
            return (Criteria) this;
        }

        public Criteria andUsingrangNotEqualTo(String value) {
            addCriterion("USINGRANG <>", value, "usingrang");
            return (Criteria) this;
        }

        public Criteria andUsingrangGreaterThan(String value) {
            addCriterion("USINGRANG >", value, "usingrang");
            return (Criteria) this;
        }

        public Criteria andUsingrangGreaterThanOrEqualTo(String value) {
            addCriterion("USINGRANG >=", value, "usingrang");
            return (Criteria) this;
        }

        public Criteria andUsingrangLessThan(String value) {
            addCriterion("USINGRANG <", value, "usingrang");
            return (Criteria) this;
        }

        public Criteria andUsingrangLessThanOrEqualTo(String value) {
            addCriterion("USINGRANG <=", value, "usingrang");
            return (Criteria) this;
        }

        public Criteria andUsingrangLike(String value) {
            addCriterion("USINGRANG like", value, "usingrang");
            return (Criteria) this;
        }

        public Criteria andUsingrangNotLike(String value) {
            addCriterion("USINGRANG not like", value, "usingrang");
            return (Criteria) this;
        }

        public Criteria andUsingrangIn(List<String> values) {
            addCriterion("USINGRANG in", values, "usingrang");
            return (Criteria) this;
        }

        public Criteria andUsingrangNotIn(List<String> values) {
            addCriterion("USINGRANG not in", values, "usingrang");
            return (Criteria) this;
        }

        public Criteria andUsingrangBetween(String value1, String value2) {
            addCriterion("USINGRANG between", value1, value2, "usingrang");
            return (Criteria) this;
        }

        public Criteria andUsingrangNotBetween(String value1, String value2) {
            addCriterion("USINGRANG not between", value1, value2, "usingrang");
            return (Criteria) this;
        }

        public Criteria andHospitalidIsNull() {
            addCriterion("HOSPITALID is null");
            return (Criteria) this;
        }

        public Criteria andHospitalidIsNotNull() {
            addCriterion("HOSPITALID is not null");
            return (Criteria) this;
        }

        public Criteria andHospitalidEqualTo(String value) {
            addCriterion("HOSPITALID =", value, "hospitalid");
            return (Criteria) this;
        }

        public Criteria andHospitalidNotEqualTo(String value) {
            addCriterion("HOSPITALID <>", value, "hospitalid");
            return (Criteria) this;
        }

        public Criteria andHospitalidGreaterThan(String value) {
            addCriterion("HOSPITALID >", value, "hospitalid");
            return (Criteria) this;
        }

        public Criteria andHospitalidGreaterThanOrEqualTo(String value) {
            addCriterion("HOSPITALID >=", value, "hospitalid");
            return (Criteria) this;
        }

        public Criteria andHospitalidLessThan(String value) {
            addCriterion("HOSPITALID <", value, "hospitalid");
            return (Criteria) this;
        }

        public Criteria andHospitalidLessThanOrEqualTo(String value) {
            addCriterion("HOSPITALID <=", value, "hospitalid");
            return (Criteria) this;
        }

        public Criteria andHospitalidLike(String value) {
            addCriterion("HOSPITALID like", value, "hospitalid");
            return (Criteria) this;
        }

        public Criteria andHospitalidNotLike(String value) {
            addCriterion("HOSPITALID not like", value, "hospitalid");
            return (Criteria) this;
        }

        public Criteria andHospitalidIn(List<String> values) {
            addCriterion("HOSPITALID in", values, "hospitalid");
            return (Criteria) this;
        }

        public Criteria andHospitalidNotIn(List<String> values) {
            addCriterion("HOSPITALID not in", values, "hospitalid");
            return (Criteria) this;
        }

        public Criteria andHospitalidBetween(String value1, String value2) {
            addCriterion("HOSPITALID between", value1, value2, "hospitalid");
            return (Criteria) this;
        }

        public Criteria andHospitalidNotBetween(String value1, String value2) {
            addCriterion("HOSPITALID not between", value1, value2, "hospitalid");
            return (Criteria) this;
        }

        public Criteria andHospitalnameIsNull() {
            addCriterion("HOSPITALNAME is null");
            return (Criteria) this;
        }

        public Criteria andHospitalnameIsNotNull() {
            addCriterion("HOSPITALNAME is not null");
            return (Criteria) this;
        }

        public Criteria andHospitalnameEqualTo(String value) {
            addCriterion("HOSPITALNAME =", value, "hospitalname");
            return (Criteria) this;
        }

        public Criteria andHospitalnameNotEqualTo(String value) {
            addCriterion("HOSPITALNAME <>", value, "hospitalname");
            return (Criteria) this;
        }

        public Criteria andHospitalnameGreaterThan(String value) {
            addCriterion("HOSPITALNAME >", value, "hospitalname");
            return (Criteria) this;
        }

        public Criteria andHospitalnameGreaterThanOrEqualTo(String value) {
            addCriterion("HOSPITALNAME >=", value, "hospitalname");
            return (Criteria) this;
        }

        public Criteria andHospitalnameLessThan(String value) {
            addCriterion("HOSPITALNAME <", value, "hospitalname");
            return (Criteria) this;
        }

        public Criteria andHospitalnameLessThanOrEqualTo(String value) {
            addCriterion("HOSPITALNAME <=", value, "hospitalname");
            return (Criteria) this;
        }

        public Criteria andHospitalnameLike(String value) {
            addCriterion("HOSPITALNAME like", value, "hospitalname");
            return (Criteria) this;
        }

        public Criteria andHospitalnameNotLike(String value) {
            addCriterion("HOSPITALNAME not like", value, "hospitalname");
            return (Criteria) this;
        }

        public Criteria andHospitalnameIn(List<String> values) {
            addCriterion("HOSPITALNAME in", values, "hospitalname");
            return (Criteria) this;
        }

        public Criteria andHospitalnameNotIn(List<String> values) {
            addCriterion("HOSPITALNAME not in", values, "hospitalname");
            return (Criteria) this;
        }

        public Criteria andHospitalnameBetween(String value1, String value2) {
            addCriterion("HOSPITALNAME between", value1, value2, "hospitalname");
            return (Criteria) this;
        }

        public Criteria andHospitalnameNotBetween(String value1, String value2) {
            addCriterion("HOSPITALNAME not between", value1, value2, "hospitalname");
            return (Criteria) this;
        }

        public Criteria andHospitaldepartmentidIsNull() {
            addCriterion("HOSPITALDEPARTMENTID is null");
            return (Criteria) this;
        }

        public Criteria andHospitaldepartmentidIsNotNull() {
            addCriterion("HOSPITALDEPARTMENTID is not null");
            return (Criteria) this;
        }

        public Criteria andHospitaldepartmentidEqualTo(String value) {
            addCriterion("HOSPITALDEPARTMENTID =", value, "hospitaldepartmentid");
            return (Criteria) this;
        }

        public Criteria andHospitaldepartmentidNotEqualTo(String value) {
            addCriterion("HOSPITALDEPARTMENTID <>", value, "hospitaldepartmentid");
            return (Criteria) this;
        }

        public Criteria andHospitaldepartmentidGreaterThan(String value) {
            addCriterion("HOSPITALDEPARTMENTID >", value, "hospitaldepartmentid");
            return (Criteria) this;
        }

        public Criteria andHospitaldepartmentidGreaterThanOrEqualTo(String value) {
            addCriterion("HOSPITALDEPARTMENTID >=", value, "hospitaldepartmentid");
            return (Criteria) this;
        }

        public Criteria andHospitaldepartmentidLessThan(String value) {
            addCriterion("HOSPITALDEPARTMENTID <", value, "hospitaldepartmentid");
            return (Criteria) this;
        }

        public Criteria andHospitaldepartmentidLessThanOrEqualTo(String value) {
            addCriterion("HOSPITALDEPARTMENTID <=", value, "hospitaldepartmentid");
            return (Criteria) this;
        }

        public Criteria andHospitaldepartmentidLike(String value) {
            addCriterion("HOSPITALDEPARTMENTID like", value, "hospitaldepartmentid");
            return (Criteria) this;
        }

        public Criteria andHospitaldepartmentidNotLike(String value) {
            addCriterion("HOSPITALDEPARTMENTID not like", value, "hospitaldepartmentid");
            return (Criteria) this;
        }

        public Criteria andHospitaldepartmentidIn(List<String> values) {
            addCriterion("HOSPITALDEPARTMENTID in", values, "hospitaldepartmentid");
            return (Criteria) this;
        }

        public Criteria andHospitaldepartmentidNotIn(List<String> values) {
            addCriterion("HOSPITALDEPARTMENTID not in", values, "hospitaldepartmentid");
            return (Criteria) this;
        }

        public Criteria andHospitaldepartmentidBetween(String value1, String value2) {
            addCriterion("HOSPITALDEPARTMENTID between", value1, value2, "hospitaldepartmentid");
            return (Criteria) this;
        }

        public Criteria andHospitaldepartmentidNotBetween(String value1, String value2) {
            addCriterion("HOSPITALDEPARTMENTID not between", value1, value2, "hospitaldepartmentid");
            return (Criteria) this;
        }

        public Criteria andHospitaldepartmentnameIsNull() {
            addCriterion("HOSPITALDEPARTMENTNAME is null");
            return (Criteria) this;
        }

        public Criteria andHospitaldepartmentnameIsNotNull() {
            addCriterion("HOSPITALDEPARTMENTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andHospitaldepartmentnameEqualTo(String value) {
            addCriterion("HOSPITALDEPARTMENTNAME =", value, "hospitaldepartmentname");
            return (Criteria) this;
        }

        public Criteria andHospitaldepartmentnameNotEqualTo(String value) {
            addCriterion("HOSPITALDEPARTMENTNAME <>", value, "hospitaldepartmentname");
            return (Criteria) this;
        }

        public Criteria andHospitaldepartmentnameGreaterThan(String value) {
            addCriterion("HOSPITALDEPARTMENTNAME >", value, "hospitaldepartmentname");
            return (Criteria) this;
        }

        public Criteria andHospitaldepartmentnameGreaterThanOrEqualTo(String value) {
            addCriterion("HOSPITALDEPARTMENTNAME >=", value, "hospitaldepartmentname");
            return (Criteria) this;
        }

        public Criteria andHospitaldepartmentnameLessThan(String value) {
            addCriterion("HOSPITALDEPARTMENTNAME <", value, "hospitaldepartmentname");
            return (Criteria) this;
        }

        public Criteria andHospitaldepartmentnameLessThanOrEqualTo(String value) {
            addCriterion("HOSPITALDEPARTMENTNAME <=", value, "hospitaldepartmentname");
            return (Criteria) this;
        }

        public Criteria andHospitaldepartmentnameLike(String value) {
            addCriterion("HOSPITALDEPARTMENTNAME like", value, "hospitaldepartmentname");
            return (Criteria) this;
        }

        public Criteria andHospitaldepartmentnameNotLike(String value) {
            addCriterion("HOSPITALDEPARTMENTNAME not like", value, "hospitaldepartmentname");
            return (Criteria) this;
        }

        public Criteria andHospitaldepartmentnameIn(List<String> values) {
            addCriterion("HOSPITALDEPARTMENTNAME in", values, "hospitaldepartmentname");
            return (Criteria) this;
        }

        public Criteria andHospitaldepartmentnameNotIn(List<String> values) {
            addCriterion("HOSPITALDEPARTMENTNAME not in", values, "hospitaldepartmentname");
            return (Criteria) this;
        }

        public Criteria andHospitaldepartmentnameBetween(String value1, String value2) {
            addCriterion("HOSPITALDEPARTMENTNAME between", value1, value2, "hospitaldepartmentname");
            return (Criteria) this;
        }

        public Criteria andHospitaldepartmentnameNotBetween(String value1, String value2) {
            addCriterion("HOSPITALDEPARTMENTNAME not between", value1, value2, "hospitaldepartmentname");
            return (Criteria) this;
        }

        public Criteria andAdminareaidstatisticsdrugIsNull() {
            addCriterion("ADMINAREAIDSTATISTICSDRUG is null");
            return (Criteria) this;
        }

        public Criteria andAdminareaidstatisticsdrugIsNotNull() {
            addCriterion("ADMINAREAIDSTATISTICSDRUG is not null");
            return (Criteria) this;
        }

        public Criteria andAdminareaidstatisticsdrugEqualTo(String value) {
            addCriterion("ADMINAREAIDSTATISTICSDRUG =", value, "adminareaidstatisticsdrug");
            return (Criteria) this;
        }

        public Criteria andAdminareaidstatisticsdrugNotEqualTo(String value) {
            addCriterion("ADMINAREAIDSTATISTICSDRUG <>", value, "adminareaidstatisticsdrug");
            return (Criteria) this;
        }

        public Criteria andAdminareaidstatisticsdrugGreaterThan(String value) {
            addCriterion("ADMINAREAIDSTATISTICSDRUG >", value, "adminareaidstatisticsdrug");
            return (Criteria) this;
        }

        public Criteria andAdminareaidstatisticsdrugGreaterThanOrEqualTo(String value) {
            addCriterion("ADMINAREAIDSTATISTICSDRUG >=", value, "adminareaidstatisticsdrug");
            return (Criteria) this;
        }

        public Criteria andAdminareaidstatisticsdrugLessThan(String value) {
            addCriterion("ADMINAREAIDSTATISTICSDRUG <", value, "adminareaidstatisticsdrug");
            return (Criteria) this;
        }

        public Criteria andAdminareaidstatisticsdrugLessThanOrEqualTo(String value) {
            addCriterion("ADMINAREAIDSTATISTICSDRUG <=", value, "adminareaidstatisticsdrug");
            return (Criteria) this;
        }

        public Criteria andAdminareaidstatisticsdrugLike(String value) {
            addCriterion("ADMINAREAIDSTATISTICSDRUG like", value, "adminareaidstatisticsdrug");
            return (Criteria) this;
        }

        public Criteria andAdminareaidstatisticsdrugNotLike(String value) {
            addCriterion("ADMINAREAIDSTATISTICSDRUG not like", value, "adminareaidstatisticsdrug");
            return (Criteria) this;
        }

        public Criteria andAdminareaidstatisticsdrugIn(List<String> values) {
            addCriterion("ADMINAREAIDSTATISTICSDRUG in", values, "adminareaidstatisticsdrug");
            return (Criteria) this;
        }

        public Criteria andAdminareaidstatisticsdrugNotIn(List<String> values) {
            addCriterion("ADMINAREAIDSTATISTICSDRUG not in", values, "adminareaidstatisticsdrug");
            return (Criteria) this;
        }

        public Criteria andAdminareaidstatisticsdrugBetween(String value1, String value2) {
            addCriterion("ADMINAREAIDSTATISTICSDRUG between", value1, value2, "adminareaidstatisticsdrug");
            return (Criteria) this;
        }

        public Criteria andAdminareaidstatisticsdrugNotBetween(String value1, String value2) {
            addCriterion("ADMINAREAIDSTATISTICSDRUG not between", value1, value2, "adminareaidstatisticsdrug");
            return (Criteria) this;
        }

        public Criteria andAdminareanamedrugIsNull() {
            addCriterion("ADMINAREANAMEDRUG is null");
            return (Criteria) this;
        }

        public Criteria andAdminareanamedrugIsNotNull() {
            addCriterion("ADMINAREANAMEDRUG is not null");
            return (Criteria) this;
        }

        public Criteria andAdminareanamedrugEqualTo(String value) {
            addCriterion("ADMINAREANAMEDRUG =", value, "adminareanamedrug");
            return (Criteria) this;
        }

        public Criteria andAdminareanamedrugNotEqualTo(String value) {
            addCriterion("ADMINAREANAMEDRUG <>", value, "adminareanamedrug");
            return (Criteria) this;
        }

        public Criteria andAdminareanamedrugGreaterThan(String value) {
            addCriterion("ADMINAREANAMEDRUG >", value, "adminareanamedrug");
            return (Criteria) this;
        }

        public Criteria andAdminareanamedrugGreaterThanOrEqualTo(String value) {
            addCriterion("ADMINAREANAMEDRUG >=", value, "adminareanamedrug");
            return (Criteria) this;
        }

        public Criteria andAdminareanamedrugLessThan(String value) {
            addCriterion("ADMINAREANAMEDRUG <", value, "adminareanamedrug");
            return (Criteria) this;
        }

        public Criteria andAdminareanamedrugLessThanOrEqualTo(String value) {
            addCriterion("ADMINAREANAMEDRUG <=", value, "adminareanamedrug");
            return (Criteria) this;
        }

        public Criteria andAdminareanamedrugLike(String value) {
            addCriterion("ADMINAREANAMEDRUG like", value, "adminareanamedrug");
            return (Criteria) this;
        }

        public Criteria andAdminareanamedrugNotLike(String value) {
            addCriterion("ADMINAREANAMEDRUG not like", value, "adminareanamedrug");
            return (Criteria) this;
        }

        public Criteria andAdminareanamedrugIn(List<String> values) {
            addCriterion("ADMINAREANAMEDRUG in", values, "adminareanamedrug");
            return (Criteria) this;
        }

        public Criteria andAdminareanamedrugNotIn(List<String> values) {
            addCriterion("ADMINAREANAMEDRUG not in", values, "adminareanamedrug");
            return (Criteria) this;
        }

        public Criteria andAdminareanamedrugBetween(String value1, String value2) {
            addCriterion("ADMINAREANAMEDRUG between", value1, value2, "adminareanamedrug");
            return (Criteria) this;
        }

        public Criteria andAdminareanamedrugNotBetween(String value1, String value2) {
            addCriterion("ADMINAREANAMEDRUG not between", value1, value2, "adminareanamedrug");
            return (Criteria) this;
        }

        public Criteria andAdminareaiddrugIsNull() {
            addCriterion("ADMINAREAIDDRUG is null");
            return (Criteria) this;
        }

        public Criteria andAdminareaiddrugIsNotNull() {
            addCriterion("ADMINAREAIDDRUG is not null");
            return (Criteria) this;
        }

        public Criteria andAdminareaiddrugEqualTo(String value) {
            addCriterion("ADMINAREAIDDRUG =", value, "adminareaiddrug");
            return (Criteria) this;
        }

        public Criteria andAdminareaiddrugNotEqualTo(String value) {
            addCriterion("ADMINAREAIDDRUG <>", value, "adminareaiddrug");
            return (Criteria) this;
        }

        public Criteria andAdminareaiddrugGreaterThan(String value) {
            addCriterion("ADMINAREAIDDRUG >", value, "adminareaiddrug");
            return (Criteria) this;
        }

        public Criteria andAdminareaiddrugGreaterThanOrEqualTo(String value) {
            addCriterion("ADMINAREAIDDRUG >=", value, "adminareaiddrug");
            return (Criteria) this;
        }

        public Criteria andAdminareaiddrugLessThan(String value) {
            addCriterion("ADMINAREAIDDRUG <", value, "adminareaiddrug");
            return (Criteria) this;
        }

        public Criteria andAdminareaiddrugLessThanOrEqualTo(String value) {
            addCriterion("ADMINAREAIDDRUG <=", value, "adminareaiddrug");
            return (Criteria) this;
        }

        public Criteria andAdminareaiddrugLike(String value) {
            addCriterion("ADMINAREAIDDRUG like", value, "adminareaiddrug");
            return (Criteria) this;
        }

        public Criteria andAdminareaiddrugNotLike(String value) {
            addCriterion("ADMINAREAIDDRUG not like", value, "adminareaiddrug");
            return (Criteria) this;
        }

        public Criteria andAdminareaiddrugIn(List<String> values) {
            addCriterion("ADMINAREAIDDRUG in", values, "adminareaiddrug");
            return (Criteria) this;
        }

        public Criteria andAdminareaiddrugNotIn(List<String> values) {
            addCriterion("ADMINAREAIDDRUG not in", values, "adminareaiddrug");
            return (Criteria) this;
        }

        public Criteria andAdminareaiddrugBetween(String value1, String value2) {
            addCriterion("ADMINAREAIDDRUG between", value1, value2, "adminareaiddrug");
            return (Criteria) this;
        }

        public Criteria andAdminareaiddrugNotBetween(String value1, String value2) {
            addCriterion("ADMINAREAIDDRUG not between", value1, value2, "adminareaiddrug");
            return (Criteria) this;
        }

        public Criteria andBelongorgnameIsNull() {
            addCriterion("BELONGORGNAME is null");
            return (Criteria) this;
        }

        public Criteria andBelongorgnameIsNotNull() {
            addCriterion("BELONGORGNAME is not null");
            return (Criteria) this;
        }

        public Criteria andBelongorgnameEqualTo(String value) {
            addCriterion("BELONGORGNAME =", value, "belongorgname");
            return (Criteria) this;
        }

        public Criteria andBelongorgnameNotEqualTo(String value) {
            addCriterion("BELONGORGNAME <>", value, "belongorgname");
            return (Criteria) this;
        }

        public Criteria andBelongorgnameGreaterThan(String value) {
            addCriterion("BELONGORGNAME >", value, "belongorgname");
            return (Criteria) this;
        }

        public Criteria andBelongorgnameGreaterThanOrEqualTo(String value) {
            addCriterion("BELONGORGNAME >=", value, "belongorgname");
            return (Criteria) this;
        }

        public Criteria andBelongorgnameLessThan(String value) {
            addCriterion("BELONGORGNAME <", value, "belongorgname");
            return (Criteria) this;
        }

        public Criteria andBelongorgnameLessThanOrEqualTo(String value) {
            addCriterion("BELONGORGNAME <=", value, "belongorgname");
            return (Criteria) this;
        }

        public Criteria andBelongorgnameLike(String value) {
            addCriterion("BELONGORGNAME like", value, "belongorgname");
            return (Criteria) this;
        }

        public Criteria andBelongorgnameNotLike(String value) {
            addCriterion("BELONGORGNAME not like", value, "belongorgname");
            return (Criteria) this;
        }

        public Criteria andBelongorgnameIn(List<String> values) {
            addCriterion("BELONGORGNAME in", values, "belongorgname");
            return (Criteria) this;
        }

        public Criteria andBelongorgnameNotIn(List<String> values) {
            addCriterion("BELONGORGNAME not in", values, "belongorgname");
            return (Criteria) this;
        }

        public Criteria andBelongorgnameBetween(String value1, String value2) {
            addCriterion("BELONGORGNAME between", value1, value2, "belongorgname");
            return (Criteria) this;
        }

        public Criteria andBelongorgnameNotBetween(String value1, String value2) {
            addCriterion("BELONGORGNAME not between", value1, value2, "belongorgname");
            return (Criteria) this;
        }

        public Criteria andOrdertypeIsNull() {
            addCriterion("ORDERTYPE is null");
            return (Criteria) this;
        }

        public Criteria andOrdertypeIsNotNull() {
            addCriterion("ORDERTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andOrdertypeEqualTo(String value) {
            addCriterion("ORDERTYPE =", value, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeNotEqualTo(String value) {
            addCriterion("ORDERTYPE <>", value, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeGreaterThan(String value) {
            addCriterion("ORDERTYPE >", value, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeGreaterThanOrEqualTo(String value) {
            addCriterion("ORDERTYPE >=", value, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeLessThan(String value) {
            addCriterion("ORDERTYPE <", value, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeLessThanOrEqualTo(String value) {
            addCriterion("ORDERTYPE <=", value, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeLike(String value) {
            addCriterion("ORDERTYPE like", value, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeNotLike(String value) {
            addCriterion("ORDERTYPE not like", value, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeIn(List<String> values) {
            addCriterion("ORDERTYPE in", values, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeNotIn(List<String> values) {
            addCriterion("ORDERTYPE not in", values, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeBetween(String value1, String value2) {
            addCriterion("ORDERTYPE between", value1, value2, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeNotBetween(String value1, String value2) {
            addCriterion("ORDERTYPE not between", value1, value2, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdernameIsNull() {
            addCriterion("ORDERNAME is null");
            return (Criteria) this;
        }

        public Criteria andOrdernameIsNotNull() {
            addCriterion("ORDERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andOrdernameEqualTo(String value) {
            addCriterion("ORDERNAME =", value, "ordername");
            return (Criteria) this;
        }

        public Criteria andOrdernameNotEqualTo(String value) {
            addCriterion("ORDERNAME <>", value, "ordername");
            return (Criteria) this;
        }

        public Criteria andOrdernameGreaterThan(String value) {
            addCriterion("ORDERNAME >", value, "ordername");
            return (Criteria) this;
        }

        public Criteria andOrdernameGreaterThanOrEqualTo(String value) {
            addCriterion("ORDERNAME >=", value, "ordername");
            return (Criteria) this;
        }

        public Criteria andOrdernameLessThan(String value) {
            addCriterion("ORDERNAME <", value, "ordername");
            return (Criteria) this;
        }

        public Criteria andOrdernameLessThanOrEqualTo(String value) {
            addCriterion("ORDERNAME <=", value, "ordername");
            return (Criteria) this;
        }

        public Criteria andOrdernameLike(String value) {
            addCriterion("ORDERNAME like", value, "ordername");
            return (Criteria) this;
        }

        public Criteria andOrdernameNotLike(String value) {
            addCriterion("ORDERNAME not like", value, "ordername");
            return (Criteria) this;
        }

        public Criteria andOrdernameIn(List<String> values) {
            addCriterion("ORDERNAME in", values, "ordername");
            return (Criteria) this;
        }

        public Criteria andOrdernameNotIn(List<String> values) {
            addCriterion("ORDERNAME not in", values, "ordername");
            return (Criteria) this;
        }

        public Criteria andOrdernameBetween(String value1, String value2) {
            addCriterion("ORDERNAME between", value1, value2, "ordername");
            return (Criteria) this;
        }

        public Criteria andOrdernameNotBetween(String value1, String value2) {
            addCriterion("ORDERNAME not between", value1, value2, "ordername");
            return (Criteria) this;
        }

        public Criteria andSubmittimeIsNull() {
            addCriterion("SUBMITTIME is null");
            return (Criteria) this;
        }

        public Criteria andSubmittimeIsNotNull() {
            addCriterion("SUBMITTIME is not null");
            return (Criteria) this;
        }

        public Criteria andSubmittimeEqualTo(Date value) {
            addCriterion("SUBMITTIME =", value, "submittime");
            return (Criteria) this;
        }

        public Criteria andSubmittimeNotEqualTo(Date value) {
            addCriterion("SUBMITTIME <>", value, "submittime");
            return (Criteria) this;
        }

        public Criteria andSubmittimeGreaterThan(Date value) {
            addCriterion("SUBMITTIME >", value, "submittime");
            return (Criteria) this;
        }

        public Criteria andSubmittimeGreaterThanOrEqualTo(Date value) {
            addCriterion("SUBMITTIME >=", value, "submittime");
            return (Criteria) this;
        }

        public Criteria andSubmittimeLessThan(Date value) {
            addCriterion("SUBMITTIME <", value, "submittime");
            return (Criteria) this;
        }

        public Criteria andSubmittimeLessThanOrEqualTo(Date value) {
            addCriterion("SUBMITTIME <=", value, "submittime");
            return (Criteria) this;
        }

        public Criteria andSubmittimeIn(List<Date> values) {
            addCriterion("SUBMITTIME in", values, "submittime");
            return (Criteria) this;
        }

        public Criteria andSubmittimeNotIn(List<Date> values) {
            addCriterion("SUBMITTIME not in", values, "submittime");
            return (Criteria) this;
        }

        public Criteria andSubmittimeBetween(Date value1, Date value2) {
            addCriterion("SUBMITTIME between", value1, value2, "submittime");
            return (Criteria) this;
        }

        public Criteria andSubmittimeNotBetween(Date value1, Date value2) {
            addCriterion("SUBMITTIME not between", value1, value2, "submittime");
            return (Criteria) this;
        }

        public Criteria andFilingidIsNull() {
            addCriterion("FILINGID is null");
            return (Criteria) this;
        }

        public Criteria andFilingidIsNotNull() {
            addCriterion("FILINGID is not null");
            return (Criteria) this;
        }

        public Criteria andFilingidEqualTo(String value) {
            addCriterion("FILINGID =", value, "filingid");
            return (Criteria) this;
        }

        public Criteria andFilingidNotEqualTo(String value) {
            addCriterion("FILINGID <>", value, "filingid");
            return (Criteria) this;
        }

        public Criteria andFilingidGreaterThan(String value) {
            addCriterion("FILINGID >", value, "filingid");
            return (Criteria) this;
        }

        public Criteria andFilingidGreaterThanOrEqualTo(String value) {
            addCriterion("FILINGID >=", value, "filingid");
            return (Criteria) this;
        }

        public Criteria andFilingidLessThan(String value) {
            addCriterion("FILINGID <", value, "filingid");
            return (Criteria) this;
        }

        public Criteria andFilingidLessThanOrEqualTo(String value) {
            addCriterion("FILINGID <=", value, "filingid");
            return (Criteria) this;
        }

        public Criteria andFilingidLike(String value) {
            addCriterion("FILINGID like", value, "filingid");
            return (Criteria) this;
        }

        public Criteria andFilingidNotLike(String value) {
            addCriterion("FILINGID not like", value, "filingid");
            return (Criteria) this;
        }

        public Criteria andFilingidIn(List<String> values) {
            addCriterion("FILINGID in", values, "filingid");
            return (Criteria) this;
        }

        public Criteria andFilingidNotIn(List<String> values) {
            addCriterion("FILINGID not in", values, "filingid");
            return (Criteria) this;
        }

        public Criteria andFilingidBetween(String value1, String value2) {
            addCriterion("FILINGID between", value1, value2, "filingid");
            return (Criteria) this;
        }

        public Criteria andFilingidNotBetween(String value1, String value2) {
            addCriterion("FILINGID not between", value1, value2, "filingid");
            return (Criteria) this;
        }

        public Criteria andCompanyidpsIsNull() {
            addCriterion("COMPANYIDPS is null");
            return (Criteria) this;
        }

        public Criteria andCompanyidpsIsNotNull() {
            addCriterion("COMPANYIDPS is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyidpsEqualTo(String value) {
            addCriterion("COMPANYIDPS =", value, "companyidps");
            return (Criteria) this;
        }

        public Criteria andCompanyidpsNotEqualTo(String value) {
            addCriterion("COMPANYIDPS <>", value, "companyidps");
            return (Criteria) this;
        }

        public Criteria andCompanyidpsGreaterThan(String value) {
            addCriterion("COMPANYIDPS >", value, "companyidps");
            return (Criteria) this;
        }

        public Criteria andCompanyidpsGreaterThanOrEqualTo(String value) {
            addCriterion("COMPANYIDPS >=", value, "companyidps");
            return (Criteria) this;
        }

        public Criteria andCompanyidpsLessThan(String value) {
            addCriterion("COMPANYIDPS <", value, "companyidps");
            return (Criteria) this;
        }

        public Criteria andCompanyidpsLessThanOrEqualTo(String value) {
            addCriterion("COMPANYIDPS <=", value, "companyidps");
            return (Criteria) this;
        }

        public Criteria andCompanyidpsLike(String value) {
            addCriterion("COMPANYIDPS like", value, "companyidps");
            return (Criteria) this;
        }

        public Criteria andCompanyidpsNotLike(String value) {
            addCriterion("COMPANYIDPS not like", value, "companyidps");
            return (Criteria) this;
        }

        public Criteria andCompanyidpsIn(List<String> values) {
            addCriterion("COMPANYIDPS in", values, "companyidps");
            return (Criteria) this;
        }

        public Criteria andCompanyidpsNotIn(List<String> values) {
            addCriterion("COMPANYIDPS not in", values, "companyidps");
            return (Criteria) this;
        }

        public Criteria andCompanyidpsBetween(String value1, String value2) {
            addCriterion("COMPANYIDPS between", value1, value2, "companyidps");
            return (Criteria) this;
        }

        public Criteria andCompanyidpsNotBetween(String value1, String value2) {
            addCriterion("COMPANYIDPS not between", value1, value2, "companyidps");
            return (Criteria) this;
        }

        public Criteria andCompanynamepsIsNull() {
            addCriterion("COMPANYNAMEPS is null");
            return (Criteria) this;
        }

        public Criteria andCompanynamepsIsNotNull() {
            addCriterion("COMPANYNAMEPS is not null");
            return (Criteria) this;
        }

        public Criteria andCompanynamepsEqualTo(String value) {
            addCriterion("COMPANYNAMEPS =", value, "companynameps");
            return (Criteria) this;
        }

        public Criteria andCompanynamepsNotEqualTo(String value) {
            addCriterion("COMPANYNAMEPS <>", value, "companynameps");
            return (Criteria) this;
        }

        public Criteria andCompanynamepsGreaterThan(String value) {
            addCriterion("COMPANYNAMEPS >", value, "companynameps");
            return (Criteria) this;
        }

        public Criteria andCompanynamepsGreaterThanOrEqualTo(String value) {
            addCriterion("COMPANYNAMEPS >=", value, "companynameps");
            return (Criteria) this;
        }

        public Criteria andCompanynamepsLessThan(String value) {
            addCriterion("COMPANYNAMEPS <", value, "companynameps");
            return (Criteria) this;
        }

        public Criteria andCompanynamepsLessThanOrEqualTo(String value) {
            addCriterion("COMPANYNAMEPS <=", value, "companynameps");
            return (Criteria) this;
        }

        public Criteria andCompanynamepsLike(String value) {
            addCriterion("COMPANYNAMEPS like", value, "companynameps");
            return (Criteria) this;
        }

        public Criteria andCompanynamepsNotLike(String value) {
            addCriterion("COMPANYNAMEPS not like", value, "companynameps");
            return (Criteria) this;
        }

        public Criteria andCompanynamepsIn(List<String> values) {
            addCriterion("COMPANYNAMEPS in", values, "companynameps");
            return (Criteria) this;
        }

        public Criteria andCompanynamepsNotIn(List<String> values) {
            addCriterion("COMPANYNAMEPS not in", values, "companynameps");
            return (Criteria) this;
        }

        public Criteria andCompanynamepsBetween(String value1, String value2) {
            addCriterion("COMPANYNAMEPS between", value1, value2, "companynameps");
            return (Criteria) this;
        }

        public Criteria andCompanynamepsNotBetween(String value1, String value2) {
            addCriterion("COMPANYNAMEPS not between", value1, value2, "companynameps");
            return (Criteria) this;
        }

        public Criteria andPurchasepriceIsNull() {
            addCriterion("PURCHASEPRICE is null");
            return (Criteria) this;
        }

        public Criteria andPurchasepriceIsNotNull() {
            addCriterion("PURCHASEPRICE is not null");
            return (Criteria) this;
        }

        public Criteria andPurchasepriceEqualTo(Short value) {
            addCriterion("PURCHASEPRICE =", value, "purchaseprice");
            return (Criteria) this;
        }

        public Criteria andPurchasepriceNotEqualTo(Short value) {
            addCriterion("PURCHASEPRICE <>", value, "purchaseprice");
            return (Criteria) this;
        }

        public Criteria andPurchasepriceGreaterThan(Short value) {
            addCriterion("PURCHASEPRICE >", value, "purchaseprice");
            return (Criteria) this;
        }

        public Criteria andPurchasepriceGreaterThanOrEqualTo(Short value) {
            addCriterion("PURCHASEPRICE >=", value, "purchaseprice");
            return (Criteria) this;
        }

        public Criteria andPurchasepriceLessThan(Short value) {
            addCriterion("PURCHASEPRICE <", value, "purchaseprice");
            return (Criteria) this;
        }

        public Criteria andPurchasepriceLessThanOrEqualTo(Short value) {
            addCriterion("PURCHASEPRICE <=", value, "purchaseprice");
            return (Criteria) this;
        }

        public Criteria andPurchasepriceIn(List<Short> values) {
            addCriterion("PURCHASEPRICE in", values, "purchaseprice");
            return (Criteria) this;
        }

        public Criteria andPurchasepriceNotIn(List<Short> values) {
            addCriterion("PURCHASEPRICE not in", values, "purchaseprice");
            return (Criteria) this;
        }

        public Criteria andPurchasepriceBetween(Short value1, Short value2) {
            addCriterion("PURCHASEPRICE between", value1, value2, "purchaseprice");
            return (Criteria) this;
        }

        public Criteria andPurchasepriceNotBetween(Short value1, Short value2) {
            addCriterion("PURCHASEPRICE not between", value1, value2, "purchaseprice");
            return (Criteria) this;
        }

        public Criteria andPurchasecountIsNull() {
            addCriterion("PURCHASECOUNT is null");
            return (Criteria) this;
        }

        public Criteria andPurchasecountIsNotNull() {
            addCriterion("PURCHASECOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andPurchasecountEqualTo(Short value) {
            addCriterion("PURCHASECOUNT =", value, "purchasecount");
            return (Criteria) this;
        }

        public Criteria andPurchasecountNotEqualTo(Short value) {
            addCriterion("PURCHASECOUNT <>", value, "purchasecount");
            return (Criteria) this;
        }

        public Criteria andPurchasecountGreaterThan(Short value) {
            addCriterion("PURCHASECOUNT >", value, "purchasecount");
            return (Criteria) this;
        }

        public Criteria andPurchasecountGreaterThanOrEqualTo(Short value) {
            addCriterion("PURCHASECOUNT >=", value, "purchasecount");
            return (Criteria) this;
        }

        public Criteria andPurchasecountLessThan(Short value) {
            addCriterion("PURCHASECOUNT <", value, "purchasecount");
            return (Criteria) this;
        }

        public Criteria andPurchasecountLessThanOrEqualTo(Short value) {
            addCriterion("PURCHASECOUNT <=", value, "purchasecount");
            return (Criteria) this;
        }

        public Criteria andPurchasecountIn(List<Short> values) {
            addCriterion("PURCHASECOUNT in", values, "purchasecount");
            return (Criteria) this;
        }

        public Criteria andPurchasecountNotIn(List<Short> values) {
            addCriterion("PURCHASECOUNT not in", values, "purchasecount");
            return (Criteria) this;
        }

        public Criteria andPurchasecountBetween(Short value1, Short value2) {
            addCriterion("PURCHASECOUNT between", value1, value2, "purchasecount");
            return (Criteria) this;
        }

        public Criteria andPurchasecountNotBetween(Short value1, Short value2) {
            addCriterion("PURCHASECOUNT not between", value1, value2, "purchasecount");
            return (Criteria) this;
        }

        public Criteria andPurchaseamountIsNull() {
            addCriterion("PURCHASEAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseamountIsNotNull() {
            addCriterion("PURCHASEAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseamountEqualTo(Short value) {
            addCriterion("PURCHASEAMOUNT =", value, "purchaseamount");
            return (Criteria) this;
        }

        public Criteria andPurchaseamountNotEqualTo(Short value) {
            addCriterion("PURCHASEAMOUNT <>", value, "purchaseamount");
            return (Criteria) this;
        }

        public Criteria andPurchaseamountGreaterThan(Short value) {
            addCriterion("PURCHASEAMOUNT >", value, "purchaseamount");
            return (Criteria) this;
        }

        public Criteria andPurchaseamountGreaterThanOrEqualTo(Short value) {
            addCriterion("PURCHASEAMOUNT >=", value, "purchaseamount");
            return (Criteria) this;
        }

        public Criteria andPurchaseamountLessThan(Short value) {
            addCriterion("PURCHASEAMOUNT <", value, "purchaseamount");
            return (Criteria) this;
        }

        public Criteria andPurchaseamountLessThanOrEqualTo(Short value) {
            addCriterion("PURCHASEAMOUNT <=", value, "purchaseamount");
            return (Criteria) this;
        }

        public Criteria andPurchaseamountIn(List<Short> values) {
            addCriterion("PURCHASEAMOUNT in", values, "purchaseamount");
            return (Criteria) this;
        }

        public Criteria andPurchaseamountNotIn(List<Short> values) {
            addCriterion("PURCHASEAMOUNT not in", values, "purchaseamount");
            return (Criteria) this;
        }

        public Criteria andPurchaseamountBetween(Short value1, Short value2) {
            addCriterion("PURCHASEAMOUNT between", value1, value2, "purchaseamount");
            return (Criteria) this;
        }

        public Criteria andPurchaseamountNotBetween(Short value1, Short value2) {
            addCriterion("PURCHASEAMOUNT not between", value1, value2, "purchaseamount");
            return (Criteria) this;
        }

        public Criteria andIsreadIsNull() {
            addCriterion("ISREAD is null");
            return (Criteria) this;
        }

        public Criteria andIsreadIsNotNull() {
            addCriterion("ISREAD is not null");
            return (Criteria) this;
        }

        public Criteria andIsreadEqualTo(String value) {
            addCriterion("ISREAD =", value, "isread");
            return (Criteria) this;
        }

        public Criteria andIsreadNotEqualTo(String value) {
            addCriterion("ISREAD <>", value, "isread");
            return (Criteria) this;
        }

        public Criteria andIsreadGreaterThan(String value) {
            addCriterion("ISREAD >", value, "isread");
            return (Criteria) this;
        }

        public Criteria andIsreadGreaterThanOrEqualTo(String value) {
            addCriterion("ISREAD >=", value, "isread");
            return (Criteria) this;
        }

        public Criteria andIsreadLessThan(String value) {
            addCriterion("ISREAD <", value, "isread");
            return (Criteria) this;
        }

        public Criteria andIsreadLessThanOrEqualTo(String value) {
            addCriterion("ISREAD <=", value, "isread");
            return (Criteria) this;
        }

        public Criteria andIsreadLike(String value) {
            addCriterion("ISREAD like", value, "isread");
            return (Criteria) this;
        }

        public Criteria andIsreadNotLike(String value) {
            addCriterion("ISREAD not like", value, "isread");
            return (Criteria) this;
        }

        public Criteria andIsreadIn(List<String> values) {
            addCriterion("ISREAD in", values, "isread");
            return (Criteria) this;
        }

        public Criteria andIsreadNotIn(List<String> values) {
            addCriterion("ISREAD not in", values, "isread");
            return (Criteria) this;
        }

        public Criteria andIsreadBetween(String value1, String value2) {
            addCriterion("ISREAD between", value1, value2, "isread");
            return (Criteria) this;
        }

        public Criteria andIsreadNotBetween(String value1, String value2) {
            addCriterion("ISREAD not between", value1, value2, "isread");
            return (Criteria) this;
        }

        public Criteria andReaduseridIsNull() {
            addCriterion("READUSERID is null");
            return (Criteria) this;
        }

        public Criteria andReaduseridIsNotNull() {
            addCriterion("READUSERID is not null");
            return (Criteria) this;
        }

        public Criteria andReaduseridEqualTo(String value) {
            addCriterion("READUSERID =", value, "readuserid");
            return (Criteria) this;
        }

        public Criteria andReaduseridNotEqualTo(String value) {
            addCriterion("READUSERID <>", value, "readuserid");
            return (Criteria) this;
        }

        public Criteria andReaduseridGreaterThan(String value) {
            addCriterion("READUSERID >", value, "readuserid");
            return (Criteria) this;
        }

        public Criteria andReaduseridGreaterThanOrEqualTo(String value) {
            addCriterion("READUSERID >=", value, "readuserid");
            return (Criteria) this;
        }

        public Criteria andReaduseridLessThan(String value) {
            addCriterion("READUSERID <", value, "readuserid");
            return (Criteria) this;
        }

        public Criteria andReaduseridLessThanOrEqualTo(String value) {
            addCriterion("READUSERID <=", value, "readuserid");
            return (Criteria) this;
        }

        public Criteria andReaduseridLike(String value) {
            addCriterion("READUSERID like", value, "readuserid");
            return (Criteria) this;
        }

        public Criteria andReaduseridNotLike(String value) {
            addCriterion("READUSERID not like", value, "readuserid");
            return (Criteria) this;
        }

        public Criteria andReaduseridIn(List<String> values) {
            addCriterion("READUSERID in", values, "readuserid");
            return (Criteria) this;
        }

        public Criteria andReaduseridNotIn(List<String> values) {
            addCriterion("READUSERID not in", values, "readuserid");
            return (Criteria) this;
        }

        public Criteria andReaduseridBetween(String value1, String value2) {
            addCriterion("READUSERID between", value1, value2, "readuserid");
            return (Criteria) this;
        }

        public Criteria andReaduseridNotBetween(String value1, String value2) {
            addCriterion("READUSERID not between", value1, value2, "readuserid");
            return (Criteria) this;
        }

        public Criteria andReadusernameIsNull() {
            addCriterion("READUSERNAME is null");
            return (Criteria) this;
        }

        public Criteria andReadusernameIsNotNull() {
            addCriterion("READUSERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andReadusernameEqualTo(String value) {
            addCriterion("READUSERNAME =", value, "readusername");
            return (Criteria) this;
        }

        public Criteria andReadusernameNotEqualTo(String value) {
            addCriterion("READUSERNAME <>", value, "readusername");
            return (Criteria) this;
        }

        public Criteria andReadusernameGreaterThan(String value) {
            addCriterion("READUSERNAME >", value, "readusername");
            return (Criteria) this;
        }

        public Criteria andReadusernameGreaterThanOrEqualTo(String value) {
            addCriterion("READUSERNAME >=", value, "readusername");
            return (Criteria) this;
        }

        public Criteria andReadusernameLessThan(String value) {
            addCriterion("READUSERNAME <", value, "readusername");
            return (Criteria) this;
        }

        public Criteria andReadusernameLessThanOrEqualTo(String value) {
            addCriterion("READUSERNAME <=", value, "readusername");
            return (Criteria) this;
        }

        public Criteria andReadusernameLike(String value) {
            addCriterion("READUSERNAME like", value, "readusername");
            return (Criteria) this;
        }

        public Criteria andReadusernameNotLike(String value) {
            addCriterion("READUSERNAME not like", value, "readusername");
            return (Criteria) this;
        }

        public Criteria andReadusernameIn(List<String> values) {
            addCriterion("READUSERNAME in", values, "readusername");
            return (Criteria) this;
        }

        public Criteria andReadusernameNotIn(List<String> values) {
            addCriterion("READUSERNAME not in", values, "readusername");
            return (Criteria) this;
        }

        public Criteria andReadusernameBetween(String value1, String value2) {
            addCriterion("READUSERNAME between", value1, value2, "readusername");
            return (Criteria) this;
        }

        public Criteria andReadusernameNotBetween(String value1, String value2) {
            addCriterion("READUSERNAME not between", value1, value2, "readusername");
            return (Criteria) this;
        }

        public Criteria andReadtimeIsNull() {
            addCriterion("READTIME is null");
            return (Criteria) this;
        }

        public Criteria andReadtimeIsNotNull() {
            addCriterion("READTIME is not null");
            return (Criteria) this;
        }

        public Criteria andReadtimeEqualTo(String value) {
            addCriterion("READTIME =", value, "readtime");
            return (Criteria) this;
        }

        public Criteria andReadtimeNotEqualTo(String value) {
            addCriterion("READTIME <>", value, "readtime");
            return (Criteria) this;
        }

        public Criteria andReadtimeGreaterThan(String value) {
            addCriterion("READTIME >", value, "readtime");
            return (Criteria) this;
        }

        public Criteria andReadtimeGreaterThanOrEqualTo(String value) {
            addCriterion("READTIME >=", value, "readtime");
            return (Criteria) this;
        }

        public Criteria andReadtimeLessThan(String value) {
            addCriterion("READTIME <", value, "readtime");
            return (Criteria) this;
        }

        public Criteria andReadtimeLessThanOrEqualTo(String value) {
            addCriterion("READTIME <=", value, "readtime");
            return (Criteria) this;
        }

        public Criteria andReadtimeLike(String value) {
            addCriterion("READTIME like", value, "readtime");
            return (Criteria) this;
        }

        public Criteria andReadtimeNotLike(String value) {
            addCriterion("READTIME not like", value, "readtime");
            return (Criteria) this;
        }

        public Criteria andReadtimeIn(List<String> values) {
            addCriterion("READTIME in", values, "readtime");
            return (Criteria) this;
        }

        public Criteria andReadtimeNotIn(List<String> values) {
            addCriterion("READTIME not in", values, "readtime");
            return (Criteria) this;
        }

        public Criteria andReadtimeBetween(String value1, String value2) {
            addCriterion("READTIME between", value1, value2, "readtime");
            return (Criteria) this;
        }

        public Criteria andReadtimeNotBetween(String value1, String value2) {
            addCriterion("READTIME not between", value1, value2, "readtime");
            return (Criteria) this;
        }

        public Criteria andConfirmuseridIsNull() {
            addCriterion("CONFIRMUSERID is null");
            return (Criteria) this;
        }

        public Criteria andConfirmuseridIsNotNull() {
            addCriterion("CONFIRMUSERID is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmuseridEqualTo(String value) {
            addCriterion("CONFIRMUSERID =", value, "confirmuserid");
            return (Criteria) this;
        }

        public Criteria andConfirmuseridNotEqualTo(String value) {
            addCriterion("CONFIRMUSERID <>", value, "confirmuserid");
            return (Criteria) this;
        }

        public Criteria andConfirmuseridGreaterThan(String value) {
            addCriterion("CONFIRMUSERID >", value, "confirmuserid");
            return (Criteria) this;
        }

        public Criteria andConfirmuseridGreaterThanOrEqualTo(String value) {
            addCriterion("CONFIRMUSERID >=", value, "confirmuserid");
            return (Criteria) this;
        }

        public Criteria andConfirmuseridLessThan(String value) {
            addCriterion("CONFIRMUSERID <", value, "confirmuserid");
            return (Criteria) this;
        }

        public Criteria andConfirmuseridLessThanOrEqualTo(String value) {
            addCriterion("CONFIRMUSERID <=", value, "confirmuserid");
            return (Criteria) this;
        }

        public Criteria andConfirmuseridLike(String value) {
            addCriterion("CONFIRMUSERID like", value, "confirmuserid");
            return (Criteria) this;
        }

        public Criteria andConfirmuseridNotLike(String value) {
            addCriterion("CONFIRMUSERID not like", value, "confirmuserid");
            return (Criteria) this;
        }

        public Criteria andConfirmuseridIn(List<String> values) {
            addCriterion("CONFIRMUSERID in", values, "confirmuserid");
            return (Criteria) this;
        }

        public Criteria andConfirmuseridNotIn(List<String> values) {
            addCriterion("CONFIRMUSERID not in", values, "confirmuserid");
            return (Criteria) this;
        }

        public Criteria andConfirmuseridBetween(String value1, String value2) {
            addCriterion("CONFIRMUSERID between", value1, value2, "confirmuserid");
            return (Criteria) this;
        }

        public Criteria andConfirmuseridNotBetween(String value1, String value2) {
            addCriterion("CONFIRMUSERID not between", value1, value2, "confirmuserid");
            return (Criteria) this;
        }

        public Criteria andConfirmusernameIsNull() {
            addCriterion("CONFIRMUSERNAME is null");
            return (Criteria) this;
        }

        public Criteria andConfirmusernameIsNotNull() {
            addCriterion("CONFIRMUSERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmusernameEqualTo(String value) {
            addCriterion("CONFIRMUSERNAME =", value, "confirmusername");
            return (Criteria) this;
        }

        public Criteria andConfirmusernameNotEqualTo(String value) {
            addCriterion("CONFIRMUSERNAME <>", value, "confirmusername");
            return (Criteria) this;
        }

        public Criteria andConfirmusernameGreaterThan(String value) {
            addCriterion("CONFIRMUSERNAME >", value, "confirmusername");
            return (Criteria) this;
        }

        public Criteria andConfirmusernameGreaterThanOrEqualTo(String value) {
            addCriterion("CONFIRMUSERNAME >=", value, "confirmusername");
            return (Criteria) this;
        }

        public Criteria andConfirmusernameLessThan(String value) {
            addCriterion("CONFIRMUSERNAME <", value, "confirmusername");
            return (Criteria) this;
        }

        public Criteria andConfirmusernameLessThanOrEqualTo(String value) {
            addCriterion("CONFIRMUSERNAME <=", value, "confirmusername");
            return (Criteria) this;
        }

        public Criteria andConfirmusernameLike(String value) {
            addCriterion("CONFIRMUSERNAME like", value, "confirmusername");
            return (Criteria) this;
        }

        public Criteria andConfirmusernameNotLike(String value) {
            addCriterion("CONFIRMUSERNAME not like", value, "confirmusername");
            return (Criteria) this;
        }

        public Criteria andConfirmusernameIn(List<String> values) {
            addCriterion("CONFIRMUSERNAME in", values, "confirmusername");
            return (Criteria) this;
        }

        public Criteria andConfirmusernameNotIn(List<String> values) {
            addCriterion("CONFIRMUSERNAME not in", values, "confirmusername");
            return (Criteria) this;
        }

        public Criteria andConfirmusernameBetween(String value1, String value2) {
            addCriterion("CONFIRMUSERNAME between", value1, value2, "confirmusername");
            return (Criteria) this;
        }

        public Criteria andConfirmusernameNotBetween(String value1, String value2) {
            addCriterion("CONFIRMUSERNAME not between", value1, value2, "confirmusername");
            return (Criteria) this;
        }

        public Criteria andConfirmtimeIsNull() {
            addCriterion("CONFIRMTIME is null");
            return (Criteria) this;
        }

        public Criteria andConfirmtimeIsNotNull() {
            addCriterion("CONFIRMTIME is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmtimeEqualTo(String value) {
            addCriterion("CONFIRMTIME =", value, "confirmtime");
            return (Criteria) this;
        }

        public Criteria andConfirmtimeNotEqualTo(String value) {
            addCriterion("CONFIRMTIME <>", value, "confirmtime");
            return (Criteria) this;
        }

        public Criteria andConfirmtimeGreaterThan(String value) {
            addCriterion("CONFIRMTIME >", value, "confirmtime");
            return (Criteria) this;
        }

        public Criteria andConfirmtimeGreaterThanOrEqualTo(String value) {
            addCriterion("CONFIRMTIME >=", value, "confirmtime");
            return (Criteria) this;
        }

        public Criteria andConfirmtimeLessThan(String value) {
            addCriterion("CONFIRMTIME <", value, "confirmtime");
            return (Criteria) this;
        }

        public Criteria andConfirmtimeLessThanOrEqualTo(String value) {
            addCriterion("CONFIRMTIME <=", value, "confirmtime");
            return (Criteria) this;
        }

        public Criteria andConfirmtimeLike(String value) {
            addCriterion("CONFIRMTIME like", value, "confirmtime");
            return (Criteria) this;
        }

        public Criteria andConfirmtimeNotLike(String value) {
            addCriterion("CONFIRMTIME not like", value, "confirmtime");
            return (Criteria) this;
        }

        public Criteria andConfirmtimeIn(List<String> values) {
            addCriterion("CONFIRMTIME in", values, "confirmtime");
            return (Criteria) this;
        }

        public Criteria andConfirmtimeNotIn(List<String> values) {
            addCriterion("CONFIRMTIME not in", values, "confirmtime");
            return (Criteria) this;
        }

        public Criteria andConfirmtimeBetween(String value1, String value2) {
            addCriterion("CONFIRMTIME between", value1, value2, "confirmtime");
            return (Criteria) this;
        }

        public Criteria andConfirmtimeNotBetween(String value1, String value2) {
            addCriterion("CONFIRMTIME not between", value1, value2, "confirmtime");
            return (Criteria) this;
        }

        public Criteria andOrderdetailstateIsNull() {
            addCriterion("ORDERDETAILSTATE is null");
            return (Criteria) this;
        }

        public Criteria andOrderdetailstateIsNotNull() {
            addCriterion("ORDERDETAILSTATE is not null");
            return (Criteria) this;
        }

        public Criteria andOrderdetailstateEqualTo(String value) {
            addCriterion("ORDERDETAILSTATE =", value, "orderdetailstate");
            return (Criteria) this;
        }

        public Criteria andOrderdetailstateNotEqualTo(String value) {
            addCriterion("ORDERDETAILSTATE <>", value, "orderdetailstate");
            return (Criteria) this;
        }

        public Criteria andOrderdetailstateGreaterThan(String value) {
            addCriterion("ORDERDETAILSTATE >", value, "orderdetailstate");
            return (Criteria) this;
        }

        public Criteria andOrderdetailstateGreaterThanOrEqualTo(String value) {
            addCriterion("ORDERDETAILSTATE >=", value, "orderdetailstate");
            return (Criteria) this;
        }

        public Criteria andOrderdetailstateLessThan(String value) {
            addCriterion("ORDERDETAILSTATE <", value, "orderdetailstate");
            return (Criteria) this;
        }

        public Criteria andOrderdetailstateLessThanOrEqualTo(String value) {
            addCriterion("ORDERDETAILSTATE <=", value, "orderdetailstate");
            return (Criteria) this;
        }

        public Criteria andOrderdetailstateLike(String value) {
            addCriterion("ORDERDETAILSTATE like", value, "orderdetailstate");
            return (Criteria) this;
        }

        public Criteria andOrderdetailstateNotLike(String value) {
            addCriterion("ORDERDETAILSTATE not like", value, "orderdetailstate");
            return (Criteria) this;
        }

        public Criteria andOrderdetailstateIn(List<String> values) {
            addCriterion("ORDERDETAILSTATE in", values, "orderdetailstate");
            return (Criteria) this;
        }

        public Criteria andOrderdetailstateNotIn(List<String> values) {
            addCriterion("ORDERDETAILSTATE not in", values, "orderdetailstate");
            return (Criteria) this;
        }

        public Criteria andOrderdetailstateBetween(String value1, String value2) {
            addCriterion("ORDERDETAILSTATE between", value1, value2, "orderdetailstate");
            return (Criteria) this;
        }

        public Criteria andOrderdetailstateNotBetween(String value1, String value2) {
            addCriterion("ORDERDETAILSTATE not between", value1, value2, "orderdetailstate");
            return (Criteria) this;
        }

        public Criteria andRefusereasonIsNull() {
            addCriterion("REFUSEREASON is null");
            return (Criteria) this;
        }

        public Criteria andRefusereasonIsNotNull() {
            addCriterion("REFUSEREASON is not null");
            return (Criteria) this;
        }

        public Criteria andRefusereasonEqualTo(String value) {
            addCriterion("REFUSEREASON =", value, "refusereason");
            return (Criteria) this;
        }

        public Criteria andRefusereasonNotEqualTo(String value) {
            addCriterion("REFUSEREASON <>", value, "refusereason");
            return (Criteria) this;
        }

        public Criteria andRefusereasonGreaterThan(String value) {
            addCriterion("REFUSEREASON >", value, "refusereason");
            return (Criteria) this;
        }

        public Criteria andRefusereasonGreaterThanOrEqualTo(String value) {
            addCriterion("REFUSEREASON >=", value, "refusereason");
            return (Criteria) this;
        }

        public Criteria andRefusereasonLessThan(String value) {
            addCriterion("REFUSEREASON <", value, "refusereason");
            return (Criteria) this;
        }

        public Criteria andRefusereasonLessThanOrEqualTo(String value) {
            addCriterion("REFUSEREASON <=", value, "refusereason");
            return (Criteria) this;
        }

        public Criteria andRefusereasonLike(String value) {
            addCriterion("REFUSEREASON like", value, "refusereason");
            return (Criteria) this;
        }

        public Criteria andRefusereasonNotLike(String value) {
            addCriterion("REFUSEREASON not like", value, "refusereason");
            return (Criteria) this;
        }

        public Criteria andRefusereasonIn(List<String> values) {
            addCriterion("REFUSEREASON in", values, "refusereason");
            return (Criteria) this;
        }

        public Criteria andRefusereasonNotIn(List<String> values) {
            addCriterion("REFUSEREASON not in", values, "refusereason");
            return (Criteria) this;
        }

        public Criteria andRefusereasonBetween(String value1, String value2) {
            addCriterion("REFUSEREASON between", value1, value2, "refusereason");
            return (Criteria) this;
        }

        public Criteria andRefusereasonNotBetween(String value1, String value2) {
            addCriterion("REFUSEREASON not between", value1, value2, "refusereason");
            return (Criteria) this;
        }

        public Criteria andDetaildistributeaddressIsNull() {
            addCriterion("DETAILDISTRIBUTEADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andDetaildistributeaddressIsNotNull() {
            addCriterion("DETAILDISTRIBUTEADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andDetaildistributeaddressEqualTo(String value) {
            addCriterion("DETAILDISTRIBUTEADDRESS =", value, "detaildistributeaddress");
            return (Criteria) this;
        }

        public Criteria andDetaildistributeaddressNotEqualTo(String value) {
            addCriterion("DETAILDISTRIBUTEADDRESS <>", value, "detaildistributeaddress");
            return (Criteria) this;
        }

        public Criteria andDetaildistributeaddressGreaterThan(String value) {
            addCriterion("DETAILDISTRIBUTEADDRESS >", value, "detaildistributeaddress");
            return (Criteria) this;
        }

        public Criteria andDetaildistributeaddressGreaterThanOrEqualTo(String value) {
            addCriterion("DETAILDISTRIBUTEADDRESS >=", value, "detaildistributeaddress");
            return (Criteria) this;
        }

        public Criteria andDetaildistributeaddressLessThan(String value) {
            addCriterion("DETAILDISTRIBUTEADDRESS <", value, "detaildistributeaddress");
            return (Criteria) this;
        }

        public Criteria andDetaildistributeaddressLessThanOrEqualTo(String value) {
            addCriterion("DETAILDISTRIBUTEADDRESS <=", value, "detaildistributeaddress");
            return (Criteria) this;
        }

        public Criteria andDetaildistributeaddressLike(String value) {
            addCriterion("DETAILDISTRIBUTEADDRESS like", value, "detaildistributeaddress");
            return (Criteria) this;
        }

        public Criteria andDetaildistributeaddressNotLike(String value) {
            addCriterion("DETAILDISTRIBUTEADDRESS not like", value, "detaildistributeaddress");
            return (Criteria) this;
        }

        public Criteria andDetaildistributeaddressIn(List<String> values) {
            addCriterion("DETAILDISTRIBUTEADDRESS in", values, "detaildistributeaddress");
            return (Criteria) this;
        }

        public Criteria andDetaildistributeaddressNotIn(List<String> values) {
            addCriterion("DETAILDISTRIBUTEADDRESS not in", values, "detaildistributeaddress");
            return (Criteria) this;
        }

        public Criteria andDetaildistributeaddressBetween(String value1, String value2) {
            addCriterion("DETAILDISTRIBUTEADDRESS between", value1, value2, "detaildistributeaddress");
            return (Criteria) this;
        }

        public Criteria andDetaildistributeaddressNotBetween(String value1, String value2) {
            addCriterion("DETAILDISTRIBUTEADDRESS not between", value1, value2, "detaildistributeaddress");
            return (Criteria) this;
        }

        public Criteria andTotaldistributecountIsNull() {
            addCriterion("TOTALDISTRIBUTECOUNT is null");
            return (Criteria) this;
        }

        public Criteria andTotaldistributecountIsNotNull() {
            addCriterion("TOTALDISTRIBUTECOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andTotaldistributecountEqualTo(String value) {
            addCriterion("TOTALDISTRIBUTECOUNT =", value, "totaldistributecount");
            return (Criteria) this;
        }

        public Criteria andTotaldistributecountNotEqualTo(String value) {
            addCriterion("TOTALDISTRIBUTECOUNT <>", value, "totaldistributecount");
            return (Criteria) this;
        }

        public Criteria andTotaldistributecountGreaterThan(String value) {
            addCriterion("TOTALDISTRIBUTECOUNT >", value, "totaldistributecount");
            return (Criteria) this;
        }

        public Criteria andTotaldistributecountGreaterThanOrEqualTo(String value) {
            addCriterion("TOTALDISTRIBUTECOUNT >=", value, "totaldistributecount");
            return (Criteria) this;
        }

        public Criteria andTotaldistributecountLessThan(String value) {
            addCriterion("TOTALDISTRIBUTECOUNT <", value, "totaldistributecount");
            return (Criteria) this;
        }

        public Criteria andTotaldistributecountLessThanOrEqualTo(String value) {
            addCriterion("TOTALDISTRIBUTECOUNT <=", value, "totaldistributecount");
            return (Criteria) this;
        }

        public Criteria andTotaldistributecountLike(String value) {
            addCriterion("TOTALDISTRIBUTECOUNT like", value, "totaldistributecount");
            return (Criteria) this;
        }

        public Criteria andTotaldistributecountNotLike(String value) {
            addCriterion("TOTALDISTRIBUTECOUNT not like", value, "totaldistributecount");
            return (Criteria) this;
        }

        public Criteria andTotaldistributecountIn(List<String> values) {
            addCriterion("TOTALDISTRIBUTECOUNT in", values, "totaldistributecount");
            return (Criteria) this;
        }

        public Criteria andTotaldistributecountNotIn(List<String> values) {
            addCriterion("TOTALDISTRIBUTECOUNT not in", values, "totaldistributecount");
            return (Criteria) this;
        }

        public Criteria andTotaldistributecountBetween(String value1, String value2) {
            addCriterion("TOTALDISTRIBUTECOUNT between", value1, value2, "totaldistributecount");
            return (Criteria) this;
        }

        public Criteria andTotaldistributecountNotBetween(String value1, String value2) {
            addCriterion("TOTALDISTRIBUTECOUNT not between", value1, value2, "totaldistributecount");
            return (Criteria) this;
        }

        public Criteria andTotaldistributeamountIsNull() {
            addCriterion("TOTALDISTRIBUTEAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andTotaldistributeamountIsNotNull() {
            addCriterion("TOTALDISTRIBUTEAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andTotaldistributeamountEqualTo(String value) {
            addCriterion("TOTALDISTRIBUTEAMOUNT =", value, "totaldistributeamount");
            return (Criteria) this;
        }

        public Criteria andTotaldistributeamountNotEqualTo(String value) {
            addCriterion("TOTALDISTRIBUTEAMOUNT <>", value, "totaldistributeamount");
            return (Criteria) this;
        }

        public Criteria andTotaldistributeamountGreaterThan(String value) {
            addCriterion("TOTALDISTRIBUTEAMOUNT >", value, "totaldistributeamount");
            return (Criteria) this;
        }

        public Criteria andTotaldistributeamountGreaterThanOrEqualTo(String value) {
            addCriterion("TOTALDISTRIBUTEAMOUNT >=", value, "totaldistributeamount");
            return (Criteria) this;
        }

        public Criteria andTotaldistributeamountLessThan(String value) {
            addCriterion("TOTALDISTRIBUTEAMOUNT <", value, "totaldistributeamount");
            return (Criteria) this;
        }

        public Criteria andTotaldistributeamountLessThanOrEqualTo(String value) {
            addCriterion("TOTALDISTRIBUTEAMOUNT <=", value, "totaldistributeamount");
            return (Criteria) this;
        }

        public Criteria andTotaldistributeamountLike(String value) {
            addCriterion("TOTALDISTRIBUTEAMOUNT like", value, "totaldistributeamount");
            return (Criteria) this;
        }

        public Criteria andTotaldistributeamountNotLike(String value) {
            addCriterion("TOTALDISTRIBUTEAMOUNT not like", value, "totaldistributeamount");
            return (Criteria) this;
        }

        public Criteria andTotaldistributeamountIn(List<String> values) {
            addCriterion("TOTALDISTRIBUTEAMOUNT in", values, "totaldistributeamount");
            return (Criteria) this;
        }

        public Criteria andTotaldistributeamountNotIn(List<String> values) {
            addCriterion("TOTALDISTRIBUTEAMOUNT not in", values, "totaldistributeamount");
            return (Criteria) this;
        }

        public Criteria andTotaldistributeamountBetween(String value1, String value2) {
            addCriterion("TOTALDISTRIBUTEAMOUNT between", value1, value2, "totaldistributeamount");
            return (Criteria) this;
        }

        public Criteria andTotaldistributeamountNotBetween(String value1, String value2) {
            addCriterion("TOTALDISTRIBUTEAMOUNT not between", value1, value2, "totaldistributeamount");
            return (Criteria) this;
        }

        public Criteria andTotalwarehousecountIsNull() {
            addCriterion("TOTALWAREHOUSECOUNT is null");
            return (Criteria) this;
        }

        public Criteria andTotalwarehousecountIsNotNull() {
            addCriterion("TOTALWAREHOUSECOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andTotalwarehousecountEqualTo(String value) {
            addCriterion("TOTALWAREHOUSECOUNT =", value, "totalwarehousecount");
            return (Criteria) this;
        }

        public Criteria andTotalwarehousecountNotEqualTo(String value) {
            addCriterion("TOTALWAREHOUSECOUNT <>", value, "totalwarehousecount");
            return (Criteria) this;
        }

        public Criteria andTotalwarehousecountGreaterThan(String value) {
            addCriterion("TOTALWAREHOUSECOUNT >", value, "totalwarehousecount");
            return (Criteria) this;
        }

        public Criteria andTotalwarehousecountGreaterThanOrEqualTo(String value) {
            addCriterion("TOTALWAREHOUSECOUNT >=", value, "totalwarehousecount");
            return (Criteria) this;
        }

        public Criteria andTotalwarehousecountLessThan(String value) {
            addCriterion("TOTALWAREHOUSECOUNT <", value, "totalwarehousecount");
            return (Criteria) this;
        }

        public Criteria andTotalwarehousecountLessThanOrEqualTo(String value) {
            addCriterion("TOTALWAREHOUSECOUNT <=", value, "totalwarehousecount");
            return (Criteria) this;
        }

        public Criteria andTotalwarehousecountLike(String value) {
            addCriterion("TOTALWAREHOUSECOUNT like", value, "totalwarehousecount");
            return (Criteria) this;
        }

        public Criteria andTotalwarehousecountNotLike(String value) {
            addCriterion("TOTALWAREHOUSECOUNT not like", value, "totalwarehousecount");
            return (Criteria) this;
        }

        public Criteria andTotalwarehousecountIn(List<String> values) {
            addCriterion("TOTALWAREHOUSECOUNT in", values, "totalwarehousecount");
            return (Criteria) this;
        }

        public Criteria andTotalwarehousecountNotIn(List<String> values) {
            addCriterion("TOTALWAREHOUSECOUNT not in", values, "totalwarehousecount");
            return (Criteria) this;
        }

        public Criteria andTotalwarehousecountBetween(String value1, String value2) {
            addCriterion("TOTALWAREHOUSECOUNT between", value1, value2, "totalwarehousecount");
            return (Criteria) this;
        }

        public Criteria andTotalwarehousecountNotBetween(String value1, String value2) {
            addCriterion("TOTALWAREHOUSECOUNT not between", value1, value2, "totalwarehousecount");
            return (Criteria) this;
        }

        public Criteria andTotalwarehouseamountIsNull() {
            addCriterion("TOTALWAREHOUSEAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andTotalwarehouseamountIsNotNull() {
            addCriterion("TOTALWAREHOUSEAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andTotalwarehouseamountEqualTo(String value) {
            addCriterion("TOTALWAREHOUSEAMOUNT =", value, "totalwarehouseamount");
            return (Criteria) this;
        }

        public Criteria andTotalwarehouseamountNotEqualTo(String value) {
            addCriterion("TOTALWAREHOUSEAMOUNT <>", value, "totalwarehouseamount");
            return (Criteria) this;
        }

        public Criteria andTotalwarehouseamountGreaterThan(String value) {
            addCriterion("TOTALWAREHOUSEAMOUNT >", value, "totalwarehouseamount");
            return (Criteria) this;
        }

        public Criteria andTotalwarehouseamountGreaterThanOrEqualTo(String value) {
            addCriterion("TOTALWAREHOUSEAMOUNT >=", value, "totalwarehouseamount");
            return (Criteria) this;
        }

        public Criteria andTotalwarehouseamountLessThan(String value) {
            addCriterion("TOTALWAREHOUSEAMOUNT <", value, "totalwarehouseamount");
            return (Criteria) this;
        }

        public Criteria andTotalwarehouseamountLessThanOrEqualTo(String value) {
            addCriterion("TOTALWAREHOUSEAMOUNT <=", value, "totalwarehouseamount");
            return (Criteria) this;
        }

        public Criteria andTotalwarehouseamountLike(String value) {
            addCriterion("TOTALWAREHOUSEAMOUNT like", value, "totalwarehouseamount");
            return (Criteria) this;
        }

        public Criteria andTotalwarehouseamountNotLike(String value) {
            addCriterion("TOTALWAREHOUSEAMOUNT not like", value, "totalwarehouseamount");
            return (Criteria) this;
        }

        public Criteria andTotalwarehouseamountIn(List<String> values) {
            addCriterion("TOTALWAREHOUSEAMOUNT in", values, "totalwarehouseamount");
            return (Criteria) this;
        }

        public Criteria andTotalwarehouseamountNotIn(List<String> values) {
            addCriterion("TOTALWAREHOUSEAMOUNT not in", values, "totalwarehouseamount");
            return (Criteria) this;
        }

        public Criteria andTotalwarehouseamountBetween(String value1, String value2) {
            addCriterion("TOTALWAREHOUSEAMOUNT between", value1, value2, "totalwarehouseamount");
            return (Criteria) this;
        }

        public Criteria andTotalwarehouseamountNotBetween(String value1, String value2) {
            addCriterion("TOTALWAREHOUSEAMOUNT not between", value1, value2, "totalwarehouseamount");
            return (Criteria) this;
        }

        public Criteria andTotalreturnamountIsNull() {
            addCriterion("TOTALRETURNAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andTotalreturnamountIsNotNull() {
            addCriterion("TOTALRETURNAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andTotalreturnamountEqualTo(String value) {
            addCriterion("TOTALRETURNAMOUNT =", value, "totalreturnamount");
            return (Criteria) this;
        }

        public Criteria andTotalreturnamountNotEqualTo(String value) {
            addCriterion("TOTALRETURNAMOUNT <>", value, "totalreturnamount");
            return (Criteria) this;
        }

        public Criteria andTotalreturnamountGreaterThan(String value) {
            addCriterion("TOTALRETURNAMOUNT >", value, "totalreturnamount");
            return (Criteria) this;
        }

        public Criteria andTotalreturnamountGreaterThanOrEqualTo(String value) {
            addCriterion("TOTALRETURNAMOUNT >=", value, "totalreturnamount");
            return (Criteria) this;
        }

        public Criteria andTotalreturnamountLessThan(String value) {
            addCriterion("TOTALRETURNAMOUNT <", value, "totalreturnamount");
            return (Criteria) this;
        }

        public Criteria andTotalreturnamountLessThanOrEqualTo(String value) {
            addCriterion("TOTALRETURNAMOUNT <=", value, "totalreturnamount");
            return (Criteria) this;
        }

        public Criteria andTotalreturnamountLike(String value) {
            addCriterion("TOTALRETURNAMOUNT like", value, "totalreturnamount");
            return (Criteria) this;
        }

        public Criteria andTotalreturnamountNotLike(String value) {
            addCriterion("TOTALRETURNAMOUNT not like", value, "totalreturnamount");
            return (Criteria) this;
        }

        public Criteria andTotalreturnamountIn(List<String> values) {
            addCriterion("TOTALRETURNAMOUNT in", values, "totalreturnamount");
            return (Criteria) this;
        }

        public Criteria andTotalreturnamountNotIn(List<String> values) {
            addCriterion("TOTALRETURNAMOUNT not in", values, "totalreturnamount");
            return (Criteria) this;
        }

        public Criteria andTotalreturnamountBetween(String value1, String value2) {
            addCriterion("TOTALRETURNAMOUNT between", value1, value2, "totalreturnamount");
            return (Criteria) this;
        }

        public Criteria andTotalreturnamountNotBetween(String value1, String value2) {
            addCriterion("TOTALRETURNAMOUNT not between", value1, value2, "totalreturnamount");
            return (Criteria) this;
        }

        public Criteria andTotalreturncountIsNull() {
            addCriterion("TOTALRETURNCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andTotalreturncountIsNotNull() {
            addCriterion("TOTALRETURNCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andTotalreturncountEqualTo(String value) {
            addCriterion("TOTALRETURNCOUNT =", value, "totalreturncount");
            return (Criteria) this;
        }

        public Criteria andTotalreturncountNotEqualTo(String value) {
            addCriterion("TOTALRETURNCOUNT <>", value, "totalreturncount");
            return (Criteria) this;
        }

        public Criteria andTotalreturncountGreaterThan(String value) {
            addCriterion("TOTALRETURNCOUNT >", value, "totalreturncount");
            return (Criteria) this;
        }

        public Criteria andTotalreturncountGreaterThanOrEqualTo(String value) {
            addCriterion("TOTALRETURNCOUNT >=", value, "totalreturncount");
            return (Criteria) this;
        }

        public Criteria andTotalreturncountLessThan(String value) {
            addCriterion("TOTALRETURNCOUNT <", value, "totalreturncount");
            return (Criteria) this;
        }

        public Criteria andTotalreturncountLessThanOrEqualTo(String value) {
            addCriterion("TOTALRETURNCOUNT <=", value, "totalreturncount");
            return (Criteria) this;
        }

        public Criteria andTotalreturncountLike(String value) {
            addCriterion("TOTALRETURNCOUNT like", value, "totalreturncount");
            return (Criteria) this;
        }

        public Criteria andTotalreturncountNotLike(String value) {
            addCriterion("TOTALRETURNCOUNT not like", value, "totalreturncount");
            return (Criteria) this;
        }

        public Criteria andTotalreturncountIn(List<String> values) {
            addCriterion("TOTALRETURNCOUNT in", values, "totalreturncount");
            return (Criteria) this;
        }

        public Criteria andTotalreturncountNotIn(List<String> values) {
            addCriterion("TOTALRETURNCOUNT not in", values, "totalreturncount");
            return (Criteria) this;
        }

        public Criteria andTotalreturncountBetween(String value1, String value2) {
            addCriterion("TOTALRETURNCOUNT between", value1, value2, "totalreturncount");
            return (Criteria) this;
        }

        public Criteria andTotalreturncountNotBetween(String value1, String value2) {
            addCriterion("TOTALRETURNCOUNT not between", value1, value2, "totalreturncount");
            return (Criteria) this;
        }

        public Criteria andIsusingIsNull() {
            addCriterion("ISUSING is null");
            return (Criteria) this;
        }

        public Criteria andIsusingIsNotNull() {
            addCriterion("ISUSING is not null");
            return (Criteria) this;
        }

        public Criteria andIsusingEqualTo(String value) {
            addCriterion("ISUSING =", value, "isusing");
            return (Criteria) this;
        }

        public Criteria andIsusingNotEqualTo(String value) {
            addCriterion("ISUSING <>", value, "isusing");
            return (Criteria) this;
        }

        public Criteria andIsusingGreaterThan(String value) {
            addCriterion("ISUSING >", value, "isusing");
            return (Criteria) this;
        }

        public Criteria andIsusingGreaterThanOrEqualTo(String value) {
            addCriterion("ISUSING >=", value, "isusing");
            return (Criteria) this;
        }

        public Criteria andIsusingLessThan(String value) {
            addCriterion("ISUSING <", value, "isusing");
            return (Criteria) this;
        }

        public Criteria andIsusingLessThanOrEqualTo(String value) {
            addCriterion("ISUSING <=", value, "isusing");
            return (Criteria) this;
        }

        public Criteria andIsusingLike(String value) {
            addCriterion("ISUSING like", value, "isusing");
            return (Criteria) this;
        }

        public Criteria andIsusingNotLike(String value) {
            addCriterion("ISUSING not like", value, "isusing");
            return (Criteria) this;
        }

        public Criteria andIsusingIn(List<String> values) {
            addCriterion("ISUSING in", values, "isusing");
            return (Criteria) this;
        }

        public Criteria andIsusingNotIn(List<String> values) {
            addCriterion("ISUSING not in", values, "isusing");
            return (Criteria) this;
        }

        public Criteria andIsusingBetween(String value1, String value2) {
            addCriterion("ISUSING between", value1, value2, "isusing");
            return (Criteria) this;
        }

        public Criteria andIsusingNotBetween(String value1, String value2) {
            addCriterion("ISUSING not between", value1, value2, "isusing");
            return (Criteria) this;
        }

        public Criteria andDealreasonIsNull() {
            addCriterion("DEALREASON is null");
            return (Criteria) this;
        }

        public Criteria andDealreasonIsNotNull() {
            addCriterion("DEALREASON is not null");
            return (Criteria) this;
        }

        public Criteria andDealreasonEqualTo(String value) {
            addCriterion("DEALREASON =", value, "dealreason");
            return (Criteria) this;
        }

        public Criteria andDealreasonNotEqualTo(String value) {
            addCriterion("DEALREASON <>", value, "dealreason");
            return (Criteria) this;
        }

        public Criteria andDealreasonGreaterThan(String value) {
            addCriterion("DEALREASON >", value, "dealreason");
            return (Criteria) this;
        }

        public Criteria andDealreasonGreaterThanOrEqualTo(String value) {
            addCriterion("DEALREASON >=", value, "dealreason");
            return (Criteria) this;
        }

        public Criteria andDealreasonLessThan(String value) {
            addCriterion("DEALREASON <", value, "dealreason");
            return (Criteria) this;
        }

        public Criteria andDealreasonLessThanOrEqualTo(String value) {
            addCriterion("DEALREASON <=", value, "dealreason");
            return (Criteria) this;
        }

        public Criteria andDealreasonLike(String value) {
            addCriterion("DEALREASON like", value, "dealreason");
            return (Criteria) this;
        }

        public Criteria andDealreasonNotLike(String value) {
            addCriterion("DEALREASON not like", value, "dealreason");
            return (Criteria) this;
        }

        public Criteria andDealreasonIn(List<String> values) {
            addCriterion("DEALREASON in", values, "dealreason");
            return (Criteria) this;
        }

        public Criteria andDealreasonNotIn(List<String> values) {
            addCriterion("DEALREASON not in", values, "dealreason");
            return (Criteria) this;
        }

        public Criteria andDealreasonBetween(String value1, String value2) {
            addCriterion("DEALREASON between", value1, value2, "dealreason");
            return (Criteria) this;
        }

        public Criteria andDealreasonNotBetween(String value1, String value2) {
            addCriterion("DEALREASON not between", value1, value2, "dealreason");
            return (Criteria) this;
        }

        public Criteria andAdduseridIsNull() {
            addCriterion("ADDUSERID is null");
            return (Criteria) this;
        }

        public Criteria andAdduseridIsNotNull() {
            addCriterion("ADDUSERID is not null");
            return (Criteria) this;
        }

        public Criteria andAdduseridEqualTo(String value) {
            addCriterion("ADDUSERID =", value, "adduserid");
            return (Criteria) this;
        }

        public Criteria andAdduseridNotEqualTo(String value) {
            addCriterion("ADDUSERID <>", value, "adduserid");
            return (Criteria) this;
        }

        public Criteria andAdduseridGreaterThan(String value) {
            addCriterion("ADDUSERID >", value, "adduserid");
            return (Criteria) this;
        }

        public Criteria andAdduseridGreaterThanOrEqualTo(String value) {
            addCriterion("ADDUSERID >=", value, "adduserid");
            return (Criteria) this;
        }

        public Criteria andAdduseridLessThan(String value) {
            addCriterion("ADDUSERID <", value, "adduserid");
            return (Criteria) this;
        }

        public Criteria andAdduseridLessThanOrEqualTo(String value) {
            addCriterion("ADDUSERID <=", value, "adduserid");
            return (Criteria) this;
        }

        public Criteria andAdduseridLike(String value) {
            addCriterion("ADDUSERID like", value, "adduserid");
            return (Criteria) this;
        }

        public Criteria andAdduseridNotLike(String value) {
            addCriterion("ADDUSERID not like", value, "adduserid");
            return (Criteria) this;
        }

        public Criteria andAdduseridIn(List<String> values) {
            addCriterion("ADDUSERID in", values, "adduserid");
            return (Criteria) this;
        }

        public Criteria andAdduseridNotIn(List<String> values) {
            addCriterion("ADDUSERID not in", values, "adduserid");
            return (Criteria) this;
        }

        public Criteria andAdduseridBetween(String value1, String value2) {
            addCriterion("ADDUSERID between", value1, value2, "adduserid");
            return (Criteria) this;
        }

        public Criteria andAdduseridNotBetween(String value1, String value2) {
            addCriterion("ADDUSERID not between", value1, value2, "adduserid");
            return (Criteria) this;
        }

        public Criteria andAddusernameIsNull() {
            addCriterion("ADDUSERNAME is null");
            return (Criteria) this;
        }

        public Criteria andAddusernameIsNotNull() {
            addCriterion("ADDUSERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andAddusernameEqualTo(String value) {
            addCriterion("ADDUSERNAME =", value, "addusername");
            return (Criteria) this;
        }

        public Criteria andAddusernameNotEqualTo(String value) {
            addCriterion("ADDUSERNAME <>", value, "addusername");
            return (Criteria) this;
        }

        public Criteria andAddusernameGreaterThan(String value) {
            addCriterion("ADDUSERNAME >", value, "addusername");
            return (Criteria) this;
        }

        public Criteria andAddusernameGreaterThanOrEqualTo(String value) {
            addCriterion("ADDUSERNAME >=", value, "addusername");
            return (Criteria) this;
        }

        public Criteria andAddusernameLessThan(String value) {
            addCriterion("ADDUSERNAME <", value, "addusername");
            return (Criteria) this;
        }

        public Criteria andAddusernameLessThanOrEqualTo(String value) {
            addCriterion("ADDUSERNAME <=", value, "addusername");
            return (Criteria) this;
        }

        public Criteria andAddusernameLike(String value) {
            addCriterion("ADDUSERNAME like", value, "addusername");
            return (Criteria) this;
        }

        public Criteria andAddusernameNotLike(String value) {
            addCriterion("ADDUSERNAME not like", value, "addusername");
            return (Criteria) this;
        }

        public Criteria andAddusernameIn(List<String> values) {
            addCriterion("ADDUSERNAME in", values, "addusername");
            return (Criteria) this;
        }

        public Criteria andAddusernameNotIn(List<String> values) {
            addCriterion("ADDUSERNAME not in", values, "addusername");
            return (Criteria) this;
        }

        public Criteria andAddusernameBetween(String value1, String value2) {
            addCriterion("ADDUSERNAME between", value1, value2, "addusername");
            return (Criteria) this;
        }

        public Criteria andAddusernameNotBetween(String value1, String value2) {
            addCriterion("ADDUSERNAME not between", value1, value2, "addusername");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNull() {
            addCriterion("ADDTIME is null");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNotNull() {
            addCriterion("ADDTIME is not null");
            return (Criteria) this;
        }

        public Criteria andAddtimeEqualTo(String value) {
            addCriterion("ADDTIME =", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotEqualTo(String value) {
            addCriterion("ADDTIME <>", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThan(String value) {
            addCriterion("ADDTIME >", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThanOrEqualTo(String value) {
            addCriterion("ADDTIME >=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThan(String value) {
            addCriterion("ADDTIME <", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThanOrEqualTo(String value) {
            addCriterion("ADDTIME <=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLike(String value) {
            addCriterion("ADDTIME like", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotLike(String value) {
            addCriterion("ADDTIME not like", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeIn(List<String> values) {
            addCriterion("ADDTIME in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotIn(List<String> values) {
            addCriterion("ADDTIME not in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeBetween(String value1, String value2) {
            addCriterion("ADDTIME between", value1, value2, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotBetween(String value1, String value2) {
            addCriterion("ADDTIME not between", value1, value2, "addtime");
            return (Criteria) this;
        }

        public Criteria andLastupdateuseridIsNull() {
            addCriterion("LASTUPDATEUSERID is null");
            return (Criteria) this;
        }

        public Criteria andLastupdateuseridIsNotNull() {
            addCriterion("LASTUPDATEUSERID is not null");
            return (Criteria) this;
        }

        public Criteria andLastupdateuseridEqualTo(String value) {
            addCriterion("LASTUPDATEUSERID =", value, "lastupdateuserid");
            return (Criteria) this;
        }

        public Criteria andLastupdateuseridNotEqualTo(String value) {
            addCriterion("LASTUPDATEUSERID <>", value, "lastupdateuserid");
            return (Criteria) this;
        }

        public Criteria andLastupdateuseridGreaterThan(String value) {
            addCriterion("LASTUPDATEUSERID >", value, "lastupdateuserid");
            return (Criteria) this;
        }

        public Criteria andLastupdateuseridGreaterThanOrEqualTo(String value) {
            addCriterion("LASTUPDATEUSERID >=", value, "lastupdateuserid");
            return (Criteria) this;
        }

        public Criteria andLastupdateuseridLessThan(String value) {
            addCriterion("LASTUPDATEUSERID <", value, "lastupdateuserid");
            return (Criteria) this;
        }

        public Criteria andLastupdateuseridLessThanOrEqualTo(String value) {
            addCriterion("LASTUPDATEUSERID <=", value, "lastupdateuserid");
            return (Criteria) this;
        }

        public Criteria andLastupdateuseridLike(String value) {
            addCriterion("LASTUPDATEUSERID like", value, "lastupdateuserid");
            return (Criteria) this;
        }

        public Criteria andLastupdateuseridNotLike(String value) {
            addCriterion("LASTUPDATEUSERID not like", value, "lastupdateuserid");
            return (Criteria) this;
        }

        public Criteria andLastupdateuseridIn(List<String> values) {
            addCriterion("LASTUPDATEUSERID in", values, "lastupdateuserid");
            return (Criteria) this;
        }

        public Criteria andLastupdateuseridNotIn(List<String> values) {
            addCriterion("LASTUPDATEUSERID not in", values, "lastupdateuserid");
            return (Criteria) this;
        }

        public Criteria andLastupdateuseridBetween(String value1, String value2) {
            addCriterion("LASTUPDATEUSERID between", value1, value2, "lastupdateuserid");
            return (Criteria) this;
        }

        public Criteria andLastupdateuseridNotBetween(String value1, String value2) {
            addCriterion("LASTUPDATEUSERID not between", value1, value2, "lastupdateuserid");
            return (Criteria) this;
        }

        public Criteria andLastupdateusernameIsNull() {
            addCriterion("LASTUPDATEUSERNAME is null");
            return (Criteria) this;
        }

        public Criteria andLastupdateusernameIsNotNull() {
            addCriterion("LASTUPDATEUSERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andLastupdateusernameEqualTo(String value) {
            addCriterion("LASTUPDATEUSERNAME =", value, "lastupdateusername");
            return (Criteria) this;
        }

        public Criteria andLastupdateusernameNotEqualTo(String value) {
            addCriterion("LASTUPDATEUSERNAME <>", value, "lastupdateusername");
            return (Criteria) this;
        }

        public Criteria andLastupdateusernameGreaterThan(String value) {
            addCriterion("LASTUPDATEUSERNAME >", value, "lastupdateusername");
            return (Criteria) this;
        }

        public Criteria andLastupdateusernameGreaterThanOrEqualTo(String value) {
            addCriterion("LASTUPDATEUSERNAME >=", value, "lastupdateusername");
            return (Criteria) this;
        }

        public Criteria andLastupdateusernameLessThan(String value) {
            addCriterion("LASTUPDATEUSERNAME <", value, "lastupdateusername");
            return (Criteria) this;
        }

        public Criteria andLastupdateusernameLessThanOrEqualTo(String value) {
            addCriterion("LASTUPDATEUSERNAME <=", value, "lastupdateusername");
            return (Criteria) this;
        }

        public Criteria andLastupdateusernameLike(String value) {
            addCriterion("LASTUPDATEUSERNAME like", value, "lastupdateusername");
            return (Criteria) this;
        }

        public Criteria andLastupdateusernameNotLike(String value) {
            addCriterion("LASTUPDATEUSERNAME not like", value, "lastupdateusername");
            return (Criteria) this;
        }

        public Criteria andLastupdateusernameIn(List<String> values) {
            addCriterion("LASTUPDATEUSERNAME in", values, "lastupdateusername");
            return (Criteria) this;
        }

        public Criteria andLastupdateusernameNotIn(List<String> values) {
            addCriterion("LASTUPDATEUSERNAME not in", values, "lastupdateusername");
            return (Criteria) this;
        }

        public Criteria andLastupdateusernameBetween(String value1, String value2) {
            addCriterion("LASTUPDATEUSERNAME between", value1, value2, "lastupdateusername");
            return (Criteria) this;
        }

        public Criteria andLastupdateusernameNotBetween(String value1, String value2) {
            addCriterion("LASTUPDATEUSERNAME not between", value1, value2, "lastupdateusername");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeIsNull() {
            addCriterion("LASTUPDATETIME is null");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeIsNotNull() {
            addCriterion("LASTUPDATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeEqualTo(String value) {
            addCriterion("LASTUPDATETIME =", value, "lastupdatetime");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeNotEqualTo(String value) {
            addCriterion("LASTUPDATETIME <>", value, "lastupdatetime");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeGreaterThan(String value) {
            addCriterion("LASTUPDATETIME >", value, "lastupdatetime");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("LASTUPDATETIME >=", value, "lastupdatetime");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeLessThan(String value) {
            addCriterion("LASTUPDATETIME <", value, "lastupdatetime");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeLessThanOrEqualTo(String value) {
            addCriterion("LASTUPDATETIME <=", value, "lastupdatetime");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeLike(String value) {
            addCriterion("LASTUPDATETIME like", value, "lastupdatetime");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeNotLike(String value) {
            addCriterion("LASTUPDATETIME not like", value, "lastupdatetime");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeIn(List<String> values) {
            addCriterion("LASTUPDATETIME in", values, "lastupdatetime");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeNotIn(List<String> values) {
            addCriterion("LASTUPDATETIME not in", values, "lastupdatetime");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeBetween(String value1, String value2) {
            addCriterion("LASTUPDATETIME between", value1, value2, "lastupdatetime");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeNotBetween(String value1, String value2) {
            addCriterion("LASTUPDATETIME not between", value1, value2, "lastupdatetime");
            return (Criteria) this;
        }

        public Criteria andIslongfilingIsNull() {
            addCriterion("ISLONGFILING is null");
            return (Criteria) this;
        }

        public Criteria andIslongfilingIsNotNull() {
            addCriterion("ISLONGFILING is not null");
            return (Criteria) this;
        }

        public Criteria andIslongfilingEqualTo(String value) {
            addCriterion("ISLONGFILING =", value, "islongfiling");
            return (Criteria) this;
        }

        public Criteria andIslongfilingNotEqualTo(String value) {
            addCriterion("ISLONGFILING <>", value, "islongfiling");
            return (Criteria) this;
        }

        public Criteria andIslongfilingGreaterThan(String value) {
            addCriterion("ISLONGFILING >", value, "islongfiling");
            return (Criteria) this;
        }

        public Criteria andIslongfilingGreaterThanOrEqualTo(String value) {
            addCriterion("ISLONGFILING >=", value, "islongfiling");
            return (Criteria) this;
        }

        public Criteria andIslongfilingLessThan(String value) {
            addCriterion("ISLONGFILING <", value, "islongfiling");
            return (Criteria) this;
        }

        public Criteria andIslongfilingLessThanOrEqualTo(String value) {
            addCriterion("ISLONGFILING <=", value, "islongfiling");
            return (Criteria) this;
        }

        public Criteria andIslongfilingLike(String value) {
            addCriterion("ISLONGFILING like", value, "islongfiling");
            return (Criteria) this;
        }

        public Criteria andIslongfilingNotLike(String value) {
            addCriterion("ISLONGFILING not like", value, "islongfiling");
            return (Criteria) this;
        }

        public Criteria andIslongfilingIn(List<String> values) {
            addCriterion("ISLONGFILING in", values, "islongfiling");
            return (Criteria) this;
        }

        public Criteria andIslongfilingNotIn(List<String> values) {
            addCriterion("ISLONGFILING not in", values, "islongfiling");
            return (Criteria) this;
        }

        public Criteria andIslongfilingBetween(String value1, String value2) {
            addCriterion("ISLONGFILING between", value1, value2, "islongfiling");
            return (Criteria) this;
        }

        public Criteria andIslongfilingNotBetween(String value1, String value2) {
            addCriterion("ISLONGFILING not between", value1, value2, "islongfiling");
            return (Criteria) this;
        }

        public Criteria andGooddatastrIsNull() {
            addCriterion("GOODDATASTR is null");
            return (Criteria) this;
        }

        public Criteria andGooddatastrIsNotNull() {
            addCriterion("GOODDATASTR is not null");
            return (Criteria) this;
        }

        public Criteria andGooddatastrEqualTo(String value) {
            addCriterion("GOODDATASTR =", value, "gooddatastr");
            return (Criteria) this;
        }

        public Criteria andGooddatastrNotEqualTo(String value) {
            addCriterion("GOODDATASTR <>", value, "gooddatastr");
            return (Criteria) this;
        }

        public Criteria andGooddatastrGreaterThan(String value) {
            addCriterion("GOODDATASTR >", value, "gooddatastr");
            return (Criteria) this;
        }

        public Criteria andGooddatastrGreaterThanOrEqualTo(String value) {
            addCriterion("GOODDATASTR >=", value, "gooddatastr");
            return (Criteria) this;
        }

        public Criteria andGooddatastrLessThan(String value) {
            addCriterion("GOODDATASTR <", value, "gooddatastr");
            return (Criteria) this;
        }

        public Criteria andGooddatastrLessThanOrEqualTo(String value) {
            addCriterion("GOODDATASTR <=", value, "gooddatastr");
            return (Criteria) this;
        }

        public Criteria andGooddatastrLike(String value) {
            addCriterion("GOODDATASTR like", value, "gooddatastr");
            return (Criteria) this;
        }

        public Criteria andGooddatastrNotLike(String value) {
            addCriterion("GOODDATASTR not like", value, "gooddatastr");
            return (Criteria) this;
        }

        public Criteria andGooddatastrIn(List<String> values) {
            addCriterion("GOODDATASTR in", values, "gooddatastr");
            return (Criteria) this;
        }

        public Criteria andGooddatastrNotIn(List<String> values) {
            addCriterion("GOODDATASTR not in", values, "gooddatastr");
            return (Criteria) this;
        }

        public Criteria andGooddatastrBetween(String value1, String value2) {
            addCriterion("GOODDATASTR between", value1, value2, "gooddatastr");
            return (Criteria) this;
        }

        public Criteria andGooddatastrNotBetween(String value1, String value2) {
            addCriterion("GOODDATASTR not between", value1, value2, "gooddatastr");
            return (Criteria) this;
        }

        public Criteria andSumpurchaseamountIsNull() {
            addCriterion("SUMPURCHASEAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andSumpurchaseamountIsNotNull() {
            addCriterion("SUMPURCHASEAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andSumpurchaseamountEqualTo(String value) {
            addCriterion("SUMPURCHASEAMOUNT =", value, "sumpurchaseamount");
            return (Criteria) this;
        }

        public Criteria andSumpurchaseamountNotEqualTo(String value) {
            addCriterion("SUMPURCHASEAMOUNT <>", value, "sumpurchaseamount");
            return (Criteria) this;
        }

        public Criteria andSumpurchaseamountGreaterThan(String value) {
            addCriterion("SUMPURCHASEAMOUNT >", value, "sumpurchaseamount");
            return (Criteria) this;
        }

        public Criteria andSumpurchaseamountGreaterThanOrEqualTo(String value) {
            addCriterion("SUMPURCHASEAMOUNT >=", value, "sumpurchaseamount");
            return (Criteria) this;
        }

        public Criteria andSumpurchaseamountLessThan(String value) {
            addCriterion("SUMPURCHASEAMOUNT <", value, "sumpurchaseamount");
            return (Criteria) this;
        }

        public Criteria andSumpurchaseamountLessThanOrEqualTo(String value) {
            addCriterion("SUMPURCHASEAMOUNT <=", value, "sumpurchaseamount");
            return (Criteria) this;
        }

        public Criteria andSumpurchaseamountLike(String value) {
            addCriterion("SUMPURCHASEAMOUNT like", value, "sumpurchaseamount");
            return (Criteria) this;
        }

        public Criteria andSumpurchaseamountNotLike(String value) {
            addCriterion("SUMPURCHASEAMOUNT not like", value, "sumpurchaseamount");
            return (Criteria) this;
        }

        public Criteria andSumpurchaseamountIn(List<String> values) {
            addCriterion("SUMPURCHASEAMOUNT in", values, "sumpurchaseamount");
            return (Criteria) this;
        }

        public Criteria andSumpurchaseamountNotIn(List<String> values) {
            addCriterion("SUMPURCHASEAMOUNT not in", values, "sumpurchaseamount");
            return (Criteria) this;
        }

        public Criteria andSumpurchaseamountBetween(String value1, String value2) {
            addCriterion("SUMPURCHASEAMOUNT between", value1, value2, "sumpurchaseamount");
            return (Criteria) this;
        }

        public Criteria andSumpurchaseamountNotBetween(String value1, String value2) {
            addCriterion("SUMPURCHASEAMOUNT not between", value1, value2, "sumpurchaseamount");
            return (Criteria) this;
        }

        public Criteria andAllcountIsNull() {
            addCriterion("ALLCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andAllcountIsNotNull() {
            addCriterion("ALLCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andAllcountEqualTo(String value) {
            addCriterion("ALLCOUNT =", value, "allcount");
            return (Criteria) this;
        }

        public Criteria andAllcountNotEqualTo(String value) {
            addCriterion("ALLCOUNT <>", value, "allcount");
            return (Criteria) this;
        }

        public Criteria andAllcountGreaterThan(String value) {
            addCriterion("ALLCOUNT >", value, "allcount");
            return (Criteria) this;
        }

        public Criteria andAllcountGreaterThanOrEqualTo(String value) {
            addCriterion("ALLCOUNT >=", value, "allcount");
            return (Criteria) this;
        }

        public Criteria andAllcountLessThan(String value) {
            addCriterion("ALLCOUNT <", value, "allcount");
            return (Criteria) this;
        }

        public Criteria andAllcountLessThanOrEqualTo(String value) {
            addCriterion("ALLCOUNT <=", value, "allcount");
            return (Criteria) this;
        }

        public Criteria andAllcountLike(String value) {
            addCriterion("ALLCOUNT like", value, "allcount");
            return (Criteria) this;
        }

        public Criteria andAllcountNotLike(String value) {
            addCriterion("ALLCOUNT not like", value, "allcount");
            return (Criteria) this;
        }

        public Criteria andAllcountIn(List<String> values) {
            addCriterion("ALLCOUNT in", values, "allcount");
            return (Criteria) this;
        }

        public Criteria andAllcountNotIn(List<String> values) {
            addCriterion("ALLCOUNT not in", values, "allcount");
            return (Criteria) this;
        }

        public Criteria andAllcountBetween(String value1, String value2) {
            addCriterion("ALLCOUNT between", value1, value2, "allcount");
            return (Criteria) this;
        }

        public Criteria andAllcountNotBetween(String value1, String value2) {
            addCriterion("ALLCOUNT not between", value1, value2, "allcount");
            return (Criteria) this;
        }

        public Criteria andOrdercustominfoIsNull() {
            addCriterion("ORDERCUSTOMINFO is null");
            return (Criteria) this;
        }

        public Criteria andOrdercustominfoIsNotNull() {
            addCriterion("ORDERCUSTOMINFO is not null");
            return (Criteria) this;
        }

        public Criteria andOrdercustominfoEqualTo(String value) {
            addCriterion("ORDERCUSTOMINFO =", value, "ordercustominfo");
            return (Criteria) this;
        }

        public Criteria andOrdercustominfoNotEqualTo(String value) {
            addCriterion("ORDERCUSTOMINFO <>", value, "ordercustominfo");
            return (Criteria) this;
        }

        public Criteria andOrdercustominfoGreaterThan(String value) {
            addCriterion("ORDERCUSTOMINFO >", value, "ordercustominfo");
            return (Criteria) this;
        }

        public Criteria andOrdercustominfoGreaterThanOrEqualTo(String value) {
            addCriterion("ORDERCUSTOMINFO >=", value, "ordercustominfo");
            return (Criteria) this;
        }

        public Criteria andOrdercustominfoLessThan(String value) {
            addCriterion("ORDERCUSTOMINFO <", value, "ordercustominfo");
            return (Criteria) this;
        }

        public Criteria andOrdercustominfoLessThanOrEqualTo(String value) {
            addCriterion("ORDERCUSTOMINFO <=", value, "ordercustominfo");
            return (Criteria) this;
        }

        public Criteria andOrdercustominfoLike(String value) {
            addCriterion("ORDERCUSTOMINFO like", value, "ordercustominfo");
            return (Criteria) this;
        }

        public Criteria andOrdercustominfoNotLike(String value) {
            addCriterion("ORDERCUSTOMINFO not like", value, "ordercustominfo");
            return (Criteria) this;
        }

        public Criteria andOrdercustominfoIn(List<String> values) {
            addCriterion("ORDERCUSTOMINFO in", values, "ordercustominfo");
            return (Criteria) this;
        }

        public Criteria andOrdercustominfoNotIn(List<String> values) {
            addCriterion("ORDERCUSTOMINFO not in", values, "ordercustominfo");
            return (Criteria) this;
        }

        public Criteria andOrdercustominfoBetween(String value1, String value2) {
            addCriterion("ORDERCUSTOMINFO between", value1, value2, "ordercustominfo");
            return (Criteria) this;
        }

        public Criteria andOrdercustominfoNotBetween(String value1, String value2) {
            addCriterion("ORDERCUSTOMINFO not between", value1, value2, "ordercustominfo");
            return (Criteria) this;
        }

        public Criteria andGoodsnumberIsNull() {
            addCriterion("GOODSNUMBER is null");
            return (Criteria) this;
        }

        public Criteria andGoodsnumberIsNotNull() {
            addCriterion("GOODSNUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsnumberEqualTo(String value) {
            addCriterion("GOODSNUMBER =", value, "goodsnumber");
            return (Criteria) this;
        }

        public Criteria andGoodsnumberNotEqualTo(String value) {
            addCriterion("GOODSNUMBER <>", value, "goodsnumber");
            return (Criteria) this;
        }

        public Criteria andGoodsnumberGreaterThan(String value) {
            addCriterion("GOODSNUMBER >", value, "goodsnumber");
            return (Criteria) this;
        }

        public Criteria andGoodsnumberGreaterThanOrEqualTo(String value) {
            addCriterion("GOODSNUMBER >=", value, "goodsnumber");
            return (Criteria) this;
        }

        public Criteria andGoodsnumberLessThan(String value) {
            addCriterion("GOODSNUMBER <", value, "goodsnumber");
            return (Criteria) this;
        }

        public Criteria andGoodsnumberLessThanOrEqualTo(String value) {
            addCriterion("GOODSNUMBER <=", value, "goodsnumber");
            return (Criteria) this;
        }

        public Criteria andGoodsnumberLike(String value) {
            addCriterion("GOODSNUMBER like", value, "goodsnumber");
            return (Criteria) this;
        }

        public Criteria andGoodsnumberNotLike(String value) {
            addCriterion("GOODSNUMBER not like", value, "goodsnumber");
            return (Criteria) this;
        }

        public Criteria andGoodsnumberIn(List<String> values) {
            addCriterion("GOODSNUMBER in", values, "goodsnumber");
            return (Criteria) this;
        }

        public Criteria andGoodsnumberNotIn(List<String> values) {
            addCriterion("GOODSNUMBER not in", values, "goodsnumber");
            return (Criteria) this;
        }

        public Criteria andGoodsnumberBetween(String value1, String value2) {
            addCriterion("GOODSNUMBER between", value1, value2, "goodsnumber");
            return (Criteria) this;
        }

        public Criteria andGoodsnumberNotBetween(String value1, String value2) {
            addCriterion("GOODSNUMBER not between", value1, value2, "goodsnumber");
            return (Criteria) this;
        }

        public Criteria andAfterlinkagepriceIsNull() {
            addCriterion("AFTERLINKAGEPRICE is null");
            return (Criteria) this;
        }

        public Criteria andAfterlinkagepriceIsNotNull() {
            addCriterion("AFTERLINKAGEPRICE is not null");
            return (Criteria) this;
        }

        public Criteria andAfterlinkagepriceEqualTo(String value) {
            addCriterion("AFTERLINKAGEPRICE =", value, "afterlinkageprice");
            return (Criteria) this;
        }

        public Criteria andAfterlinkagepriceNotEqualTo(String value) {
            addCriterion("AFTERLINKAGEPRICE <>", value, "afterlinkageprice");
            return (Criteria) this;
        }

        public Criteria andAfterlinkagepriceGreaterThan(String value) {
            addCriterion("AFTERLINKAGEPRICE >", value, "afterlinkageprice");
            return (Criteria) this;
        }

        public Criteria andAfterlinkagepriceGreaterThanOrEqualTo(String value) {
            addCriterion("AFTERLINKAGEPRICE >=", value, "afterlinkageprice");
            return (Criteria) this;
        }

        public Criteria andAfterlinkagepriceLessThan(String value) {
            addCriterion("AFTERLINKAGEPRICE <", value, "afterlinkageprice");
            return (Criteria) this;
        }

        public Criteria andAfterlinkagepriceLessThanOrEqualTo(String value) {
            addCriterion("AFTERLINKAGEPRICE <=", value, "afterlinkageprice");
            return (Criteria) this;
        }

        public Criteria andAfterlinkagepriceLike(String value) {
            addCriterion("AFTERLINKAGEPRICE like", value, "afterlinkageprice");
            return (Criteria) this;
        }

        public Criteria andAfterlinkagepriceNotLike(String value) {
            addCriterion("AFTERLINKAGEPRICE not like", value, "afterlinkageprice");
            return (Criteria) this;
        }

        public Criteria andAfterlinkagepriceIn(List<String> values) {
            addCriterion("AFTERLINKAGEPRICE in", values, "afterlinkageprice");
            return (Criteria) this;
        }

        public Criteria andAfterlinkagepriceNotIn(List<String> values) {
            addCriterion("AFTERLINKAGEPRICE not in", values, "afterlinkageprice");
            return (Criteria) this;
        }

        public Criteria andAfterlinkagepriceBetween(String value1, String value2) {
            addCriterion("AFTERLINKAGEPRICE between", value1, value2, "afterlinkageprice");
            return (Criteria) this;
        }

        public Criteria andAfterlinkagepriceNotBetween(String value1, String value2) {
            addCriterion("AFTERLINKAGEPRICE not between", value1, value2, "afterlinkageprice");
            return (Criteria) this;
        }

        public Criteria andMedicarepaymentpriceIsNull() {
            addCriterion("MEDICAREPAYMENTPRICE is null");
            return (Criteria) this;
        }

        public Criteria andMedicarepaymentpriceIsNotNull() {
            addCriterion("MEDICAREPAYMENTPRICE is not null");
            return (Criteria) this;
        }

        public Criteria andMedicarepaymentpriceEqualTo(String value) {
            addCriterion("MEDICAREPAYMENTPRICE =", value, "medicarepaymentprice");
            return (Criteria) this;
        }

        public Criteria andMedicarepaymentpriceNotEqualTo(String value) {
            addCriterion("MEDICAREPAYMENTPRICE <>", value, "medicarepaymentprice");
            return (Criteria) this;
        }

        public Criteria andMedicarepaymentpriceGreaterThan(String value) {
            addCriterion("MEDICAREPAYMENTPRICE >", value, "medicarepaymentprice");
            return (Criteria) this;
        }

        public Criteria andMedicarepaymentpriceGreaterThanOrEqualTo(String value) {
            addCriterion("MEDICAREPAYMENTPRICE >=", value, "medicarepaymentprice");
            return (Criteria) this;
        }

        public Criteria andMedicarepaymentpriceLessThan(String value) {
            addCriterion("MEDICAREPAYMENTPRICE <", value, "medicarepaymentprice");
            return (Criteria) this;
        }

        public Criteria andMedicarepaymentpriceLessThanOrEqualTo(String value) {
            addCriterion("MEDICAREPAYMENTPRICE <=", value, "medicarepaymentprice");
            return (Criteria) this;
        }

        public Criteria andMedicarepaymentpriceLike(String value) {
            addCriterion("MEDICAREPAYMENTPRICE like", value, "medicarepaymentprice");
            return (Criteria) this;
        }

        public Criteria andMedicarepaymentpriceNotLike(String value) {
            addCriterion("MEDICAREPAYMENTPRICE not like", value, "medicarepaymentprice");
            return (Criteria) this;
        }

        public Criteria andMedicarepaymentpriceIn(List<String> values) {
            addCriterion("MEDICAREPAYMENTPRICE in", values, "medicarepaymentprice");
            return (Criteria) this;
        }

        public Criteria andMedicarepaymentpriceNotIn(List<String> values) {
            addCriterion("MEDICAREPAYMENTPRICE not in", values, "medicarepaymentprice");
            return (Criteria) this;
        }

        public Criteria andMedicarepaymentpriceBetween(String value1, String value2) {
            addCriterion("MEDICAREPAYMENTPRICE between", value1, value2, "medicarepaymentprice");
            return (Criteria) this;
        }

        public Criteria andMedicarepaymentpriceNotBetween(String value1, String value2) {
            addCriterion("MEDICAREPAYMENTPRICE not between", value1, value2, "medicarepaymentprice");
            return (Criteria) this;
        }

        public Criteria andHospitalorderdetailidIsNull() {
            addCriterion("HOSPITALORDERDETAILID is null");
            return (Criteria) this;
        }

        public Criteria andHospitalorderdetailidIsNotNull() {
            addCriterion("HOSPITALORDERDETAILID is not null");
            return (Criteria) this;
        }

        public Criteria andHospitalorderdetailidEqualTo(String value) {
            addCriterion("HOSPITALORDERDETAILID =", value, "hospitalorderdetailid");
            return (Criteria) this;
        }

        public Criteria andHospitalorderdetailidNotEqualTo(String value) {
            addCriterion("HOSPITALORDERDETAILID <>", value, "hospitalorderdetailid");
            return (Criteria) this;
        }

        public Criteria andHospitalorderdetailidGreaterThan(String value) {
            addCriterion("HOSPITALORDERDETAILID >", value, "hospitalorderdetailid");
            return (Criteria) this;
        }

        public Criteria andHospitalorderdetailidGreaterThanOrEqualTo(String value) {
            addCriterion("HOSPITALORDERDETAILID >=", value, "hospitalorderdetailid");
            return (Criteria) this;
        }

        public Criteria andHospitalorderdetailidLessThan(String value) {
            addCriterion("HOSPITALORDERDETAILID <", value, "hospitalorderdetailid");
            return (Criteria) this;
        }

        public Criteria andHospitalorderdetailidLessThanOrEqualTo(String value) {
            addCriterion("HOSPITALORDERDETAILID <=", value, "hospitalorderdetailid");
            return (Criteria) this;
        }

        public Criteria andHospitalorderdetailidLike(String value) {
            addCriterion("HOSPITALORDERDETAILID like", value, "hospitalorderdetailid");
            return (Criteria) this;
        }

        public Criteria andHospitalorderdetailidNotLike(String value) {
            addCriterion("HOSPITALORDERDETAILID not like", value, "hospitalorderdetailid");
            return (Criteria) this;
        }

        public Criteria andHospitalorderdetailidIn(List<String> values) {
            addCriterion("HOSPITALORDERDETAILID in", values, "hospitalorderdetailid");
            return (Criteria) this;
        }

        public Criteria andHospitalorderdetailidNotIn(List<String> values) {
            addCriterion("HOSPITALORDERDETAILID not in", values, "hospitalorderdetailid");
            return (Criteria) this;
        }

        public Criteria andHospitalorderdetailidBetween(String value1, String value2) {
            addCriterion("HOSPITALORDERDETAILID between", value1, value2, "hospitalorderdetailid");
            return (Criteria) this;
        }

        public Criteria andHospitalorderdetailidNotBetween(String value1, String value2) {
            addCriterion("HOSPITALORDERDETAILID not between", value1, value2, "hospitalorderdetailid");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNull() {
            addCriterion("CREATEDATE is null");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNotNull() {
            addCriterion("CREATEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedateEqualTo(Date value) {
            addCriterion("CREATEDATE =", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotEqualTo(Date value) {
            addCriterion("CREATEDATE <>", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThan(Date value) {
            addCriterion("CREATEDATE >", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATEDATE >=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThan(Date value) {
            addCriterion("CREATEDATE <", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThanOrEqualTo(Date value) {
            addCriterion("CREATEDATE <=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateIn(List<Date> values) {
            addCriterion("CREATEDATE in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotIn(List<Date> values) {
            addCriterion("CREATEDATE not in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateBetween(Date value1, Date value2) {
            addCriterion("CREATEDATE between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotBetween(Date value1, Date value2) {
            addCriterion("CREATEDATE not between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andFailurereasonIsNull() {
            addCriterion("FAILUREREASON is null");
            return (Criteria) this;
        }

        public Criteria andFailurereasonIsNotNull() {
            addCriterion("FAILUREREASON is not null");
            return (Criteria) this;
        }

        public Criteria andFailurereasonEqualTo(String value) {
            addCriterion("FAILUREREASON =", value, "failurereason");
            return (Criteria) this;
        }

        public Criteria andFailurereasonNotEqualTo(String value) {
            addCriterion("FAILUREREASON <>", value, "failurereason");
            return (Criteria) this;
        }

        public Criteria andFailurereasonGreaterThan(String value) {
            addCriterion("FAILUREREASON >", value, "failurereason");
            return (Criteria) this;
        }

        public Criteria andFailurereasonGreaterThanOrEqualTo(String value) {
            addCriterion("FAILUREREASON >=", value, "failurereason");
            return (Criteria) this;
        }

        public Criteria andFailurereasonLessThan(String value) {
            addCriterion("FAILUREREASON <", value, "failurereason");
            return (Criteria) this;
        }

        public Criteria andFailurereasonLessThanOrEqualTo(String value) {
            addCriterion("FAILUREREASON <=", value, "failurereason");
            return (Criteria) this;
        }

        public Criteria andFailurereasonLike(String value) {
            addCriterion("FAILUREREASON like", value, "failurereason");
            return (Criteria) this;
        }

        public Criteria andFailurereasonNotLike(String value) {
            addCriterion("FAILUREREASON not like", value, "failurereason");
            return (Criteria) this;
        }

        public Criteria andFailurereasonIn(List<String> values) {
            addCriterion("FAILUREREASON in", values, "failurereason");
            return (Criteria) this;
        }

        public Criteria andFailurereasonNotIn(List<String> values) {
            addCriterion("FAILUREREASON not in", values, "failurereason");
            return (Criteria) this;
        }

        public Criteria andFailurereasonBetween(String value1, String value2) {
            addCriterion("FAILUREREASON between", value1, value2, "failurereason");
            return (Criteria) this;
        }

        public Criteria andFailurereasonNotBetween(String value1, String value2) {
            addCriterion("FAILUREREASON not between", value1, value2, "failurereason");
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