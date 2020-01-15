package com.sinopharm.craw.entity;


import java.util.List;

/**
 * Order
 *
 * @author Sirius
 * @date 2018-12-25
 */
public class Order {

    /**
     * records : 1
     * total : 1
     * rows : [{"orderRemarks":null,"totalDetailCount":null,"orderDetailId":"181214172305663955604501","orderId":"181214172240718741618941","contractId":null,"addressId":null,"procurecatalogId":45,"goodsId":372712,"productName":"注射用阿扎胞苷","productSpelName":"ZSYAZBZ","productWbName":"itebrea","goodsName":"维达莎","medicinemodel":"冻干粉针剂","outlook":"100mg","factor":1,"materialName":"玻璃瓶","unit":"盒","minUnit":"瓶","companyNameSc":"Baxter Oncology GmbH","splitCompanyName":"","trustCompanyName":"","companyIdTb":"C002488","companyNameTb":"华润国康（北京）医药有限公司","middlePack":0,"maxPack":0,"isBaseDrug":0,"qualityLevel":"暂无","purchaseType":1,"sourceId":2,"sourceName":"国家及省谈判","bidPrice":1055,"usingRang":2,"hospitalId":"c2c4442b2a2e51b4d60de77d7f96d37f","hospitalName":"暨南大学附属第一医院(广州华侨医院）","hospitalDepartmentId":null,"hospitalDepartmentName":null,"adminAreaIdStatisticsDrug":null,"adminAreaNameDrug":"天河区","adminAreaIdDrug":440106,"belongOrgName":"暨南大学附属第一医院(广州华侨医院）","orderType":0,"orderName":"【Z】暨南大学附属第一医院(广州华侨医院）20181214172223","submitTime":1544779418000,"filingId":null,"companyIdPs":"C002234","companyNamePs":"国药控股广州有限公司","purchasePrice":1055,"purchaseCount":7,"purchaseAmount":7385,"isRead":1,"readUserId":"c06ecef2-eb53-4f39-ab63-63ada9898820","readUserName":"供应链部04(gkgzgyl04)","readTime":1545103101000,"confirmUserId":"","confirmUserName":"","confirmTime":null,"orderdetailState":1,"refuseReason":"","detailDistributeAddress":"华侨医院西药库，天河区黄埔大道西613号华侨医院西药库","totalDistributeCount":0,"totalDistributeAmount":0,"totalWarehouseCount":0,"totalWarehouseAmount":0,"totalReturnAmount":0,"totalReturnCount":0,"isUsing":1,"dealReason":"","addUserId":"0253d0dc-51a0-4d88-9db8-541c9f1607b6","addUserName":"暨南大学附属第一医院(广州华侨医院）(H0000165)","addTime":1544779385000,"lastUpdateUserId":"c06ecef2-eb53-4f39-ab63-63ada9898820","lastUpdateUserName":"供应链部04(gkgzgyl04)","lastUpdateTime":1545103101000,"isLongFiling":null,"goodDataStr":null,"sumPurchaseAmount":null,"allCount":null,"orderCustomInfo":null,"goodsNumber":null,"afterLinkagePrice":0,"medicarePaymentPrice":0,"hospitalOrderDetailId":null}]
     * page : 1
     * count : 20
     * firstResult : 0
     * maxResults : 20
     * success : false
     * result : null
     * conditions : {"orderType":"0","companyIdPs":"C002234","deliveryTimeNode":"2018-12-13","orderdetailStates":["1","2"]}
     * msg : null
     * form : null
     * code : 0
     * operCount : 0
     * sord :
     * sidx : submit_time desc,detail_distribute_address
     * orderby : submit_time desc,detail_distribute_address
     */

    private int records;
    private int total;
    private int page;
    private int count;
    private int firstResult;
    private int maxResults;
    private boolean success;
    private Object result;
    private ConditionsBean conditions;
    private Object msg;
    private Object form;
    private int code;
    private int operCount;
    private String sord;
    private String sidx;
    private String orderby;
    private List<RowsBean> rows;

    public int getRecords() {
        return records;
    }

    public void setRecords(int records) {
        this.records = records;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getFirstResult() {
        return firstResult;
    }

    public void setFirstResult(int firstResult) {
        this.firstResult = firstResult;
    }

    public int getMaxResults() {
        return maxResults;
    }

    public void setMaxResults(int maxResults) {
        this.maxResults = maxResults;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public ConditionsBean getConditions() {
        return conditions;
    }

    public void setConditions(ConditionsBean conditions) {
        this.conditions = conditions;
    }

    public Object getMsg() {
        return msg;
    }

    public void setMsg(Object msg) {
        this.msg = msg;
    }

    public Object getForm() {
        return form;
    }

    public void setForm(Object form) {
        this.form = form;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getOperCount() {
        return operCount;
    }

    public void setOperCount(int operCount) {
        this.operCount = operCount;
    }

    public String getSord() {
        return sord;
    }

    public void setSord(String sord) {
        this.sord = sord;
    }

    public String getSidx() {
        return sidx;
    }

    public void setSidx(String sidx) {
        this.sidx = sidx;
    }

    public String getOrderby() {
        return orderby;
    }

    public void setOrderby(String orderby) {
        this.orderby = orderby;
    }

    public List<RowsBean> getRows() {
        return rows;
    }

    public void setRows(List<RowsBean> rows) {
        this.rows = rows;
    }

    public static class ConditionsBean {
        /**
         * orderType : 0
         * companyIdPs : C002234
         * deliveryTimeNode : 2018-12-13
         * orderdetailStates : ["1","2"]
         */

        private String orderType;
        private String companyIdPs;
        private String deliveryTimeNode;
        private List<String> orderdetailStates;

        public String getOrderType() {
            return orderType;
        }

        public void setOrderType(String orderType) {
            this.orderType = orderType;
        }

        public String getCompanyIdPs() {
            return companyIdPs;
        }

        public void setCompanyIdPs(String companyIdPs) {
            this.companyIdPs = companyIdPs;
        }

        public String getDeliveryTimeNode() {
            return deliveryTimeNode;
        }

        public void setDeliveryTimeNode(String deliveryTimeNode) {
            this.deliveryTimeNode = deliveryTimeNode;
        }

        public List<String> getOrderdetailStates() {
            return orderdetailStates;
        }

        public void setOrderdetailStates(List<String> orderdetailStates) {
            this.orderdetailStates = orderdetailStates;
        }
    }

    public static class RowsBean {
        /**
         * orderRemarks : null
         * totalDetailCount : null
         * orderDetailId : 181214172305663955604501
         * orderId : 181214172240718741618941
         * contractId : null
         * addressId : null
         * procurecatalogId : 45
         * goodsId : 372712
         * productName : 注射用阿扎胞苷
         * productSpelName : ZSYAZBZ
         * productWbName : itebrea
         * goodsName : 维达莎
         * medicinemodel : 冻干粉针剂
         * outlook : 100mg
         * factor : 1
         * materialName : 玻璃瓶
         * unit : 盒
         * minUnit : 瓶
         * companyNameSc : Baxter Oncology GmbH
         * splitCompanyName :
         * trustCompanyName :
         * companyIdTb : C002488
         * companyNameTb : 华润国康（北京）医药有限公司
         * middlePack : 0
         * maxPack : 0
         * isBaseDrug : 0
         * qualityLevel : 暂无
         * purchaseType : 1
         * sourceId : 2
         * sourceName : 国家及省谈判
         * bidPrice : 1055.0
         * usingRang : 2
         * hospitalId : c2c4442b2a2e51b4d60de77d7f96d37f
         * hospitalName : 暨南大学附属第一医院(广州华侨医院）
         * hospitalDepartmentId : null
         * hospitalDepartmentName : null
         * adminAreaIdStatisticsDrug : null
         * adminAreaNameDrug : 天河区
         * adminAreaIdDrug : 440106
         * belongOrgName : 暨南大学附属第一医院(广州华侨医院）
         * orderType : 0
         * orderName : 【Z】暨南大学附属第一医院(广州华侨医院）20181214172223
         * submitTime : 1544779418000
         * filingId : null
         * companyIdPs : C002234
         * companyNamePs : 国药控股广州有限公司
         * purchasePrice : 1055.0
         * purchaseCount : 7
         * purchaseAmount : 7385.0
         * isRead : 1
         * readUserId : c06ecef2-eb53-4f39-ab63-63ada9898820
         * readUserName : 供应链部04(gkgzgyl04)
         * readTime : 1545103101000
         * confirmUserId :
         * confirmUserName :
         * confirmTime : null
         * orderdetailState : 1
         * refuseReason :
         * detailDistributeAddress : 华侨医院西药库，天河区黄埔大道西613号华侨医院西药库
         * totalDistributeCount : 0
         * totalDistributeAmount : 0.0
         * totalWarehouseCount : 0
         * totalWarehouseAmount : 0.0
         * totalReturnAmount : 0.0
         * totalReturnCount : 0
         * isUsing : 1
         * dealReason :
         * addUserId : 0253d0dc-51a0-4d88-9db8-541c9f1607b6
         * addUserName : 暨南大学附属第一医院(广州华侨医院）(H0000165)
         * addTime : 1544779385000
         * lastUpdateUserId : c06ecef2-eb53-4f39-ab63-63ada9898820
         * lastUpdateUserName : 供应链部04(gkgzgyl04)
         * lastUpdateTime : 1545103101000
         * isLongFiling : null
         * goodDataStr : null
         * sumPurchaseAmount : null
         * allCount : null
         * orderCustomInfo : null
         * goodsNumber : null
         * afterLinkagePrice : 0.0
         * medicarePaymentPrice : 0.0
         * hospitalOrderDetailId : null
         */

        private String orderRemarks;
        private Short totalDetailCount;
        private String orderDetailId;
        private String orderId;
        private String contractId;
        private String addressId;
        private int procurecatalogId;
        private int goodsId;
        private String productName;
        private String productSpelName;
        private String productWbName;
        private String goodsName;
        private String medicinemodel;
        private String outlook;
        private int factor;
        private String materialName;
        private String unit;
        private String minUnit;
        private String companyNameSc;
        private String splitCompanyName;
        private String trustCompanyName;
        private String companyIdTb;
        private String companyNameTb;
        private int middlePack;
        private int maxPack;
        private int isBaseDrug;
        private String qualityLevel;
        private int purchaseType;
        private int sourceId;
        private String sourceName;
        private double bidPrice;
        private int usingRang;
        private String hospitalId;
        private String hospitalName;
        private String hospitalDepartmentId;
        private String hospitalDepartmentName;
        private String adminAreaIdStatisticsDrug;
        private String adminAreaNameDrug;
        private int adminAreaIdDrug;
        private String belongOrgName;
        private int orderType;
        private String orderName;
        private long submitTime;
        private String filingId;
        private String companyIdPs;
        private String companyNamePs;
        private double purchasePrice;
        private int purchaseCount;
        private double purchaseAmount;
        private int isRead;
        private String readUserId;
        private String readUserName;
        private long readTime;
        private String confirmUserId;
        private String confirmUserName;
        private String confirmTime;
        private int orderdetailState;
        private String refuseReason;
        private String detailDistributeAddress;
        private int totalDistributeCount;
        private double totalDistributeAmount;
        private int totalWarehouseCount;
        private double totalWarehouseAmount;
        private double totalReturnAmount;
        private int totalReturnCount;
        private int isUsing;
        private String dealReason;
        private String addUserId;
        private String addUserName;
        private long addTime;
        private String lastUpdateUserId;
        private String lastUpdateUserName;
        private long lastUpdateTime;
        private String isLongFiling;
        private String goodDataStr;
        private String sumPurchaseAmount;
        private String allCount;
        private String orderCustomInfo;
        private String goodsNumber;
        private double afterLinkagePrice;
        private double medicarePaymentPrice;
        private String companyIdSc;
        private String hospitalOrderDetailId;

        public String getOrderRemarks() {
            return orderRemarks;
        }

        public void setOrderRemarks(String orderRemarks) {
            this.orderRemarks = orderRemarks;
        }

        public Short getTotalDetailCount() {
            return totalDetailCount;
        }

        public void setTotalDetailCount(Short totalDetailCount) {
            this.totalDetailCount = totalDetailCount;
        }

        public String getOrderDetailId() {
            return orderDetailId;
        }

        public void setOrderDetailId(String orderDetailId) {
            this.orderDetailId = orderDetailId;
        }

        public String getOrderId() {
            return orderId;
        }

        public void setOrderId(String orderId) {
            this.orderId = orderId;
        }

        public String getContractId() {
            return contractId;
        }

        public void setContractId(String contractId) {
            this.contractId = contractId;
        }

        public String getAddressId() {
            return addressId;
        }

        public void setAddressId(String addressId) {
            this.addressId = addressId;
        }

        public int getProcurecatalogId() {
            return procurecatalogId;
        }

        public void setProcurecatalogId(int procurecatalogId) {
            this.procurecatalogId = procurecatalogId;
        }

        public int getGoodsId() {
            return goodsId;
        }

        public void setGoodsId(int goodsId) {
            this.goodsId = goodsId;
        }

        public String getProductName() {
            return productName;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }

        public String getProductSpelName() {
            return productSpelName;
        }

        public void setProductSpelName(String productSpelName) {
            this.productSpelName = productSpelName;
        }

        public String getProductWbName() {
            return productWbName;
        }

        public void setProductWbName(String productWbName) {
            this.productWbName = productWbName;
        }

        public String getGoodsName() {
            return goodsName;
        }

        public void setGoodsName(String goodsName) {
            this.goodsName = goodsName;
        }

        public String getMedicinemodel() {
            return medicinemodel;
        }

        public void setMedicinemodel(String medicinemodel) {
            this.medicinemodel = medicinemodel;
        }

        public String getOutlook() {
            return outlook;
        }

        public void setOutlook(String outlook) {
            this.outlook = outlook;
        }

        public int getFactor() {
            return factor;
        }

        public void setFactor(int factor) {
            this.factor = factor;
        }

        public String getMaterialName() {
            return materialName;
        }

        public void setMaterialName(String materialName) {
            this.materialName = materialName;
        }

        public String getUnit() {
            return unit;
        }

        public void setUnit(String unit) {
            this.unit = unit;
        }

        public String getMinUnit() {
            return minUnit;
        }

        public void setMinUnit(String minUnit) {
            this.minUnit = minUnit;
        }

        public String getCompanyNameSc() {
            return companyNameSc;
        }

        public void setCompanyNameSc(String companyNameSc) {
            this.companyNameSc = companyNameSc;
        }

        public String getSplitCompanyName() {
            return splitCompanyName;
        }

        public void setSplitCompanyName(String splitCompanyName) {
            this.splitCompanyName = splitCompanyName;
        }

        public String getTrustCompanyName() {
            return trustCompanyName;
        }

        public void setTrustCompanyName(String trustCompanyName) {
            this.trustCompanyName = trustCompanyName;
        }

        public String getCompanyIdTb() {
            return companyIdTb;
        }

        public void setCompanyIdTb(String companyIdTb) {
            this.companyIdTb = companyIdTb;
        }

        public String getCompanyNameTb() {
            return companyNameTb;
        }

        public void setCompanyNameTb(String companyNameTb) {
            this.companyNameTb = companyNameTb;
        }

        public int getMiddlePack() {
            return middlePack;
        }

        public void setMiddlePack(int middlePack) {
            this.middlePack = middlePack;
        }

        public int getMaxPack() {
            return maxPack;
        }

        public void setMaxPack(int maxPack) {
            this.maxPack = maxPack;
        }

        public int getIsBaseDrug() {
            return isBaseDrug;
        }

        public void setIsBaseDrug(int isBaseDrug) {
            this.isBaseDrug = isBaseDrug;
        }

        public String getQualityLevel() {
            return qualityLevel;
        }

        public void setQualityLevel(String qualityLevel) {
            this.qualityLevel = qualityLevel;
        }

        public int getPurchaseType() {
            return purchaseType;
        }

        public void setPurchaseType(int purchaseType) {
            this.purchaseType = purchaseType;
        }

        public int getSourceId() {
            return sourceId;
        }

        public void setSourceId(int sourceId) {
            this.sourceId = sourceId;
        }

        public String getSourceName() {
            return sourceName;
        }

        public void setSourceName(String sourceName) {
            this.sourceName = sourceName;
        }

        public double getBidPrice() {
            return bidPrice;
        }

        public void setBidPrice(double bidPrice) {
            this.bidPrice = bidPrice;
        }

        public int getUsingRang() {
            return usingRang;
        }

        public void setUsingRang(int usingRang) {
            this.usingRang = usingRang;
        }

        public String getHospitalId() {
            return hospitalId;
        }

        public void setHospitalId(String hospitalId) {
            this.hospitalId = hospitalId;
        }

        public String getHospitalName() {
            return hospitalName;
        }

        public void setHospitalName(String hospitalName) {
            this.hospitalName = hospitalName;
        }

        public String getHospitalDepartmentId() {
            return hospitalDepartmentId;
        }

        public void setHospitalDepartmentId(String hospitalDepartmentId) {
            this.hospitalDepartmentId = hospitalDepartmentId;
        }

        public String getHospitalDepartmentName() {
            return hospitalDepartmentName;
        }

        public void setHospitalDepartmentName(String hospitalDepartmentName) {
            this.hospitalDepartmentName = hospitalDepartmentName;
        }

        public String getAdminAreaIdStatisticsDrug() {
            return adminAreaIdStatisticsDrug;
        }

        public void setAdminAreaIdStatisticsDrug(String adminAreaIdStatisticsDrug) {
            this.adminAreaIdStatisticsDrug = adminAreaIdStatisticsDrug;
        }

        public String getAdminAreaNameDrug() {
            return adminAreaNameDrug;
        }

        public void setAdminAreaNameDrug(String adminAreaNameDrug) {
            this.adminAreaNameDrug = adminAreaNameDrug;
        }

        public int getAdminAreaIdDrug() {
            return adminAreaIdDrug;
        }

        public void setAdminAreaIdDrug(int adminAreaIdDrug) {
            this.adminAreaIdDrug = adminAreaIdDrug;
        }

        public String getBelongOrgName() {
            return belongOrgName;
        }

        public void setBelongOrgName(String belongOrgName) {
            this.belongOrgName = belongOrgName;
        }

        public int getOrderType() {
            return orderType;
        }

        public void setOrderType(int orderType) {
            this.orderType = orderType;
        }

        public String getOrderName() {
            return orderName;
        }

        public void setOrderName(String orderName) {
            this.orderName = orderName;
        }

        public long getSubmitTime() {
            return submitTime;
        }

        public void setSubmitTime(long submitTime) {
            this.submitTime = submitTime;
        }

        public String getFilingId() {
            return filingId;
        }

        public void setFilingId(String filingId) {
            this.filingId = filingId;
        }

        public String getCompanyIdPs() {
            return companyIdPs;
        }

        public void setCompanyIdPs(String companyIdPs) {
            this.companyIdPs = companyIdPs;
        }

        public String getCompanyNamePs() {
            return companyNamePs;
        }

        public void setCompanyNamePs(String companyNamePs) {
            this.companyNamePs = companyNamePs;
        }

        public double getPurchasePrice() {
            return purchasePrice;
        }

        public void setPurchasePrice(double purchasePrice) {
            this.purchasePrice = purchasePrice;
        }

        public int getPurchaseCount() {
            return purchaseCount;
        }

        public void setPurchaseCount(int purchaseCount) {
            this.purchaseCount = purchaseCount;
        }

        public double getPurchaseAmount() {
            return purchaseAmount;
        }

        public void setPurchaseAmount(double purchaseAmount) {
            this.purchaseAmount = purchaseAmount;
        }

        public int getIsRead() {
            return isRead;
        }

        public void setIsRead(int isRead) {
            this.isRead = isRead;
        }

        public String getReadUserId() {
            return readUserId;
        }

        public void setReadUserId(String readUserId) {
            this.readUserId = readUserId;
        }

        public String getReadUserName() {
            return readUserName;
        }

        public void setReadUserName(String readUserName) {
            this.readUserName = readUserName;
        }

        public long getReadTime() {
            return readTime;
        }

        public void setReadTime(long readTime) {
            this.readTime = readTime;
        }

        public String getConfirmUserId() {
            return confirmUserId;
        }

        public void setConfirmUserId(String confirmUserId) {
            this.confirmUserId = confirmUserId;
        }

        public String getConfirmUserName() {
            return confirmUserName;
        }

        public void setConfirmUserName(String confirmUserName) {
            this.confirmUserName = confirmUserName;
        }

        public String getConfirmTime() {
            return confirmTime;
        }

        public void setConfirmTime(String confirmTime) {
            this.confirmTime = confirmTime;
        }

        public int getOrderdetailState() {
            return orderdetailState;
        }

        public void setOrderdetailState(int orderdetailState) {
            this.orderdetailState = orderdetailState;
        }

        public String getRefuseReason() {
            return refuseReason;
        }

        public void setRefuseReason(String refuseReason) {
            this.refuseReason = refuseReason;
        }

        public String getDetailDistributeAddress() {
            return detailDistributeAddress;
        }

        public void setDetailDistributeAddress(String detailDistributeAddress) {
            this.detailDistributeAddress = detailDistributeAddress;
        }

        public int getTotalDistributeCount() {
            return totalDistributeCount;
        }

        public void setTotalDistributeCount(int totalDistributeCount) {
            this.totalDistributeCount = totalDistributeCount;
        }

        public double getTotalDistributeAmount() {
            return totalDistributeAmount;
        }

        public void setTotalDistributeAmount(double totalDistributeAmount) {
            this.totalDistributeAmount = totalDistributeAmount;
        }

        public int getTotalWarehouseCount() {
            return totalWarehouseCount;
        }

        public void setTotalWarehouseCount(int totalWarehouseCount) {
            this.totalWarehouseCount = totalWarehouseCount;
        }

        public double getTotalWarehouseAmount() {
            return totalWarehouseAmount;
        }

        public void setTotalWarehouseAmount(double totalWarehouseAmount) {
            this.totalWarehouseAmount = totalWarehouseAmount;
        }

        public double getTotalReturnAmount() {
            return totalReturnAmount;
        }

        public void setTotalReturnAmount(double totalReturnAmount) {
            this.totalReturnAmount = totalReturnAmount;
        }

        public int getTotalReturnCount() {
            return totalReturnCount;
        }

        public void setTotalReturnCount(int totalReturnCount) {
            this.totalReturnCount = totalReturnCount;
        }

        public int getIsUsing() {
            return isUsing;
        }

        public void setIsUsing(int isUsing) {
            this.isUsing = isUsing;
        }

        public String getDealReason() {
            return dealReason;
        }

        public void setDealReason(String dealReason) {
            this.dealReason = dealReason;
        }

        public String getAddUserId() {
            return addUserId;
        }

        public void setAddUserId(String addUserId) {
            this.addUserId = addUserId;
        }

        public String getAddUserName() {
            return addUserName;
        }

        public void setAddUserName(String addUserName) {
            this.addUserName = addUserName;
        }

        public long getAddTime() {
            return addTime;
        }

        public void setAddTime(long addTime) {
            this.addTime = addTime;
        }

        public String getLastUpdateUserId() {
            return lastUpdateUserId;
        }

        public void setLastUpdateUserId(String lastUpdateUserId) {
            this.lastUpdateUserId = lastUpdateUserId;
        }

        public String getLastUpdateUserName() {
            return lastUpdateUserName;
        }

        public void setLastUpdateUserName(String lastUpdateUserName) {
            this.lastUpdateUserName = lastUpdateUserName;
        }

        public long getLastUpdateTime() {
            return lastUpdateTime;
        }

        public void setLastUpdateTime(long lastUpdateTime) {
            this.lastUpdateTime = lastUpdateTime;
        }

        public String getIsLongFiling() {
            return isLongFiling;
        }

        public void setIsLongFiling(String isLongFiling) {
            this.isLongFiling = isLongFiling;
        }

        public String getGoodDataStr() {
            return goodDataStr;
        }

        public void setGoodDataStr(String goodDataStr) {
            this.goodDataStr = goodDataStr;
        }

        public String getSumPurchaseAmount() {
            return sumPurchaseAmount;
        }

        public void setSumPurchaseAmount(String sumPurchaseAmount) {
            this.sumPurchaseAmount = sumPurchaseAmount;
        }

        public String getAllCount() {
            return allCount;
        }

        public void setAllCount(String allCount) {
            this.allCount = allCount;
        }

        public String getOrderCustomInfo() {
            return orderCustomInfo;
        }

        public void setOrderCustomInfo(String orderCustomInfo) {
            this.orderCustomInfo = orderCustomInfo;
        }

        public String getGoodsNumber() {
            return goodsNumber;
        }

        public void setGoodsNumber(String goodsNumber) {
            this.goodsNumber = goodsNumber;
        }

        public double getAfterLinkagePrice() {
            return afterLinkagePrice;
        }

        public void setAfterLinkagePrice(double afterLinkagePrice) {
            this.afterLinkagePrice = afterLinkagePrice;
        }

        public double getMedicarePaymentPrice() {
            return medicarePaymentPrice;
        }

        public void setMedicarePaymentPrice(double medicarePaymentPrice) {
            this.medicarePaymentPrice = medicarePaymentPrice;
        }

        public String getHospitalOrderDetailId() {
            return hospitalOrderDetailId;
        }

        public void setHospitalOrderDetailId(String hospitalOrderDetailId) {
            this.hospitalOrderDetailId = hospitalOrderDetailId;
        }

        public String getCompanyIdSc() {
            return companyIdSc;
        }

        public void setCompanyIdSc(String companyIdSc) {
            this.companyIdSc = companyIdSc;
        }
    }
}
