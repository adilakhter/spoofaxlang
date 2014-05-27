package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.strc.*;
import org.strategoxt.java_front.*;
import org.strategoxt.imp.editors.stratego.strategies.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted6940 extends Strategy 
{ 
  public static final lifted6940 instance = new lifted6940();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail23951:
    { 
      IStrategoTerm term12646 = term;
      IStrategoConstructor cons602 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success12707:
      { 
        if(cons602 == Main._consStringQuotation1_2)
        { 
          Fail23952:
          { 
            if(true)
              break Success12707;
          }
          term = term12646;
        }
        Success12708:
        { 
          if(cons602 == Main._consStringQuotation2_2)
          { 
            Fail23953:
            { 
              if(true)
                break Success12708;
            }
            term = term12646;
          }
          Success12709:
          { 
            if(cons602 == Main._consStringQuotation3_2)
            { 
              Fail23954:
              { 
                if(true)
                  break Success12709;
              }
              term = term12646;
            }
            Success12710:
            { 
              if(cons602 == Main._consStringQuotation4_2)
              { 
                Fail23955:
                { 
                  if(true)
                    break Success12710;
                }
                term = term12646;
              }
              Success12711:
              { 
                if(cons602 == Main._consBuildDefault_1)
                { 
                  Fail23956:
                  { 
                    if(true)
                      break Success12711;
                  }
                  term = term12646;
                }
                if(cons602 == Main._consBuildDefaultPT_1)
                { }
                else
                { 
                  break Fail23951;
                }
              }
            }
          }
        }
      }
      if(true)
        return term;
    }
    return null;
  }
}