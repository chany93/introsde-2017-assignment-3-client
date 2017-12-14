
package introsde.assignment3.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the introsde.assignment3.soap package. 
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

    private final static QName _DeletePerson_QNAME = new QName("http://soap.assignment3.introsde/", "deletePerson");
    private final static QName _CreatePersonResponse_QNAME = new QName("http://soap.assignment3.introsde/", "createPersonResponse");
    private final static QName _CreateActivity_QNAME = new QName("http://soap.assignment3.introsde/", "createActivity");
    private final static QName _ReadPersonPreferencesByIdResponse_QNAME = new QName("http://soap.assignment3.introsde/", "readPersonPreferencesByIdResponse");
    private final static QName _ReadPersonPreferencesByType_QNAME = new QName("http://soap.assignment3.introsde/", "readPersonPreferencesByType");
    private final static QName _ReadPersonPreferencesByTypeResponse_QNAME = new QName("http://soap.assignment3.introsde/", "readPersonPreferencesByTypeResponse");
    private final static QName _SavePersonPreferences_QNAME = new QName("http://soap.assignment3.introsde/", "savePersonPreferences");
    private final static QName _CreatePerson_QNAME = new QName("http://soap.assignment3.introsde/", "createPerson");
    private final static QName _EvaluatePersonPreferencesResponse_QNAME = new QName("http://soap.assignment3.introsde/", "evaluatePersonPreferencesResponse");
    private final static QName _GetBestPersonPreferences_QNAME = new QName("http://soap.assignment3.introsde/", "getBestPersonPreferences");
    private final static QName _UpdatePersonResponse_QNAME = new QName("http://soap.assignment3.introsde/", "updatePersonResponse");
    private final static QName _ReadPersonResponse_QNAME = new QName("http://soap.assignment3.introsde/", "readPersonResponse");
    private final static QName _Person_QNAME = new QName("http://soap.assignment3.introsde/", "person");
    private final static QName _ReadPerson_QNAME = new QName("http://soap.assignment3.introsde/", "readPerson");
    private final static QName _UpdatePersonPreferences_QNAME = new QName("http://soap.assignment3.introsde/", "updatePersonPreferences");
    private final static QName _UpdatePerson_QNAME = new QName("http://soap.assignment3.introsde/", "updatePerson");
    private final static QName _ReadPersonPreferencesById_QNAME = new QName("http://soap.assignment3.introsde/", "readPersonPreferencesById");
    private final static QName _UpdatePersonPreferencesResponse_QNAME = new QName("http://soap.assignment3.introsde/", "updatePersonPreferencesResponse");
    private final static QName _Activity_QNAME = new QName("http://soap.assignment3.introsde/", "activity");
    private final static QName _ReadPreferences_QNAME = new QName("http://soap.assignment3.introsde/", "readPreferences");
    private final static QName _ReadPersonListResponse_QNAME = new QName("http://soap.assignment3.introsde/", "readPersonListResponse");
    private final static QName _ReadPreferencesResponse_QNAME = new QName("http://soap.assignment3.introsde/", "readPreferencesResponse");
    private final static QName _CreateActivityResponse_QNAME = new QName("http://soap.assignment3.introsde/", "createActivityResponse");
    private final static QName _EvaluatePersonPreferences_QNAME = new QName("http://soap.assignment3.introsde/", "evaluatePersonPreferences");
    private final static QName _DeletePersonResponse_QNAME = new QName("http://soap.assignment3.introsde/", "deletePersonResponse");
    private final static QName _ReadPersonList_QNAME = new QName("http://soap.assignment3.introsde/", "readPersonList");
    private final static QName _GetBestPersonPreferencesResponse_QNAME = new QName("http://soap.assignment3.introsde/", "getBestPersonPreferencesResponse");
    private final static QName _ActivityType_QNAME = new QName("http://soap.assignment3.introsde/", "activity_type");
    private final static QName _SavePersonPreferencesResponse_QNAME = new QName("http://soap.assignment3.introsde/", "savePersonPreferencesResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: introsde.assignment3.soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link Person.Evaluation }
     * 
     */
    public Person.Evaluation createPersonEvaluation() {
        return new Person.Evaluation();
    }

    /**
     * Create an instance of {@link ReadPersonPreferencesById }
     * 
     */
    public ReadPersonPreferencesById createReadPersonPreferencesById() {
        return new ReadPersonPreferencesById();
    }

    /**
     * Create an instance of {@link UpdatePersonPreferencesResponse }
     * 
     */
    public UpdatePersonPreferencesResponse createUpdatePersonPreferencesResponse() {
        return new UpdatePersonPreferencesResponse();
    }

    /**
     * Create an instance of {@link Activity }
     * 
     */
    public Activity createActivity() {
        return new Activity();
    }

    /**
     * Create an instance of {@link ReadPreferences }
     * 
     */
    public ReadPreferences createReadPreferences() {
        return new ReadPreferences();
    }

    /**
     * Create an instance of {@link ReadPersonListResponse }
     * 
     */
    public ReadPersonListResponse createReadPersonListResponse() {
        return new ReadPersonListResponse();
    }

    /**
     * Create an instance of {@link ReadPreferencesResponse }
     * 
     */
    public ReadPreferencesResponse createReadPreferencesResponse() {
        return new ReadPreferencesResponse();
    }

    /**
     * Create an instance of {@link CreateActivityResponse }
     * 
     */
    public CreateActivityResponse createCreateActivityResponse() {
        return new CreateActivityResponse();
    }

    /**
     * Create an instance of {@link EvaluatePersonPreferences }
     * 
     */
    public EvaluatePersonPreferences createEvaluatePersonPreferences() {
        return new EvaluatePersonPreferences();
    }

    /**
     * Create an instance of {@link DeletePersonResponse }
     * 
     */
    public DeletePersonResponse createDeletePersonResponse() {
        return new DeletePersonResponse();
    }

    /**
     * Create an instance of {@link ReadPersonList }
     * 
     */
    public ReadPersonList createReadPersonList() {
        return new ReadPersonList();
    }

    /**
     * Create an instance of {@link GetBestPersonPreferencesResponse }
     * 
     */
    public GetBestPersonPreferencesResponse createGetBestPersonPreferencesResponse() {
        return new GetBestPersonPreferencesResponse();
    }

    /**
     * Create an instance of {@link SavePersonPreferencesResponse }
     * 
     */
    public SavePersonPreferencesResponse createSavePersonPreferencesResponse() {
        return new SavePersonPreferencesResponse();
    }

    /**
     * Create an instance of {@link DeletePerson }
     * 
     */
    public DeletePerson createDeletePerson() {
        return new DeletePerson();
    }

    /**
     * Create an instance of {@link CreatePersonResponse }
     * 
     */
    public CreatePersonResponse createCreatePersonResponse() {
        return new CreatePersonResponse();
    }

    /**
     * Create an instance of {@link CreateActivity }
     * 
     */
    public CreateActivity createCreateActivity() {
        return new CreateActivity();
    }

    /**
     * Create an instance of {@link ReadPersonPreferencesByIdResponse }
     * 
     */
    public ReadPersonPreferencesByIdResponse createReadPersonPreferencesByIdResponse() {
        return new ReadPersonPreferencesByIdResponse();
    }

    /**
     * Create an instance of {@link ReadPersonPreferencesByType }
     * 
     */
    public ReadPersonPreferencesByType createReadPersonPreferencesByType() {
        return new ReadPersonPreferencesByType();
    }

    /**
     * Create an instance of {@link ReadPersonPreferencesByTypeResponse }
     * 
     */
    public ReadPersonPreferencesByTypeResponse createReadPersonPreferencesByTypeResponse() {
        return new ReadPersonPreferencesByTypeResponse();
    }

    /**
     * Create an instance of {@link SavePersonPreferences }
     * 
     */
    public SavePersonPreferences createSavePersonPreferences() {
        return new SavePersonPreferences();
    }

    /**
     * Create an instance of {@link CreatePerson }
     * 
     */
    public CreatePerson createCreatePerson() {
        return new CreatePerson();
    }

    /**
     * Create an instance of {@link EvaluatePersonPreferencesResponse }
     * 
     */
    public EvaluatePersonPreferencesResponse createEvaluatePersonPreferencesResponse() {
        return new EvaluatePersonPreferencesResponse();
    }

    /**
     * Create an instance of {@link GetBestPersonPreferences }
     * 
     */
    public GetBestPersonPreferences createGetBestPersonPreferences() {
        return new GetBestPersonPreferences();
    }

    /**
     * Create an instance of {@link UpdatePersonResponse }
     * 
     */
    public UpdatePersonResponse createUpdatePersonResponse() {
        return new UpdatePersonResponse();
    }

    /**
     * Create an instance of {@link ReadPersonResponse }
     * 
     */
    public ReadPersonResponse createReadPersonResponse() {
        return new ReadPersonResponse();
    }

    /**
     * Create an instance of {@link ReadPerson }
     * 
     */
    public ReadPerson createReadPerson() {
        return new ReadPerson();
    }

    /**
     * Create an instance of {@link UpdatePersonPreferences }
     * 
     */
    public UpdatePersonPreferences createUpdatePersonPreferences() {
        return new UpdatePersonPreferences();
    }

    /**
     * Create an instance of {@link UpdatePerson }
     * 
     */
    public UpdatePerson createUpdatePerson() {
        return new UpdatePerson();
    }

    /**
     * Create an instance of {@link Person.Preferences }
     * 
     */
    public Person.Preferences createPersonPreferences() {
        return new Person.Preferences();
    }

    /**
     * Create an instance of {@link Person.Evaluation.Entry }
     * 
     */
    public Person.Evaluation.Entry createPersonEvaluationEntry() {
        return new Person.Evaluation.Entry();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.assignment3.introsde/", name = "deletePerson")
    public JAXBElement<DeletePerson> createDeletePerson(DeletePerson value) {
        return new JAXBElement<DeletePerson>(_DeletePerson_QNAME, DeletePerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.assignment3.introsde/", name = "createPersonResponse")
    public JAXBElement<CreatePersonResponse> createCreatePersonResponse(CreatePersonResponse value) {
        return new JAXBElement<CreatePersonResponse>(_CreatePersonResponse_QNAME, CreatePersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateActivity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.assignment3.introsde/", name = "createActivity")
    public JAXBElement<CreateActivity> createCreateActivity(CreateActivity value) {
        return new JAXBElement<CreateActivity>(_CreateActivity_QNAME, CreateActivity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonPreferencesByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.assignment3.introsde/", name = "readPersonPreferencesByIdResponse")
    public JAXBElement<ReadPersonPreferencesByIdResponse> createReadPersonPreferencesByIdResponse(ReadPersonPreferencesByIdResponse value) {
        return new JAXBElement<ReadPersonPreferencesByIdResponse>(_ReadPersonPreferencesByIdResponse_QNAME, ReadPersonPreferencesByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonPreferencesByType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.assignment3.introsde/", name = "readPersonPreferencesByType")
    public JAXBElement<ReadPersonPreferencesByType> createReadPersonPreferencesByType(ReadPersonPreferencesByType value) {
        return new JAXBElement<ReadPersonPreferencesByType>(_ReadPersonPreferencesByType_QNAME, ReadPersonPreferencesByType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonPreferencesByTypeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.assignment3.introsde/", name = "readPersonPreferencesByTypeResponse")
    public JAXBElement<ReadPersonPreferencesByTypeResponse> createReadPersonPreferencesByTypeResponse(ReadPersonPreferencesByTypeResponse value) {
        return new JAXBElement<ReadPersonPreferencesByTypeResponse>(_ReadPersonPreferencesByTypeResponse_QNAME, ReadPersonPreferencesByTypeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SavePersonPreferences }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.assignment3.introsde/", name = "savePersonPreferences")
    public JAXBElement<SavePersonPreferences> createSavePersonPreferences(SavePersonPreferences value) {
        return new JAXBElement<SavePersonPreferences>(_SavePersonPreferences_QNAME, SavePersonPreferences.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.assignment3.introsde/", name = "createPerson")
    public JAXBElement<CreatePerson> createCreatePerson(CreatePerson value) {
        return new JAXBElement<CreatePerson>(_CreatePerson_QNAME, CreatePerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EvaluatePersonPreferencesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.assignment3.introsde/", name = "evaluatePersonPreferencesResponse")
    public JAXBElement<EvaluatePersonPreferencesResponse> createEvaluatePersonPreferencesResponse(EvaluatePersonPreferencesResponse value) {
        return new JAXBElement<EvaluatePersonPreferencesResponse>(_EvaluatePersonPreferencesResponse_QNAME, EvaluatePersonPreferencesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBestPersonPreferences }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.assignment3.introsde/", name = "getBestPersonPreferences")
    public JAXBElement<GetBestPersonPreferences> createGetBestPersonPreferences(GetBestPersonPreferences value) {
        return new JAXBElement<GetBestPersonPreferences>(_GetBestPersonPreferences_QNAME, GetBestPersonPreferences.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.assignment3.introsde/", name = "updatePersonResponse")
    public JAXBElement<UpdatePersonResponse> createUpdatePersonResponse(UpdatePersonResponse value) {
        return new JAXBElement<UpdatePersonResponse>(_UpdatePersonResponse_QNAME, UpdatePersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.assignment3.introsde/", name = "readPersonResponse")
    public JAXBElement<ReadPersonResponse> createReadPersonResponse(ReadPersonResponse value) {
        return new JAXBElement<ReadPersonResponse>(_ReadPersonResponse_QNAME, ReadPersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Person }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.assignment3.introsde/", name = "person")
    public JAXBElement<Person> createPerson(Person value) {
        return new JAXBElement<Person>(_Person_QNAME, Person.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.assignment3.introsde/", name = "readPerson")
    public JAXBElement<ReadPerson> createReadPerson(ReadPerson value) {
        return new JAXBElement<ReadPerson>(_ReadPerson_QNAME, ReadPerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePersonPreferences }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.assignment3.introsde/", name = "updatePersonPreferences")
    public JAXBElement<UpdatePersonPreferences> createUpdatePersonPreferences(UpdatePersonPreferences value) {
        return new JAXBElement<UpdatePersonPreferences>(_UpdatePersonPreferences_QNAME, UpdatePersonPreferences.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.assignment3.introsde/", name = "updatePerson")
    public JAXBElement<UpdatePerson> createUpdatePerson(UpdatePerson value) {
        return new JAXBElement<UpdatePerson>(_UpdatePerson_QNAME, UpdatePerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonPreferencesById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.assignment3.introsde/", name = "readPersonPreferencesById")
    public JAXBElement<ReadPersonPreferencesById> createReadPersonPreferencesById(ReadPersonPreferencesById value) {
        return new JAXBElement<ReadPersonPreferencesById>(_ReadPersonPreferencesById_QNAME, ReadPersonPreferencesById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePersonPreferencesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.assignment3.introsde/", name = "updatePersonPreferencesResponse")
    public JAXBElement<UpdatePersonPreferencesResponse> createUpdatePersonPreferencesResponse(UpdatePersonPreferencesResponse value) {
        return new JAXBElement<UpdatePersonPreferencesResponse>(_UpdatePersonPreferencesResponse_QNAME, UpdatePersonPreferencesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Activity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.assignment3.introsde/", name = "activity")
    public JAXBElement<Activity> createActivity(Activity value) {
        return new JAXBElement<Activity>(_Activity_QNAME, Activity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPreferences }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.assignment3.introsde/", name = "readPreferences")
    public JAXBElement<ReadPreferences> createReadPreferences(ReadPreferences value) {
        return new JAXBElement<ReadPreferences>(_ReadPreferences_QNAME, ReadPreferences.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.assignment3.introsde/", name = "readPersonListResponse")
    public JAXBElement<ReadPersonListResponse> createReadPersonListResponse(ReadPersonListResponse value) {
        return new JAXBElement<ReadPersonListResponse>(_ReadPersonListResponse_QNAME, ReadPersonListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPreferencesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.assignment3.introsde/", name = "readPreferencesResponse")
    public JAXBElement<ReadPreferencesResponse> createReadPreferencesResponse(ReadPreferencesResponse value) {
        return new JAXBElement<ReadPreferencesResponse>(_ReadPreferencesResponse_QNAME, ReadPreferencesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateActivityResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.assignment3.introsde/", name = "createActivityResponse")
    public JAXBElement<CreateActivityResponse> createCreateActivityResponse(CreateActivityResponse value) {
        return new JAXBElement<CreateActivityResponse>(_CreateActivityResponse_QNAME, CreateActivityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EvaluatePersonPreferences }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.assignment3.introsde/", name = "evaluatePersonPreferences")
    public JAXBElement<EvaluatePersonPreferences> createEvaluatePersonPreferences(EvaluatePersonPreferences value) {
        return new JAXBElement<EvaluatePersonPreferences>(_EvaluatePersonPreferences_QNAME, EvaluatePersonPreferences.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.assignment3.introsde/", name = "deletePersonResponse")
    public JAXBElement<DeletePersonResponse> createDeletePersonResponse(DeletePersonResponse value) {
        return new JAXBElement<DeletePersonResponse>(_DeletePersonResponse_QNAME, DeletePersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.assignment3.introsde/", name = "readPersonList")
    public JAXBElement<ReadPersonList> createReadPersonList(ReadPersonList value) {
        return new JAXBElement<ReadPersonList>(_ReadPersonList_QNAME, ReadPersonList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBestPersonPreferencesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.assignment3.introsde/", name = "getBestPersonPreferencesResponse")
    public JAXBElement<GetBestPersonPreferencesResponse> createGetBestPersonPreferencesResponse(GetBestPersonPreferencesResponse value) {
        return new JAXBElement<GetBestPersonPreferencesResponse>(_GetBestPersonPreferencesResponse_QNAME, GetBestPersonPreferencesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActivityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.assignment3.introsde/", name = "activity_type")
    public JAXBElement<ActivityType> createActivityType(ActivityType value) {
        return new JAXBElement<ActivityType>(_ActivityType_QNAME, ActivityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SavePersonPreferencesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.assignment3.introsde/", name = "savePersonPreferencesResponse")
    public JAXBElement<SavePersonPreferencesResponse> createSavePersonPreferencesResponse(SavePersonPreferencesResponse value) {
        return new JAXBElement<SavePersonPreferencesResponse>(_SavePersonPreferencesResponse_QNAME, SavePersonPreferencesResponse.class, null, value);
    }

}
