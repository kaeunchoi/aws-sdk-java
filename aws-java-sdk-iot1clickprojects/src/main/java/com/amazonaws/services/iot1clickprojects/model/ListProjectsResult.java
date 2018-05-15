/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.iot1clickprojects.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot1click-projects-2018-05-14/ListProjects" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListProjectsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An object containing the list of projects.
     * </p>
     */
    private java.util.List<ProjectSummary> projects;
    /**
     * <p>
     * The token used to retrieve the next set of results - will be effectively empty if there are no further results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An object containing the list of projects.
     * </p>
     * 
     * @return An object containing the list of projects.
     */

    public java.util.List<ProjectSummary> getProjects() {
        return projects;
    }

    /**
     * <p>
     * An object containing the list of projects.
     * </p>
     * 
     * @param projects
     *        An object containing the list of projects.
     */

    public void setProjects(java.util.Collection<ProjectSummary> projects) {
        if (projects == null) {
            this.projects = null;
            return;
        }

        this.projects = new java.util.ArrayList<ProjectSummary>(projects);
    }

    /**
     * <p>
     * An object containing the list of projects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProjects(java.util.Collection)} or {@link #withProjects(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param projects
     *        An object containing the list of projects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProjectsResult withProjects(ProjectSummary... projects) {
        if (this.projects == null) {
            setProjects(new java.util.ArrayList<ProjectSummary>(projects.length));
        }
        for (ProjectSummary ele : projects) {
            this.projects.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An object containing the list of projects.
     * </p>
     * 
     * @param projects
     *        An object containing the list of projects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProjectsResult withProjects(java.util.Collection<ProjectSummary> projects) {
        setProjects(projects);
        return this;
    }

    /**
     * <p>
     * The token used to retrieve the next set of results - will be effectively empty if there are no further results.
     * </p>
     * 
     * @param nextToken
     *        The token used to retrieve the next set of results - will be effectively empty if there are no further
     *        results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token used to retrieve the next set of results - will be effectively empty if there are no further results.
     * </p>
     * 
     * @return The token used to retrieve the next set of results - will be effectively empty if there are no further
     *         results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token used to retrieve the next set of results - will be effectively empty if there are no further results.
     * </p>
     * 
     * @param nextToken
     *        The token used to retrieve the next set of results - will be effectively empty if there are no further
     *        results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProjectsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getProjects() != null)
            sb.append("Projects: ").append(getProjects()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListProjectsResult == false)
            return false;
        ListProjectsResult other = (ListProjectsResult) obj;
        if (other.getProjects() == null ^ this.getProjects() == null)
            return false;
        if (other.getProjects() != null && other.getProjects().equals(this.getProjects()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProjects() == null) ? 0 : getProjects().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListProjectsResult clone() {
        try {
            return (ListProjectsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
