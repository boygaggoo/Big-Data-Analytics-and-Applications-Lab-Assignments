FROM ubuntu:16.04

# Pick up some TF dependencies
RUN apt-get update && apt-get install -y --no-install-recommends \
        build-essential \
        curl \
        libfreetype6-dev \
        libpng12-dev \
        libzmq3-dev \
        pkg-config \
        python \
        python-dev \
        rsync \
        software-properties-common \
        unzip \
        && \
    apt-get clean && \
    rm -rf /var/lib/apt/lists/*

RUN curl -O https://bootstrap.pypa.io/get-pip.py && \
    python get-pip.py && \
    rm get-pip.py

RUN pip --no-cache-dir install \
        ipykernel \
        jupyter \
        matplotlib \
        numpy \
        scipy \
        sklearn \
        pandas \
        Pillow \
        && \
    python -m ipykernel.kernelspec

# Install TensorFlow CPU version from central repo
#RUN pip --no-cache-dir install --upgrade \
#	 https://storage.googleapis.com/tensorflow/mac/cpu/tensorflow-1.0.0-py3-none-any.whl

RUN pip install --upgrade tensorflow
# RUN ln -s /usr/bin/python3 /usr/bin/python#

# Set up our notebook config.
#COPY jupyter_notebook_config.py /root/.jupyter/

# Copy sample notebooks.
#COPY notebooks /notebooks

# Jupyter has issues with being run directly:
#   https://github.com/ipython/ipython/issues/7062
# We just add a little wrapper script.
#COPY run_jupyter.sh /

# TensorBoard
#EXPOSE 6006
# IPython
#EXPOSE 8888

#WORKDIR "/notebooks"
COPY . /job/
#COPY entrypoint.sh /
#COPY test.py /
CMD ["/job/entrypoint.sh"]
