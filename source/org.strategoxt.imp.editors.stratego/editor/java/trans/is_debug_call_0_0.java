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

@SuppressWarnings("all") public class is_debug_call_0_0 extends Strategy 
{ 
  public static is_debug_call_0_0 instance = new is_debug_call_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("is_debug_call_0_0");
    Fail21253:
    { 
      IStrategoTerm term11423 = term;
      IStrategoConstructor cons540 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success11422:
      { 
        if(cons540 == Main._consWhere_1)
        { 
          Fail21254:
          { 
            IStrategoTerm z_4164 = null;
            IStrategoTerm a_4165 = null;
            z_4164 = term;
            IStrategoTerm arg7495 = term.getSubterm(0);
            if(arg7495.getTermType() != IStrategoTerm.APPL || Main._consBA_2 != ((IStrategoAppl)arg7495).getConstructor())
              break Fail21254;
            a_4165 = arg7495.getSubterm(0);
            IStrategoTerm arg7496 = arg7495.getSubterm(1);
            if(arg7496.getTermType() != IStrategoTerm.APPL || Main._consVar_1 != ((IStrategoAppl)arg7496).getConstructor())
              break Fail21254;
            term = this.invoke(context, a_4165);
            if(term == null)
              break Fail21254;
            term = z_4164;
            if(true)
              break Success11422;
          }
          term = term11423;
        }
        Success11423:
        { 
          if(cons540 == Main._consWhere_1)
          { 
            Fail21255:
            { 
              IStrategoTerm x_4164 = null;
              IStrategoTerm y_4164 = null;
              x_4164 = term;
              IStrategoTerm arg7498 = term.getSubterm(0);
              if(arg7498.getTermType() != IStrategoTerm.APPL || Main._consBA_2 != ((IStrategoAppl)arg7498).getConstructor())
                break Fail21255;
              y_4164 = arg7498.getSubterm(0);
              IStrategoTerm arg7499 = arg7498.getSubterm(1);
              if(arg7499.getTermType() != IStrategoTerm.APPL || Main._consNoAnnoList_1 != ((IStrategoAppl)arg7499).getConstructor())
                break Fail21255;
              term = this.invoke(context, y_4164);
              if(term == null)
                break Fail21255;
              term = x_4164;
              if(true)
                break Success11423;
            }
            term = term11423;
          }
          Success11424:
          { 
            if(cons540 == Main._consWith_1)
            { 
              Fail21256:
              { 
                IStrategoTerm v_4164 = null;
                IStrategoTerm w_4164 = null;
                v_4164 = term;
                IStrategoTerm arg7501 = term.getSubterm(0);
                if(arg7501.getTermType() != IStrategoTerm.APPL || Main._consBA_2 != ((IStrategoAppl)arg7501).getConstructor())
                  break Fail21256;
                w_4164 = arg7501.getSubterm(0);
                IStrategoTerm arg7502 = arg7501.getSubterm(1);
                if(arg7502.getTermType() != IStrategoTerm.APPL || Main._consVar_1 != ((IStrategoAppl)arg7502).getConstructor())
                  break Fail21256;
                term = this.invoke(context, w_4164);
                if(term == null)
                  break Fail21256;
                term = v_4164;
                if(true)
                  break Success11424;
              }
              term = term11423;
            }
            Success11425:
            { 
              if(cons540 == Main._consWith_1)
              { 
                Fail21257:
                { 
                  IStrategoTerm t_4164 = null;
                  IStrategoTerm u_4164 = null;
                  t_4164 = term;
                  IStrategoTerm arg7504 = term.getSubterm(0);
                  if(arg7504.getTermType() != IStrategoTerm.APPL || Main._consBA_2 != ((IStrategoAppl)arg7504).getConstructor())
                    break Fail21257;
                  u_4164 = arg7504.getSubterm(0);
                  IStrategoTerm arg7505 = arg7504.getSubterm(1);
                  if(arg7505.getTermType() != IStrategoTerm.APPL || Main._consNoAnnoList_1 != ((IStrategoAppl)arg7505).getConstructor())
                    break Fail21257;
                  term = this.invoke(context, u_4164);
                  if(term == null)
                    break Fail21257;
                  term = t_4164;
                  if(true)
                    break Success11425;
                }
                term = term11423;
              }
              Success11426:
              { 
                if(cons540 == Main._consCallT_3)
                { 
                  Fail21258:
                  { 
                    IStrategoTerm arg7507 = term.getSubterm(0);
                    if(arg7507.getTermType() != IStrategoTerm.APPL || Main._consSVar_1 != ((IStrategoAppl)arg7507).getConstructor())
                      break Fail21258;
                    IStrategoTerm arg7508 = arg7507.getSubterm(0);
                    if(arg7508.getTermType() != IStrategoTerm.STRING || !"debug".equals(((IStrategoString)arg7508).stringValue()))
                      break Fail21258;
                    IStrategoList annos660 = arg7508.getAnnotations();
                    if(annos660.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos660).isEmpty())
                      break Fail21258;
                    IStrategoTerm arg7510 = ((IStrategoList)annos660).tail();
                    if(arg7510.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg7510).isEmpty())
                      break Fail21258;
                    IStrategoTerm arg7512 = term.getSubterm(2);
                    if(arg7512.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg7512).isEmpty())
                      break Fail21258;
                    if(true)
                      break Success11426;
                  }
                  term = term11423;
                }
                Success11427:
                { 
                  if(cons540 == Main._consWhere_1)
                  { 
                    Fail21259:
                    { 
                      IStrategoTerm arg7513 = term.getSubterm(0);
                      if(arg7513.getTermType() != IStrategoTerm.APPL || Main._consCallT_3 != ((IStrategoAppl)arg7513).getConstructor())
                        break Fail21259;
                      IStrategoTerm arg7514 = arg7513.getSubterm(0);
                      if(arg7514.getTermType() != IStrategoTerm.APPL || Main._consSVar_1 != ((IStrategoAppl)arg7514).getConstructor())
                        break Fail21259;
                      IStrategoTerm arg7515 = arg7514.getSubterm(0);
                      if(arg7515.getTermType() != IStrategoTerm.STRING || !"debug".equals(((IStrategoString)arg7515).stringValue()))
                        break Fail21259;
                      IStrategoList annos661 = arg7515.getAnnotations();
                      if(annos661.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos661).isEmpty())
                        break Fail21259;
                      IStrategoTerm arg7517 = ((IStrategoList)annos661).tail();
                      if(arg7517.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg7517).isEmpty())
                        break Fail21259;
                      IStrategoTerm arg7519 = arg7513.getSubterm(2);
                      if(arg7519.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg7519).isEmpty())
                        break Fail21259;
                      if(true)
                        break Success11427;
                    }
                    term = term11423;
                  }
                  if(cons540 == Main._consWith_1)
                  { 
                    IStrategoTerm arg7520 = term.getSubterm(0);
                    if(arg7520.getTermType() != IStrategoTerm.APPL || Main._consCallT_3 != ((IStrategoAppl)arg7520).getConstructor())
                      break Fail21253;
                    IStrategoTerm arg7521 = arg7520.getSubterm(0);
                    if(arg7521.getTermType() != IStrategoTerm.APPL || Main._consSVar_1 != ((IStrategoAppl)arg7521).getConstructor())
                      break Fail21253;
                    IStrategoTerm arg7522 = arg7521.getSubterm(0);
                    if(arg7522.getTermType() != IStrategoTerm.STRING || !"debug".equals(((IStrategoString)arg7522).stringValue()))
                      break Fail21253;
                    IStrategoList annos662 = arg7522.getAnnotations();
                    if(annos662.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos662).isEmpty())
                      break Fail21253;
                    IStrategoTerm arg7524 = ((IStrategoList)annos662).tail();
                    if(arg7524.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg7524).isEmpty())
                      break Fail21253;
                    IStrategoTerm arg7526 = arg7520.getSubterm(2);
                    if(arg7526.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg7526).isEmpty())
                      break Fail21253;
                  }
                  else
                  { 
                    break Fail21253;
                  }
                }
              }
            }
          }
        }
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}