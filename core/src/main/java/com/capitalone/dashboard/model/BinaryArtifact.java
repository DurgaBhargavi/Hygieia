package com.capitalone.dashboard.model;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

/**
 * Binary artifacts produced by build jobs and stored in an artifact repository.
 *
 * Possible collectors:
 *  Nexus (in scope)
 *  Artifactory
 *  npm
 *  nuget
 *  rubygems
 *
 */
@Document(collection = "artifacts")
public class BinaryArtifact extends BaseModel {
    private ObjectId collectorItemId;
    private long timestamp;

    private String artifactName;
    private String canonicalName;
    private String artifactGroupId;
    private String artifactVersion;

    private ObjectId artifactBuildId;

    private List<SCM> sourceChangeSet = new ArrayList<>();

    public ObjectId getCollectorItemId() {
        return collectorItemId;
    }

    public void setCollectorItemId(ObjectId collectorItemId) {
        this.collectorItemId = collectorItemId;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String getArtifactName() {
        return artifactName;
    }

    public void setArtifactName(String artifactName) {
        this.artifactName = artifactName;
    }

    public String getArtifactGroupId() {
        return artifactGroupId;
    }

    public void setArtifactGroupId(String artifactGroupId) {
        this.artifactGroupId = artifactGroupId;
    }

    public String getArtifactVersion() {
        return artifactVersion;
    }

    public void setArtifactVersion(String artifactVersion) {
        this.artifactVersion = artifactVersion;
    }

    public ObjectId getArtifactBuildId() {
        return artifactBuildId;
    }

    public void setArtifactBuildId(ObjectId artifactBuildId) {
        this.artifactBuildId = artifactBuildId;
    }

    public String getCanonicalName() {
        return canonicalName;
    }

    public void setCanonicalName(String canonicalName) {
        this.canonicalName = canonicalName;
    }

    public List<SCM> getSourceChangeSet() {
        return sourceChangeSet;
    }
}
