/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates or updates a scheduled scaling action for an Auto Scaling group. If
 * you leave a parameter unspecified when updating a scheduled scaling action,
 * the corresponding value remains unchanged.
 * </p>
 * <p>
 * For more information, see <a href=
 * "http://docs.aws.amazon.com/autoscaling/ec2/userguide/schedule_time.html"
 * >Scheduled Scaling</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
 * </p>
 */
public class PutScheduledUpdateGroupActionRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String autoScalingGroupName;

    /**
     * <p>
     * The name of this scaling action.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String scheduledActionName;

    /**
     * <p>
     * This parameter is deprecated.
     * </p>
     */
    private java.util.Date time;

    /**
     * <p>
     * The time for this action to start, in "YYYY-MM-DDThh:mm:ssZ" format in
     * UTC/GMT only (for example, <code>2014-06-01T00:00:00Z</code>).
     * </p>
     * <p>
     * If you specify <code>Recurrence</code> and <code>StartTime</code>, Amazon
     * EC2 Auto Scaling performs the action at this time, and then performs the
     * action based on the specified recurrence.
     * </p>
     * <p>
     * If you try to schedule your action in the past, Amazon EC2 Auto Scaling
     * returns an error message.
     * </p>
     */
    private java.util.Date startTime;

    /**
     * <p>
     * The time for the recurring schedule to end. Amazon EC2 Auto Scaling does
     * not perform the action after this time.
     * </p>
     */
    private java.util.Date endTime;

    /**
     * <p>
     * The recurring schedule for this action, in Unix cron syntax format. For
     * more information about this format, see <a
     * href="http://crontab.org">Crontab</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String recurrence;

    /**
     * <p>
     * The minimum size for the Auto Scaling group.
     * </p>
     */
    private Integer minSize;

    /**
     * <p>
     * The maximum size for the Auto Scaling group.
     * </p>
     */
    private Integer maxSize;

    /**
     * <p>
     * The number of EC2 instances that should be running in the group.
     * </p>
     */
    private Integer desiredCapacity;

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The name of the Auto Scaling group.
     *         </p>
     */
    public String getAutoScalingGroupName() {
        return autoScalingGroupName;
    }

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param autoScalingGroupName <p>
     *            The name of the Auto Scaling group.
     *            </p>
     */
    public void setAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
    }

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param autoScalingGroupName <p>
     *            The name of the Auto Scaling group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutScheduledUpdateGroupActionRequest withAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
        return this;
    }

    /**
     * <p>
     * The name of this scaling action.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The name of this scaling action.
     *         </p>
     */
    public String getScheduledActionName() {
        return scheduledActionName;
    }

    /**
     * <p>
     * The name of this scaling action.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param scheduledActionName <p>
     *            The name of this scaling action.
     *            </p>
     */
    public void setScheduledActionName(String scheduledActionName) {
        this.scheduledActionName = scheduledActionName;
    }

    /**
     * <p>
     * The name of this scaling action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param scheduledActionName <p>
     *            The name of this scaling action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutScheduledUpdateGroupActionRequest withScheduledActionName(String scheduledActionName) {
        this.scheduledActionName = scheduledActionName;
        return this;
    }

    /**
     * <p>
     * This parameter is deprecated.
     * </p>
     *
     * @return <p>
     *         This parameter is deprecated.
     *         </p>
     */
    public java.util.Date getTime() {
        return time;
    }

    /**
     * <p>
     * This parameter is deprecated.
     * </p>
     *
     * @param time <p>
     *            This parameter is deprecated.
     *            </p>
     */
    public void setTime(java.util.Date time) {
        this.time = time;
    }

    /**
     * <p>
     * This parameter is deprecated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param time <p>
     *            This parameter is deprecated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutScheduledUpdateGroupActionRequest withTime(java.util.Date time) {
        this.time = time;
        return this;
    }

    /**
     * <p>
     * The time for this action to start, in "YYYY-MM-DDThh:mm:ssZ" format in
     * UTC/GMT only (for example, <code>2014-06-01T00:00:00Z</code>).
     * </p>
     * <p>
     * If you specify <code>Recurrence</code> and <code>StartTime</code>, Amazon
     * EC2 Auto Scaling performs the action at this time, and then performs the
     * action based on the specified recurrence.
     * </p>
     * <p>
     * If you try to schedule your action in the past, Amazon EC2 Auto Scaling
     * returns an error message.
     * </p>
     *
     * @return <p>
     *         The time for this action to start, in "YYYY-MM-DDThh:mm:ssZ"
     *         format in UTC/GMT only (for example,
     *         <code>2014-06-01T00:00:00Z</code>).
     *         </p>
     *         <p>
     *         If you specify <code>Recurrence</code> and <code>StartTime</code>
     *         , Amazon EC2 Auto Scaling performs the action at this time, and
     *         then performs the action based on the specified recurrence.
     *         </p>
     *         <p>
     *         If you try to schedule your action in the past, Amazon EC2 Auto
     *         Scaling returns an error message.
     *         </p>
     */
    public java.util.Date getStartTime() {
        return startTime;
    }

    /**
     * <p>
     * The time for this action to start, in "YYYY-MM-DDThh:mm:ssZ" format in
     * UTC/GMT only (for example, <code>2014-06-01T00:00:00Z</code>).
     * </p>
     * <p>
     * If you specify <code>Recurrence</code> and <code>StartTime</code>, Amazon
     * EC2 Auto Scaling performs the action at this time, and then performs the
     * action based on the specified recurrence.
     * </p>
     * <p>
     * If you try to schedule your action in the past, Amazon EC2 Auto Scaling
     * returns an error message.
     * </p>
     *
     * @param startTime <p>
     *            The time for this action to start, in "YYYY-MM-DDThh:mm:ssZ"
     *            format in UTC/GMT only (for example,
     *            <code>2014-06-01T00:00:00Z</code>).
     *            </p>
     *            <p>
     *            If you specify <code>Recurrence</code> and
     *            <code>StartTime</code>, Amazon EC2 Auto Scaling performs the
     *            action at this time, and then performs the action based on the
     *            specified recurrence.
     *            </p>
     *            <p>
     *            If you try to schedule your action in the past, Amazon EC2
     *            Auto Scaling returns an error message.
     *            </p>
     */
    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The time for this action to start, in "YYYY-MM-DDThh:mm:ssZ" format in
     * UTC/GMT only (for example, <code>2014-06-01T00:00:00Z</code>).
     * </p>
     * <p>
     * If you specify <code>Recurrence</code> and <code>StartTime</code>, Amazon
     * EC2 Auto Scaling performs the action at this time, and then performs the
     * action based on the specified recurrence.
     * </p>
     * <p>
     * If you try to schedule your action in the past, Amazon EC2 Auto Scaling
     * returns an error message.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startTime <p>
     *            The time for this action to start, in "YYYY-MM-DDThh:mm:ssZ"
     *            format in UTC/GMT only (for example,
     *            <code>2014-06-01T00:00:00Z</code>).
     *            </p>
     *            <p>
     *            If you specify <code>Recurrence</code> and
     *            <code>StartTime</code>, Amazon EC2 Auto Scaling performs the
     *            action at this time, and then performs the action based on the
     *            specified recurrence.
     *            </p>
     *            <p>
     *            If you try to schedule your action in the past, Amazon EC2
     *            Auto Scaling returns an error message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutScheduledUpdateGroupActionRequest withStartTime(java.util.Date startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * <p>
     * The time for the recurring schedule to end. Amazon EC2 Auto Scaling does
     * not perform the action after this time.
     * </p>
     *
     * @return <p>
     *         The time for the recurring schedule to end. Amazon EC2 Auto
     *         Scaling does not perform the action after this time.
     *         </p>
     */
    public java.util.Date getEndTime() {
        return endTime;
    }

    /**
     * <p>
     * The time for the recurring schedule to end. Amazon EC2 Auto Scaling does
     * not perform the action after this time.
     * </p>
     *
     * @param endTime <p>
     *            The time for the recurring schedule to end. Amazon EC2 Auto
     *            Scaling does not perform the action after this time.
     *            </p>
     */
    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The time for the recurring schedule to end. Amazon EC2 Auto Scaling does
     * not perform the action after this time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endTime <p>
     *            The time for the recurring schedule to end. Amazon EC2 Auto
     *            Scaling does not perform the action after this time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutScheduledUpdateGroupActionRequest withEndTime(java.util.Date endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * <p>
     * The recurring schedule for this action, in Unix cron syntax format. For
     * more information about this format, see <a
     * href="http://crontab.org">Crontab</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The recurring schedule for this action, in Unix cron syntax
     *         format. For more information about this format, see <a
     *         href="http://crontab.org">Crontab</a>.
     *         </p>
     */
    public String getRecurrence() {
        return recurrence;
    }

    /**
     * <p>
     * The recurring schedule for this action, in Unix cron syntax format. For
     * more information about this format, see <a
     * href="http://crontab.org">Crontab</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param recurrence <p>
     *            The recurring schedule for this action, in Unix cron syntax
     *            format. For more information about this format, see <a
     *            href="http://crontab.org">Crontab</a>.
     *            </p>
     */
    public void setRecurrence(String recurrence) {
        this.recurrence = recurrence;
    }

    /**
     * <p>
     * The recurring schedule for this action, in Unix cron syntax format. For
     * more information about this format, see <a
     * href="http://crontab.org">Crontab</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param recurrence <p>
     *            The recurring schedule for this action, in Unix cron syntax
     *            format. For more information about this format, see <a
     *            href="http://crontab.org">Crontab</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutScheduledUpdateGroupActionRequest withRecurrence(String recurrence) {
        this.recurrence = recurrence;
        return this;
    }

    /**
     * <p>
     * The minimum size for the Auto Scaling group.
     * </p>
     *
     * @return <p>
     *         The minimum size for the Auto Scaling group.
     *         </p>
     */
    public Integer getMinSize() {
        return minSize;
    }

    /**
     * <p>
     * The minimum size for the Auto Scaling group.
     * </p>
     *
     * @param minSize <p>
     *            The minimum size for the Auto Scaling group.
     *            </p>
     */
    public void setMinSize(Integer minSize) {
        this.minSize = minSize;
    }

    /**
     * <p>
     * The minimum size for the Auto Scaling group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param minSize <p>
     *            The minimum size for the Auto Scaling group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutScheduledUpdateGroupActionRequest withMinSize(Integer minSize) {
        this.minSize = minSize;
        return this;
    }

    /**
     * <p>
     * The maximum size for the Auto Scaling group.
     * </p>
     *
     * @return <p>
     *         The maximum size for the Auto Scaling group.
     *         </p>
     */
    public Integer getMaxSize() {
        return maxSize;
    }

    /**
     * <p>
     * The maximum size for the Auto Scaling group.
     * </p>
     *
     * @param maxSize <p>
     *            The maximum size for the Auto Scaling group.
     *            </p>
     */
    public void setMaxSize(Integer maxSize) {
        this.maxSize = maxSize;
    }

    /**
     * <p>
     * The maximum size for the Auto Scaling group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxSize <p>
     *            The maximum size for the Auto Scaling group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutScheduledUpdateGroupActionRequest withMaxSize(Integer maxSize) {
        this.maxSize = maxSize;
        return this;
    }

    /**
     * <p>
     * The number of EC2 instances that should be running in the group.
     * </p>
     *
     * @return <p>
     *         The number of EC2 instances that should be running in the group.
     *         </p>
     */
    public Integer getDesiredCapacity() {
        return desiredCapacity;
    }

    /**
     * <p>
     * The number of EC2 instances that should be running in the group.
     * </p>
     *
     * @param desiredCapacity <p>
     *            The number of EC2 instances that should be running in the
     *            group.
     *            </p>
     */
    public void setDesiredCapacity(Integer desiredCapacity) {
        this.desiredCapacity = desiredCapacity;
    }

    /**
     * <p>
     * The number of EC2 instances that should be running in the group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param desiredCapacity <p>
     *            The number of EC2 instances that should be running in the
     *            group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutScheduledUpdateGroupActionRequest withDesiredCapacity(Integer desiredCapacity) {
        this.desiredCapacity = desiredCapacity;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAutoScalingGroupName() != null)
            sb.append("AutoScalingGroupName: " + getAutoScalingGroupName() + ",");
        if (getScheduledActionName() != null)
            sb.append("ScheduledActionName: " + getScheduledActionName() + ",");
        if (getTime() != null)
            sb.append("Time: " + getTime() + ",");
        if (getStartTime() != null)
            sb.append("StartTime: " + getStartTime() + ",");
        if (getEndTime() != null)
            sb.append("EndTime: " + getEndTime() + ",");
        if (getRecurrence() != null)
            sb.append("Recurrence: " + getRecurrence() + ",");
        if (getMinSize() != null)
            sb.append("MinSize: " + getMinSize() + ",");
        if (getMaxSize() != null)
            sb.append("MaxSize: " + getMaxSize() + ",");
        if (getDesiredCapacity() != null)
            sb.append("DesiredCapacity: " + getDesiredCapacity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAutoScalingGroupName() == null) ? 0 : getAutoScalingGroupName().hashCode());
        hashCode = prime * hashCode
                + ((getScheduledActionName() == null) ? 0 : getScheduledActionName().hashCode());
        hashCode = prime * hashCode + ((getTime() == null) ? 0 : getTime().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getRecurrence() == null) ? 0 : getRecurrence().hashCode());
        hashCode = prime * hashCode + ((getMinSize() == null) ? 0 : getMinSize().hashCode());
        hashCode = prime * hashCode + ((getMaxSize() == null) ? 0 : getMaxSize().hashCode());
        hashCode = prime * hashCode
                + ((getDesiredCapacity() == null) ? 0 : getDesiredCapacity().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutScheduledUpdateGroupActionRequest == false)
            return false;
        PutScheduledUpdateGroupActionRequest other = (PutScheduledUpdateGroupActionRequest) obj;

        if (other.getAutoScalingGroupName() == null ^ this.getAutoScalingGroupName() == null)
            return false;
        if (other.getAutoScalingGroupName() != null
                && other.getAutoScalingGroupName().equals(this.getAutoScalingGroupName()) == false)
            return false;
        if (other.getScheduledActionName() == null ^ this.getScheduledActionName() == null)
            return false;
        if (other.getScheduledActionName() != null
                && other.getScheduledActionName().equals(this.getScheduledActionName()) == false)
            return false;
        if (other.getTime() == null ^ this.getTime() == null)
            return false;
        if (other.getTime() != null && other.getTime().equals(this.getTime()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null
                && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getRecurrence() == null ^ this.getRecurrence() == null)
            return false;
        if (other.getRecurrence() != null
                && other.getRecurrence().equals(this.getRecurrence()) == false)
            return false;
        if (other.getMinSize() == null ^ this.getMinSize() == null)
            return false;
        if (other.getMinSize() != null && other.getMinSize().equals(this.getMinSize()) == false)
            return false;
        if (other.getMaxSize() == null ^ this.getMaxSize() == null)
            return false;
        if (other.getMaxSize() != null && other.getMaxSize().equals(this.getMaxSize()) == false)
            return false;
        if (other.getDesiredCapacity() == null ^ this.getDesiredCapacity() == null)
            return false;
        if (other.getDesiredCapacity() != null
                && other.getDesiredCapacity().equals(this.getDesiredCapacity()) == false)
            return false;
        return true;
    }
}
