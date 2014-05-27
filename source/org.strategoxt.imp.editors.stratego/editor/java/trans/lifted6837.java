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

@SuppressWarnings("all") final class lifted6837 extends Strategy 
{ 
  public static final lifted6837 instance = new lifted6837();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail24071:
    { 
      IStrategoTerm term12340 = term;
      IStrategoConstructor cons608 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success12757:
      { 
        if(cons608 == Main._consFromTerm_1)
        { 
          Fail24072:
          { 
            if(true)
              break Success12757;
          }
          term = term12340;
        }
        Success12758:
        { 
          if(cons608 == Main._consFromMetaExpr_1)
          { 
            Fail24073:
            { 
              if(true)
                break Success12758;
            }
            term = term12340;
          }
          Success12759:
          { 
            if(cons608 == Main._consFromBuild_1)
            { 
              Fail24074:
              { 
                if(true)
                  break Success12759;
              }
              term = term12340;
            }
            Success12760:
            { 
              if(cons608 == Main._consFromMetaListExpr_1)
              { 
                Fail24075:
                { 
                  if(true)
                    break Success12760;
                }
                term = term12340;
              }
              Success12761:
              { 
                if(cons608 == Main._consFromStrategy_1)
                { 
                  Fail24076:
                  { 
                    if(true)
                      break Success12761;
                  }
                  term = term12340;
                }
                Success12762:
                { 
                  if(cons608 == Main._consmeta_var_1)
                  { 
                    Fail24077:
                    { 
                      IStrategoTerm y_4763 = null;
                      y_4763 = term.getSubterm(0);
                      term = termFactory.makeAppl(Main._consVar_1, new IStrategoTerm[]{y_4763});
                      if(true)
                        break Success12762;
                    }
                    term = term12340;
                  }
                  if(cons608 == Main._consmeta_listvar_1)
                  { 
                    IStrategoTerm z_4763 = null;
                    z_4763 = term.getSubterm(0);
                    term = termFactory.makeAppl(Main._consVar_1, new IStrategoTerm[]{z_4763});
                  }
                  else
                  { 
                    break Fail24071;
                  }
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