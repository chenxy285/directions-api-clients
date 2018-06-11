/**
 * GraphHopper Directions API
 * You use the GraphHopper Directions API to add route planning, navigation and route optimization to your software. E.g. the Routing API has turn instructions and elevation data and the Route Optimization API solves your logistic problems and supports various constraints like time window and capacity restrictions. Also it is possible to get all distances between all locations with our fast Matrix API.
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

/*
 * SWGVehicle.h
 * 
 * 
 */

#ifndef SWGVehicle_H_
#define SWGVehicle_H_

#include <QJsonObject>


#include "SWGAddress.h"
#include "SWGBreak.h"
#include <QList>
#include <QString>

#include "SWGObject.h"

namespace Swagger {

class SWGVehicle: public SWGObject {
public:
    SWGVehicle();
    SWGVehicle(QString* json);
    virtual ~SWGVehicle();
    void init();
    void cleanup();

    QString asJson ();
    QJsonObject* asJsonObject();
    void fromJsonObject(QJsonObject &json);
    SWGVehicle* fromJson(QString &jsonString);

    QString* getVehicleId();
    void setVehicleId(QString* vehicle_id);

    QString* getTypeId();
    void setTypeId(QString* type_id);

    SWGAddress* getStartAddress();
    void setStartAddress(SWGAddress* start_address);

    SWGAddress* getEndAddress();
    void setEndAddress(SWGAddress* end_address);

    SWGBreak* getBreak();
    void setBreak(SWGBreak* _break);

    bool isReturnToDepot();
    void setReturnToDepot(bool return_to_depot);

    qint64 getEarliestStart();
    void setEarliestStart(qint64 earliest_start);

    qint64 getLatestEnd();
    void setLatestEnd(qint64 latest_end);

    QList<QString*>* getSkills();
    void setSkills(QList<QString*>* skills);

    qint64 getMaxDistance();
    void setMaxDistance(qint64 max_distance);

    qint64 getMaxDrivingTime();
    void setMaxDrivingTime(qint64 max_driving_time);

    qint32 getMaxJobs();
    void setMaxJobs(qint32 max_jobs);

    qint32 getMaxActivities();
    void setMaxActivities(qint32 max_activities);


    virtual bool isSet() override;

private:
    QString* vehicle_id;
    bool m_vehicle_id_isSet;
    
    QString* type_id;
    bool m_type_id_isSet;
    
    SWGAddress* start_address;
    bool m_start_address_isSet;
    
    SWGAddress* end_address;
    bool m_end_address_isSet;
    
    SWGBreak* _break;
    bool m__break_isSet;
    
    bool return_to_depot;
    bool m_return_to_depot_isSet;
    
    qint64 earliest_start;
    bool m_earliest_start_isSet;
    
    qint64 latest_end;
    bool m_latest_end_isSet;
    
    QList<QString*>* skills;
    bool m_skills_isSet;
    
    qint64 max_distance;
    bool m_max_distance_isSet;
    
    qint64 max_driving_time;
    bool m_max_driving_time_isSet;
    
    qint32 max_jobs;
    bool m_max_jobs_isSet;
    
    qint32 max_activities;
    bool m_max_activities_isSet;
    
};

}

#endif /* SWGVehicle_H_ */
