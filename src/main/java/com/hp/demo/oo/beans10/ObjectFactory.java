
package com.hp.demo.oo.beans10;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.hp.demo.oo.beans10 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ParallelMultiStepTypeStartStepsRefId_QNAME = new QName("", "refId");
    private final static QName _SelectLineFilter_QNAME = new QName("", "selectLineFilter");
    private final static QName _BaseFilter_QNAME = new QName("", "baseFilter");
    private final static QName _SortFilter_QNAME = new QName("", "sortFilter");
    private final static QName _ReplaceAllFilter_QNAME = new QName("", "replaceAllFilter");
    private final static QName _BaseResponse_QNAME = new QName("", "baseResponse");
    private final static QName _SelectionList_QNAME = new QName("", "selectionList");
    private final static QName _Flow_QNAME = new QName("", "flow");
    private final static QName _RegexEvaluator_QNAME = new QName("", "regexEvaluator");
    private final static QName _Identity_QNAME = new QName("", "identity");
    private final static QName _Operation_QNAME = new QName("", "operation");
    private final static QName _ContainsEvaluator_QNAME = new QName("", "containsEvaluator");
    private final static QName _StripWhitespaceFilter_QNAME = new QName("", "stripWhitespaceFilter");
    private final static QName _ReferenceFilter_QNAME = new QName("", "referenceFilter");
    private final static QName _CaseFilter_QNAME = new QName("", "caseFilter");
    private final static QName _RemoveDuplicatesFilter_QNAME = new QName("", "removeDuplicatesFilter");
    private final static QName _DomainTerm_QNAME = new QName("", "domainTerm");
    private final static QName _SelectRangeFilter_QNAME = new QName("", "selectRangeFilter");
    private final static QName _XmlGetAttributeFilter_QNAME = new QName("", "xmlGetAttributeFilter");
    private final static QName _RoleAlias_QNAME = new QName("", "roleAlias");
    private final static QName _XmlGetElementValueFilter_QNAME = new QName("", "xmlGetElementValueFilter");
    private final static QName _ScriptletFilter_QNAME = new QName("", "scriptletFilter");
    private final static QName _TableFilter_QNAME = new QName("", "tableFilter");
    private final static QName _ScriptletEvaluator_QNAME = new QName("", "scriptletEvaluator");
    private final static QName _Compare_QNAME = new QName("", "compare");
    private final static QName _DoneResponse_QNAME = new QName("", "doneResponse");
    private final static QName _Concat_QNAME = new QName("", "concat");
    private final static QName _SystemProperty_QNAME = new QName("", "systemProperty");
    private final static QName _Scriptlet_QNAME = new QName("", "scriptlet");
    private final static QName _RegexFilter_QNAME = new QName("", "regexFilter");
    private final static QName _GroupAlias_QNAME = new QName("", "groupAlias");
    private final static QName _NumberFilter_QNAME = new QName("", "numberFilter");
    private final static QName _Category_QNAME = new QName("", "category");
    private final static QName _CountLinesFilter_QNAME = new QName("", "countLinesFilter");
    private final static QName _StripTrailingFilter_QNAME = new QName("", "stripTrailingFilter");
    private final static QName _XmlGetElementsFilter_QNAME = new QName("", "xmlGetElementsFilter");
    private final static QName _RoundingFilter_QNAME = new QName("", "roundingFilter");
    private final static QName _Group_QNAME = new QName("", "group");
    private final static QName _XpathFilter_QNAME = new QName("", "xpathFilter");
    private final static QName _EndBranchStepTypeAssignmentsFlowVariableAssignment_QNAME = new QName("", "flowVariableAssignment");
    private final static QName _PropertiesTypeEntry_QNAME = new QName("", "entry");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.hp.demo.oo.beans10
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ParallelMultiStepType }
     * 
     */
    public ParallelMultiStepType createParallelMultiStepType() {
        return new ParallelMultiStepType();
    }

    /**
     * Create an instance of {@link EndBranchStepType }
     * 
     */
    public EndBranchStepType createEndBranchStepType() {
        return new EndBranchStepType();
    }

    /**
     * Create an instance of {@link MultiInstanceStepType }
     * 
     */
    public MultiInstanceStepType createMultiInstanceStepType() {
        return new MultiInstanceStepType();
    }

    /**
     * Create an instance of {@link RegularStepType }
     * 
     */
    public RegularStepType createRegularStepType() {
        return new RegularStepType();
    }

    /**
     * Create an instance of {@link ReturnStepType }
     * 
     */
    public ReturnStepType createReturnStepType() {
        return new ReturnStepType();
    }

    /**
     * Create an instance of {@link ParallelLaneType }
     * 
     */
    public ParallelLaneType createParallelLaneType() {
        return new ParallelLaneType();
    }

    /**
     * Create an instance of {@link Proxy }
     * 
     */
    public Proxy createProxy() {
        return new Proxy();
    }

    /**
     * Create an instance of {@link CalloutsType }
     * 
     */
    public CalloutsType createCalloutsType() {
        return new CalloutsType();
    }

    /**
     * Create an instance of {@link CalloutsType.Callout }
     * 
     */
    public CalloutsType.Callout createCalloutsTypeCallout() {
        return new CalloutsType.Callout();
    }

    /**
     * Create an instance of {@link DomainTermType }
     * 
     */
    public DomainTermType createDomainTermType() {
        return new DomainTermType();
    }

    /**
     * Create an instance of {@link DomainTermType.Storage }
     * 
     */
    public DomainTermType.Storage createDomainTermTypeStorage() {
        return new DomainTermType.Storage();
    }

    /**
     * Create an instance of {@link SelectionListType }
     * 
     */
    public SelectionListType createSelectionListType() {
        return new SelectionListType();
    }

    /**
     * Create an instance of {@link SelectLineFilterType }
     * 
     */
    public SelectLineFilterType createSelectLineFilterType() {
        return new SelectLineFilterType();
    }

    /**
     * Create an instance of {@link BaseFilterType }
     * 
     */
    public BaseFilterType createBaseFilterType() {
        return new BaseFilterType();
    }

    /**
     * Create an instance of {@link SortFilterType }
     * 
     */
    public SortFilterType createSortFilterType() {
        return new SortFilterType();
    }

    /**
     * Create an instance of {@link ReplaceAllFilterType }
     * 
     */
    public ReplaceAllFilterType createReplaceAllFilterType() {
        return new ReplaceAllFilterType();
    }

    /**
     * Create an instance of {@link BaseResponseType }
     * 
     */
    public BaseResponseType createBaseResponseType() {
        return new BaseResponseType();
    }

    /**
     * Create an instance of {@link FlowType }
     * 
     */
    public FlowType createFlowType() {
        return new FlowType();
    }

    /**
     * Create an instance of {@link RegexEvaluatorType }
     * 
     */
    public RegexEvaluatorType createRegexEvaluatorType() {
        return new RegexEvaluatorType();
    }

    /**
     * Create an instance of {@link OperationType }
     * 
     */
    public OperationType createOperationType() {
        return new OperationType();
    }

    /**
     * Create an instance of {@link SystemAccountType }
     * 
     */
    public SystemAccountType createSystemAccountType() {
        return new SystemAccountType();
    }

    /**
     * Create an instance of {@link ReferenceFilterType }
     * 
     */
    public ReferenceFilterType createReferenceFilterType() {
        return new ReferenceFilterType();
    }

    /**
     * Create an instance of {@link StripWhitespaceFilterType }
     * 
     */
    public StripWhitespaceFilterType createStripWhitespaceFilterType() {
        return new StripWhitespaceFilterType();
    }

    /**
     * Create an instance of {@link ContainsEvaluatorType }
     * 
     */
    public ContainsEvaluatorType createContainsEvaluatorType() {
        return new ContainsEvaluatorType();
    }

    /**
     * Create an instance of {@link CaseFilterType }
     * 
     */
    public CaseFilterType createCaseFilterType() {
        return new CaseFilterType();
    }

    /**
     * Create an instance of {@link RemoveDuplicatesFilterType }
     * 
     */
    public RemoveDuplicatesFilterType createRemoveDuplicatesFilterType() {
        return new RemoveDuplicatesFilterType();
    }

    /**
     * Create an instance of {@link SelectRangeFilterType }
     * 
     */
    public SelectRangeFilterType createSelectRangeFilterType() {
        return new SelectRangeFilterType();
    }

    /**
     * Create an instance of {@link XmlGetAttributeFilterType }
     * 
     */
    public XmlGetAttributeFilterType createXmlGetAttributeFilterType() {
        return new XmlGetAttributeFilterType();
    }

    /**
     * Create an instance of {@link RoleType }
     * 
     */
    public RoleType createRoleType() {
        return new RoleType();
    }

    /**
     * Create an instance of {@link XmlGetElementValueFilterType }
     * 
     */
    public XmlGetElementValueFilterType createXmlGetElementValueFilterType() {
        return new XmlGetElementValueFilterType();
    }

    /**
     * Create an instance of {@link ScriptletFilterType }
     * 
     */
    public ScriptletFilterType createScriptletFilterType() {
        return new ScriptletFilterType();
    }

    /**
     * Create an instance of {@link TableFilterType }
     * 
     */
    public TableFilterType createTableFilterType() {
        return new TableFilterType();
    }

    /**
     * Create an instance of {@link ScriptletEvaluatorType }
     * 
     */
    public ScriptletEvaluatorType createScriptletEvaluatorType() {
        return new ScriptletEvaluatorType();
    }

    /**
     * Create an instance of {@link CompareType }
     * 
     */
    public CompareType createCompareType() {
        return new CompareType();
    }

    /**
     * Create an instance of {@link DoneResponseType }
     * 
     */
    public DoneResponseType createDoneResponseType() {
        return new DoneResponseType();
    }

    /**
     * Create an instance of {@link ConcatType }
     * 
     */
    public ConcatType createConcatType() {
        return new ConcatType();
    }

    /**
     * Create an instance of {@link SystemPropertyType }
     * 
     */
    public SystemPropertyType createSystemPropertyType() {
        return new SystemPropertyType();
    }

    /**
     * Create an instance of {@link ScriptletType }
     * 
     */
    public ScriptletType createScriptletType() {
        return new ScriptletType();
    }

    /**
     * Create an instance of {@link GroupAliasType }
     * 
     */
    public GroupAliasType createGroupAliasType() {
        return new GroupAliasType();
    }

    /**
     * Create an instance of {@link RegexFilterType }
     * 
     */
    public RegexFilterType createRegexFilterType() {
        return new RegexFilterType();
    }

    /**
     * Create an instance of {@link CategoryType }
     * 
     */
    public CategoryType createCategoryType() {
        return new CategoryType();
    }

    /**
     * Create an instance of {@link NumberFilterType }
     * 
     */
    public NumberFilterType createNumberFilterType() {
        return new NumberFilterType();
    }

    /**
     * Create an instance of {@link CountLinesFilterType }
     * 
     */
    public CountLinesFilterType createCountLinesFilterType() {
        return new CountLinesFilterType();
    }

    /**
     * Create an instance of {@link XmlGetElementsFilterType }
     * 
     */
    public XmlGetElementsFilterType createXmlGetElementsFilterType() {
        return new XmlGetElementsFilterType();
    }

    /**
     * Create an instance of {@link StripTrailingFilterType }
     * 
     */
    public StripTrailingFilterType createStripTrailingFilterType() {
        return new StripTrailingFilterType();
    }

    /**
     * Create an instance of {@link RoundingFilterType }
     * 
     */
    public RoundingFilterType createRoundingFilterType() {
        return new RoundingFilterType();
    }

    /**
     * Create an instance of {@link GroupType }
     * 
     */
    public GroupType createGroupType() {
        return new GroupType();
    }

    /**
     * Create an instance of {@link XpathFilterType }
     * 
     */
    public XpathFilterType createXpathFilterType() {
        return new XpathFilterType();
    }

    /**
     * Create an instance of {@link ExpressionType }
     * 
     */
    public ExpressionType createExpressionType() {
        return new ExpressionType();
    }

    /**
     * Create an instance of {@link IconListType }
     * 
     */
    public IconListType createIconListType() {
        return new IconListType();
    }

    /**
     * Create an instance of {@link CompareResponseType }
     * 
     */
    public CompareResponseType createCompareResponseType() {
        return new CompareResponseType();
    }

    /**
     * Create an instance of {@link TransitionType }
     * 
     */
    public TransitionType createTransitionType() {
        return new TransitionType();
    }

    /**
     * Create an instance of {@link LoggedUserIdentityBindingType }
     * 
     */
    public LoggedUserIdentityBindingType createLoggedUserIdentityBindingType() {
        return new LoggedUserIdentityBindingType();
    }

    /**
     * Create an instance of {@link FieldValuesType }
     * 
     */
    public FieldValuesType createFieldValuesType() {
        return new FieldValuesType();
    }

    /**
     * Create an instance of {@link ResponseType }
     * 
     */
    public ResponseType createResponseType() {
        return new ResponseType();
    }

    /**
     * Create an instance of {@link AssignmentsType }
     * 
     */
    public AssignmentsType createAssignmentsType() {
        return new AssignmentsType();
    }

    /**
     * Create an instance of {@link RevisionType }
     * 
     */
    public RevisionType createRevisionType() {
        return new RevisionType();
    }

    /**
     * Create an instance of {@link LanesType }
     * 
     */
    public LanesType createLanesType() {
        return new LanesType();
    }

    /**
     * Create an instance of {@link FlowVariableAssignmentType }
     * 
     */
    public FlowVariableAssignmentType createFlowVariableAssignmentType() {
        return new FlowVariableAssignmentType();
    }

    /**
     * Create an instance of {@link PossibleResponsesType }
     * 
     */
    public PossibleResponsesType createPossibleResponsesType() {
        return new PossibleResponsesType();
    }

    /**
     * Create an instance of {@link FiltersType }
     * 
     */
    public FiltersType createFiltersType() {
        return new FiltersType();
    }

    /**
     * Create an instance of {@link ContainsResponseType }
     * 
     */
    public ContainsResponseType createContainsResponseType() {
        return new ContainsResponseType();
    }

    /**
     * Create an instance of {@link StepsType }
     * 
     */
    public StepsType createStepsType() {
        return new StepsType();
    }

    /**
     * Create an instance of {@link ScriptletResponseType }
     * 
     */
    public ScriptletResponseType createScriptletResponseType() {
        return new ScriptletResponseType();
    }

    /**
     * Create an instance of {@link UserInputBindingType }
     * 
     */
    public UserInputBindingType createUserInputBindingType() {
        return new UserInputBindingType();
    }

    /**
     * Create an instance of {@link ResultBindingType }
     * 
     */
    public ResultBindingType createResultBindingType() {
        return new ResultBindingType();
    }

    /**
     * Create an instance of {@link ContextBindingType }
     * 
     */
    public ContextBindingType createContextBindingType() {
        return new ContextBindingType();
    }

    /**
     * Create an instance of {@link ActionPluginType }
     * 
     */
    public ActionPluginType createActionPluginType() {
        return new ActionPluginType();
    }

    /**
     * Create an instance of {@link ResultExpressionType }
     * 
     */
    public ResultExpressionType createResultExpressionType() {
        return new ResultExpressionType();
    }

    /**
     * Create an instance of {@link BindingsType }
     * 
     */
    public BindingsType createBindingsType() {
        return new BindingsType();
    }

    /**
     * Create an instance of {@link RefIdType }
     * 
     */
    public RefIdType createRefIdType() {
        return new RefIdType();
    }

    /**
     * Create an instance of {@link PropertiesType }
     * 
     */
    public PropertiesType createPropertiesType() {
        return new PropertiesType();
    }

    /**
     * Create an instance of {@link IdentityBindingType }
     * 
     */
    public IdentityBindingType createIdentityBindingType() {
        return new IdentityBindingType();
    }

    /**
     * Create an instance of {@link ProxyEntryType }
     * 
     */
    public ProxyEntryType createProxyEntryType() {
        return new ProxyEntryType();
    }

    /**
     * Create an instance of {@link DestinationType }
     * 
     */
    public DestinationType createDestinationType() {
        return new DestinationType();
    }

    /**
     * Create an instance of {@link RegexResponseType }
     * 
     */
    public RegexResponseType createRegexResponseType() {
        return new RegexResponseType();
    }

    /**
     * Create an instance of {@link OpResponseType }
     * 
     */
    public OpResponseType createOpResponseType() {
        return new OpResponseType();
    }

    /**
     * Create an instance of {@link RevisionsType }
     * 
     */
    public RevisionsType createRevisionsType() {
        return new RevisionsType();
    }

    /**
     * Create an instance of {@link PointListType }
     * 
     */
    public PointListType createPointListType() {
        return new PointListType();
    }

    /**
     * Create an instance of {@link CategoriesType }
     * 
     */
    public CategoriesType createCategoriesType() {
        return new CategoriesType();
    }

    /**
     * Create an instance of {@link PointType }
     * 
     */
    public PointType createPointType() {
        return new PointType();
    }

    /**
     * Create an instance of {@link StaticBindingType }
     * 
     */
    public StaticBindingType createStaticBindingType() {
        return new StaticBindingType();
    }

    /**
     * Create an instance of {@link ModelValueType }
     * 
     */
    public ModelValueType createModelValueType() {
        return new ModelValueType();
    }

    /**
     * Create an instance of {@link AvailableResultExpressionsType }
     * 
     */
    public AvailableResultExpressionsType createAvailableResultExpressionsType() {
        return new AvailableResultExpressionsType();
    }

    /**
     * Create an instance of {@link PositionType }
     * 
     */
    public PositionType createPositionType() {
        return new PositionType();
    }

    /**
     * Create an instance of {@link ProxyHeadersType }
     * 
     */
    public ProxyHeadersType createProxyHeadersType() {
        return new ProxyHeadersType();
    }

    /**
     * Create an instance of {@link EntryPropertyType }
     * 
     */
    public EntryPropertyType createEntryPropertyType() {
        return new EntryPropertyType();
    }

    /**
     * Create an instance of {@link ReferenceResponseType }
     * 
     */
    public ReferenceResponseType createReferenceResponseType() {
        return new ReferenceResponseType();
    }

    /**
     * Create an instance of {@link BoundsType }
     * 
     */
    public BoundsType createBoundsType() {
        return new BoundsType();
    }

    /**
     * Create an instance of {@link TransitionsType }
     * 
     */
    public TransitionsType createTransitionsType() {
        return new TransitionsType();
    }

    /**
     * Create an instance of {@link ResultExpressionTypeSet }
     * 
     */
    public ResultExpressionTypeSet createResultExpressionTypeSet() {
        return new ResultExpressionTypeSet();
    }

    /**
     * Create an instance of {@link EntryType }
     * 
     */
    public EntryType createEntryType() {
        return new EntryType();
    }

    /**
     * Create an instance of {@link IconSpecType }
     * 
     */
    public IconSpecType createIconSpecType() {
        return new IconSpecType();
    }

    /**
     * Create an instance of {@link ParallelMultiStepType.Assignments }
     * 
     */
    public ParallelMultiStepType.Assignments createParallelMultiStepTypeAssignments() {
        return new ParallelMultiStepType.Assignments();
    }

    /**
     * Create an instance of {@link ParallelMultiStepType.StartSteps }
     * 
     */
    public ParallelMultiStepType.StartSteps createParallelMultiStepTypeStartSteps() {
        return new ParallelMultiStepType.StartSteps();
    }

    /**
     * Create an instance of {@link EndBranchStepType.Assignments }
     * 
     */
    public EndBranchStepType.Assignments createEndBranchStepTypeAssignments() {
        return new EndBranchStepType.Assignments();
    }

    /**
     * Create an instance of {@link MultiInstanceStepType.StartSteps }
     * 
     */
    public MultiInstanceStepType.StartSteps createMultiInstanceStepTypeStartSteps() {
        return new MultiInstanceStepType.StartSteps();
    }

    /**
     * Create an instance of {@link MultiInstanceStepType.Assignments }
     * 
     */
    public MultiInstanceStepType.Assignments createMultiInstanceStepTypeAssignments() {
        return new MultiInstanceStepType.Assignments();
    }

    /**
     * Create an instance of {@link RegularStepType.Assignments }
     * 
     */
    public RegularStepType.Assignments createRegularStepTypeAssignments() {
        return new RegularStepType.Assignments();
    }

    /**
     * Create an instance of {@link ReturnStepType.Assignments }
     * 
     */
    public ReturnStepType.Assignments createReturnStepTypeAssignments() {
        return new ReturnStepType.Assignments();
    }

    /**
     * Create an instance of {@link ParallelLaneType.ParallelSteps }
     * 
     */
    public ParallelLaneType.ParallelSteps createParallelLaneTypeParallelSteps() {
        return new ParallelLaneType.ParallelSteps();
    }

    /**
     * Create an instance of {@link Proxy.ProxyInformation }
     * 
     */
    public Proxy.ProxyInformation createProxyProxyInformation() {
        return new Proxy.ProxyInformation();
    }

    /**
     * Create an instance of {@link CalloutsType.Callout.Step }
     * 
     */
    public CalloutsType.Callout.Step createCalloutsTypeCalloutStep() {
        return new CalloutsType.Callout.Step();
    }

    /**
     * Create an instance of {@link DomainTermType.Storage.DomainTermValue }
     * 
     */
    public DomainTermType.Storage.DomainTermValue createDomainTermTypeStorageDomainTermValue() {
        return new DomainTermType.Storage.DomainTermValue();
    }

    /**
     * Create an instance of {@link SelectionListType.Storage }
     * 
     */
    public SelectionListType.Storage createSelectionListTypeStorage() {
        return new SelectionListType.Storage();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "refId", scope = ParallelMultiStepType.StartSteps.class)
    public JAXBElement<String> createParallelMultiStepTypeStartStepsRefId(String value) {
        return new JAXBElement<String>(_ParallelMultiStepTypeStartStepsRefId_QNAME, String.class, ParallelMultiStepType.StartSteps.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectLineFilterType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "selectLineFilter", substitutionHeadNamespace = "", substitutionHeadName = "baseFilter")
    public JAXBElement<SelectLineFilterType> createSelectLineFilter(SelectLineFilterType value) {
        return new JAXBElement<SelectLineFilterType>(_SelectLineFilter_QNAME, SelectLineFilterType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseFilterType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "baseFilter")
    public JAXBElement<BaseFilterType> createBaseFilter(BaseFilterType value) {
        return new JAXBElement<BaseFilterType>(_BaseFilter_QNAME, BaseFilterType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SortFilterType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "sortFilter", substitutionHeadNamespace = "", substitutionHeadName = "baseFilter")
    public JAXBElement<SortFilterType> createSortFilter(SortFilterType value) {
        return new JAXBElement<SortFilterType>(_SortFilter_QNAME, SortFilterType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReplaceAllFilterType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "replaceAllFilter", substitutionHeadNamespace = "", substitutionHeadName = "baseFilter")
    public JAXBElement<ReplaceAllFilterType> createReplaceAllFilter(ReplaceAllFilterType value) {
        return new JAXBElement<ReplaceAllFilterType>(_ReplaceAllFilter_QNAME, ReplaceAllFilterType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "baseResponse")
    public JAXBElement<BaseResponseType> createBaseResponse(BaseResponseType value) {
        return new JAXBElement<BaseResponseType>(_BaseResponse_QNAME, BaseResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectionListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "selectionList")
    public JAXBElement<SelectionListType> createSelectionList(SelectionListType value) {
        return new JAXBElement<SelectionListType>(_SelectionList_QNAME, SelectionListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlowType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "flow")
    public JAXBElement<FlowType> createFlow(FlowType value) {
        return new JAXBElement<FlowType>(_Flow_QNAME, FlowType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegexEvaluatorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "regexEvaluator")
    public JAXBElement<RegexEvaluatorType> createRegexEvaluator(RegexEvaluatorType value) {
        return new JAXBElement<RegexEvaluatorType>(_RegexEvaluator_QNAME, RegexEvaluatorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SystemAccountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "identity")
    public JAXBElement<SystemAccountType> createIdentity(SystemAccountType value) {
        return new JAXBElement<SystemAccountType>(_Identity_QNAME, SystemAccountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "operation")
    public JAXBElement<OperationType> createOperation(OperationType value) {
        return new JAXBElement<OperationType>(_Operation_QNAME, OperationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContainsEvaluatorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "containsEvaluator")
    public JAXBElement<ContainsEvaluatorType> createContainsEvaluator(ContainsEvaluatorType value) {
        return new JAXBElement<ContainsEvaluatorType>(_ContainsEvaluator_QNAME, ContainsEvaluatorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StripWhitespaceFilterType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "stripWhitespaceFilter", substitutionHeadNamespace = "", substitutionHeadName = "baseFilter")
    public JAXBElement<StripWhitespaceFilterType> createStripWhitespaceFilter(StripWhitespaceFilterType value) {
        return new JAXBElement<StripWhitespaceFilterType>(_StripWhitespaceFilter_QNAME, StripWhitespaceFilterType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReferenceFilterType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "referenceFilter", substitutionHeadNamespace = "", substitutionHeadName = "baseFilter")
    public JAXBElement<ReferenceFilterType> createReferenceFilter(ReferenceFilterType value) {
        return new JAXBElement<ReferenceFilterType>(_ReferenceFilter_QNAME, ReferenceFilterType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CaseFilterType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "caseFilter", substitutionHeadNamespace = "", substitutionHeadName = "baseFilter")
    public JAXBElement<CaseFilterType> createCaseFilter(CaseFilterType value) {
        return new JAXBElement<CaseFilterType>(_CaseFilter_QNAME, CaseFilterType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveDuplicatesFilterType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "removeDuplicatesFilter", substitutionHeadNamespace = "", substitutionHeadName = "baseFilter")
    public JAXBElement<RemoveDuplicatesFilterType> createRemoveDuplicatesFilter(RemoveDuplicatesFilterType value) {
        return new JAXBElement<RemoveDuplicatesFilterType>(_RemoveDuplicatesFilter_QNAME, RemoveDuplicatesFilterType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DomainTermType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "domainTerm")
    public JAXBElement<DomainTermType> createDomainTerm(DomainTermType value) {
        return new JAXBElement<DomainTermType>(_DomainTerm_QNAME, DomainTermType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectRangeFilterType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "selectRangeFilter", substitutionHeadNamespace = "", substitutionHeadName = "baseFilter")
    public JAXBElement<SelectRangeFilterType> createSelectRangeFilter(SelectRangeFilterType value) {
        return new JAXBElement<SelectRangeFilterType>(_SelectRangeFilter_QNAME, SelectRangeFilterType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XmlGetAttributeFilterType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "xmlGetAttributeFilter", substitutionHeadNamespace = "", substitutionHeadName = "baseFilter")
    public JAXBElement<XmlGetAttributeFilterType> createXmlGetAttributeFilter(XmlGetAttributeFilterType value) {
        return new JAXBElement<XmlGetAttributeFilterType>(_XmlGetAttributeFilter_QNAME, XmlGetAttributeFilterType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoleType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "roleAlias")
    public JAXBElement<RoleType> createRoleAlias(RoleType value) {
        return new JAXBElement<RoleType>(_RoleAlias_QNAME, RoleType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XmlGetElementValueFilterType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "xmlGetElementValueFilter", substitutionHeadNamespace = "", substitutionHeadName = "baseFilter")
    public JAXBElement<XmlGetElementValueFilterType> createXmlGetElementValueFilter(XmlGetElementValueFilterType value) {
        return new JAXBElement<XmlGetElementValueFilterType>(_XmlGetElementValueFilter_QNAME, XmlGetElementValueFilterType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ScriptletFilterType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "scriptletFilter", substitutionHeadNamespace = "", substitutionHeadName = "baseFilter")
    public JAXBElement<ScriptletFilterType> createScriptletFilter(ScriptletFilterType value) {
        return new JAXBElement<ScriptletFilterType>(_ScriptletFilter_QNAME, ScriptletFilterType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TableFilterType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "tableFilter", substitutionHeadNamespace = "", substitutionHeadName = "baseFilter")
    public JAXBElement<TableFilterType> createTableFilter(TableFilterType value) {
        return new JAXBElement<TableFilterType>(_TableFilter_QNAME, TableFilterType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ScriptletEvaluatorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "scriptletEvaluator")
    public JAXBElement<ScriptletEvaluatorType> createScriptletEvaluator(ScriptletEvaluatorType value) {
        return new JAXBElement<ScriptletEvaluatorType>(_ScriptletEvaluator_QNAME, ScriptletEvaluatorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompareType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "compare")
    public JAXBElement<CompareType> createCompare(CompareType value) {
        return new JAXBElement<CompareType>(_Compare_QNAME, CompareType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoneResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "doneResponse")
    public JAXBElement<DoneResponseType> createDoneResponse(DoneResponseType value) {
        return new JAXBElement<DoneResponseType>(_DoneResponse_QNAME, DoneResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConcatType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "concat", substitutionHeadNamespace = "", substitutionHeadName = "baseFilter")
    public JAXBElement<ConcatType> createConcat(ConcatType value) {
        return new JAXBElement<ConcatType>(_Concat_QNAME, ConcatType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SystemPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "systemProperty")
    public JAXBElement<SystemPropertyType> createSystemProperty(SystemPropertyType value) {
        return new JAXBElement<SystemPropertyType>(_SystemProperty_QNAME, SystemPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ScriptletType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "scriptlet")
    public JAXBElement<ScriptletType> createScriptlet(ScriptletType value) {
        return new JAXBElement<ScriptletType>(_Scriptlet_QNAME, ScriptletType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegexFilterType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "regexFilter", substitutionHeadNamespace = "", substitutionHeadName = "baseFilter")
    public JAXBElement<RegexFilterType> createRegexFilter(RegexFilterType value) {
        return new JAXBElement<RegexFilterType>(_RegexFilter_QNAME, RegexFilterType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GroupAliasType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "groupAlias")
    public JAXBElement<GroupAliasType> createGroupAlias(GroupAliasType value) {
        return new JAXBElement<GroupAliasType>(_GroupAlias_QNAME, GroupAliasType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NumberFilterType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "numberFilter", substitutionHeadNamespace = "", substitutionHeadName = "baseFilter")
    public JAXBElement<NumberFilterType> createNumberFilter(NumberFilterType value) {
        return new JAXBElement<NumberFilterType>(_NumberFilter_QNAME, NumberFilterType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CategoryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "category")
    public JAXBElement<CategoryType> createCategory(CategoryType value) {
        return new JAXBElement<CategoryType>(_Category_QNAME, CategoryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountLinesFilterType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "countLinesFilter", substitutionHeadNamespace = "", substitutionHeadName = "baseFilter")
    public JAXBElement<CountLinesFilterType> createCountLinesFilter(CountLinesFilterType value) {
        return new JAXBElement<CountLinesFilterType>(_CountLinesFilter_QNAME, CountLinesFilterType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StripTrailingFilterType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "stripTrailingFilter", substitutionHeadNamespace = "", substitutionHeadName = "baseFilter")
    public JAXBElement<StripTrailingFilterType> createStripTrailingFilter(StripTrailingFilterType value) {
        return new JAXBElement<StripTrailingFilterType>(_StripTrailingFilter_QNAME, StripTrailingFilterType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XmlGetElementsFilterType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "xmlGetElementsFilter", substitutionHeadNamespace = "", substitutionHeadName = "baseFilter")
    public JAXBElement<XmlGetElementsFilterType> createXmlGetElementsFilter(XmlGetElementsFilterType value) {
        return new JAXBElement<XmlGetElementsFilterType>(_XmlGetElementsFilter_QNAME, XmlGetElementsFilterType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoundingFilterType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "roundingFilter", substitutionHeadNamespace = "", substitutionHeadName = "baseFilter")
    public JAXBElement<RoundingFilterType> createRoundingFilter(RoundingFilterType value) {
        return new JAXBElement<RoundingFilterType>(_RoundingFilter_QNAME, RoundingFilterType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GroupType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "group")
    public JAXBElement<GroupType> createGroup(GroupType value) {
        return new JAXBElement<GroupType>(_Group_QNAME, GroupType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XpathFilterType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "xpathFilter", substitutionHeadNamespace = "", substitutionHeadName = "baseFilter")
    public JAXBElement<XpathFilterType> createXpathFilter(XpathFilterType value) {
        return new JAXBElement<XpathFilterType>(_XpathFilter_QNAME, XpathFilterType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlowVariableAssignmentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "flowVariableAssignment", scope = EndBranchStepType.Assignments.class)
    public JAXBElement<FlowVariableAssignmentType> createEndBranchStepTypeAssignmentsFlowVariableAssignment(FlowVariableAssignmentType value) {
        return new JAXBElement<FlowVariableAssignmentType>(_EndBranchStepTypeAssignmentsFlowVariableAssignment_QNAME, FlowVariableAssignmentType.class, EndBranchStepType.Assignments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntryPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "entry", scope = PropertiesType.class)
    public JAXBElement<EntryPropertyType> createPropertiesTypeEntry(EntryPropertyType value) {
        return new JAXBElement<EntryPropertyType>(_PropertiesTypeEntry_QNAME, EntryPropertyType.class, PropertiesType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlowVariableAssignmentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "flowVariableAssignment", scope = MultiInstanceStepType.Assignments.class)
    public JAXBElement<FlowVariableAssignmentType> createMultiInstanceStepTypeAssignmentsFlowVariableAssignment(FlowVariableAssignmentType value) {
        return new JAXBElement<FlowVariableAssignmentType>(_EndBranchStepTypeAssignmentsFlowVariableAssignment_QNAME, FlowVariableAssignmentType.class, MultiInstanceStepType.Assignments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "refId", scope = ParallelLaneType.ParallelSteps.class)
    public JAXBElement<String> createParallelLaneTypeParallelStepsRefId(String value) {
        return new JAXBElement<String>(_ParallelMultiStepTypeStartStepsRefId_QNAME, String.class, ParallelLaneType.ParallelSteps.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlowVariableAssignmentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "flowVariableAssignment", scope = ParallelMultiStepType.Assignments.class)
    public JAXBElement<FlowVariableAssignmentType> createParallelMultiStepTypeAssignmentsFlowVariableAssignment(FlowVariableAssignmentType value) {
        return new JAXBElement<FlowVariableAssignmentType>(_EndBranchStepTypeAssignmentsFlowVariableAssignment_QNAME, FlowVariableAssignmentType.class, ParallelMultiStepType.Assignments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlowVariableAssignmentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "flowVariableAssignment", scope = RegularStepType.Assignments.class)
    public JAXBElement<FlowVariableAssignmentType> createRegularStepTypeAssignmentsFlowVariableAssignment(FlowVariableAssignmentType value) {
        return new JAXBElement<FlowVariableAssignmentType>(_EndBranchStepTypeAssignmentsFlowVariableAssignment_QNAME, FlowVariableAssignmentType.class, RegularStepType.Assignments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlowVariableAssignmentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "flowVariableAssignment", scope = ReturnStepType.Assignments.class)
    public JAXBElement<FlowVariableAssignmentType> createReturnStepTypeAssignmentsFlowVariableAssignment(FlowVariableAssignmentType value) {
        return new JAXBElement<FlowVariableAssignmentType>(_EndBranchStepTypeAssignmentsFlowVariableAssignment_QNAME, FlowVariableAssignmentType.class, ReturnStepType.Assignments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "refId", scope = MultiInstanceStepType.StartSteps.class)
    public JAXBElement<String> createMultiInstanceStepTypeStartStepsRefId(String value) {
        return new JAXBElement<String>(_ParallelMultiStepTypeStartStepsRefId_QNAME, String.class, MultiInstanceStepType.StartSteps.class, value);
    }

}
