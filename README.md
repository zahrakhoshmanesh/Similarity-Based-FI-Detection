# The Role of Similarity in Detecting Feature Interaction in Software Product Lines

Abstract—As a software product line evolves, it typically introduces new features and includes new products over time. A known cause of software aging in product lines is the
introduction of new features that interact in unplanned and even risky ways with the existing features. This can lead to failures,
performance degradation, and even hazardous states in a new product. Software product line developers currently identify new,
unwanted feature interactions primarily in the testing of each new product. This incurs significant costs, comes late in development,
and does not exploit the knowledge of prior feature interactions within a product line. The contribution of our paper is to
leverage knowledge of prior feature interactions in a product line, together with similarity measures between the features in known
feature interactions and the new features, in order to detect similar feature interactions in a new product much earlier in the
development process. Results from application to a case study from the literature show that this approach accurately detected
73% of feature interactions. This small study suggests that using similarity measures at the feature level within a product line
to detect problematic interactions involving a new feature can effectively reduce this cause of aging in a software product line.

Index Terms—feature interaction, software aging, similarity metrics, software product lines,


you can find all the material needed to reproduce the result of our paper as follows.


1- We used Software Product Line benchmarks created by Sven Apel and his team in University of Passau from [Here](http://fosd.net/FAV)

1- We wrote Java code to calculate the Jaccard and Hamming similarities  between all features in the software product line study.

2- The Excel file shows the scores.

3- PDF file explained the process and results.
