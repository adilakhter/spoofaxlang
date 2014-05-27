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

@SuppressWarnings("all") final class lifted6937 extends Strategy 
{ 
  public static final lifted6937 instance = new lifted6937();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail23961:
    { 
      IStrategoTerm term12638 = term;
      IStrategoConstructor cons604 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success12714:
      { 
        if(cons604 == Main._consRootApp_1)
        { 
          Fail23962:
          { 
            if(true)
              break Success12714;
          }
          term = term12638;
        }
        Success12715:
        { 
          if(cons604 == Main._consApp_2)
          { 
            Fail23963:
            { 
              if(true)
                break Success12715;
            }
            term = term12638;
          }
          IStrategoTerm term12640 = term;
          Success12716:
          { 
            Fail23964:
            { 
              term = $Wld_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail23964;
              if(true)
                break Success12716;
            }
            term = term12640;
            IStrategoTerm term12641 = term;
            IStrategoConstructor cons605 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
            Success12717:
            { 
              if(cons605 == Main._consAs_2)
              { 
                Fail23965:
                { 
                  if(true)
                    break Success12717;
                }
                term = term12641;
              }
              Success12718:
              { 
                if(cons605 == Main._consBuildDefault_1)
                { 
                  Fail23966:
                  { 
                    if(true)
                      break Success12718;
                  }
                  term = term12641;
                }
                if(cons605 == Main._consBuildDefaultPT_1)
                { }
                else
                { 
                  break Fail23961;
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