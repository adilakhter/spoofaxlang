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

@SuppressWarnings("all") public class inline_refactoring_0_0 extends Strategy 
{ 
  public static inline_refactoring_0_0 instance = new inline_refactoring_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("inline_refactoring_0_0");
    Fail22771:
    { 
      IStrategoTerm term12153 = term;
      Success12152:
      { 
        Fail22772:
        { 
          IStrategoTerm r_4724 = null;
          IStrategoTerm s_4724 = null;
          IStrategoTerm t_4724 = null;
          IStrategoTerm u_4724 = null;
          if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 6)
            break Fail22772;
          r_4724 = term.getSubterm(1);
          u_4724 = term.getSubterm(3);
          term = termFactory.makeTuple(r_4724, u_4724);
          IStrategoTerm term12154 = term;
          Success12153:
          { 
            Fail22773:
            { 
              IStrategoTerm x_4724 = null;
              if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
                break Fail22773;
              x_4724 = term.getSubterm(0);
              term = x_4724;
              if(term.getTermType() != IStrategoTerm.APPL || Main._consSDefT_4 != ((IStrategoAppl)term).getConstructor())
                break Fail22773;
              if(true)
                break Success12153;
            }
            term = declaration_of_call_0_0.instance.invoke(context, term12154);
            if(term == null)
              break Fail22772;
          }
          t_4724 = term;
          IStrategoTerm term12155 = term;
          Success12154:
          { 
            Fail22774:
            { 
              term = errors_recursion_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail22774;
              { 
                if(true)
                  break Fail22772;
                if(true)
                  break Success12154;
              }
            }
            term = term12155;
          }
          term = termFactory.makeTuple(t_4724, u_4724);
          term = warnings_multiple_declarations_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail22772;
          s_4724 = term;
          term = termFactory.makeTuple(t_4724, u_4724);
          term = inline_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail22772;
          term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeTuple(u_4724, term), (IStrategoList)trans.constNil4);
          term = termFactory.makeTuple(term, trans.constNil4, trans.constNil4, s_4724);
          if(true)
            break Success12152;
        }
        term = term12153;
        IStrategoTerm term12156 = term;
        Success12155:
        { 
          Fail22775:
          { 
            IStrategoTerm k_4724 = null;
            IStrategoTerm l_4724 = null;
            if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 6)
              break Fail22775;
            k_4724 = term.getSubterm(1);
            l_4724 = term.getSubterm(3);
            term = termFactory.makeTuple(k_4724, l_4724);
            IStrategoTerm term12157 = term;
            Success12156:
            { 
              Fail22776:
              { 
                IStrategoTerm term12158 = term;
                Success12157:
                { 
                  Fail22777:
                  { 
                    IStrategoTerm n_4724 = null;
                    if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
                      break Fail22777;
                    n_4724 = term.getSubterm(0);
                    term = n_4724;
                    if(term.getTermType() != IStrategoTerm.APPL || Main._consSDefT_4 != ((IStrategoAppl)term).getConstructor())
                      break Fail22777;
                    if(true)
                      break Success12157;
                  }
                  term = declaration_of_call_0_0.instance.invoke(context, term12158);
                  if(term == null)
                    break Fail22776;
                }
                { 
                  if(true)
                    break Fail22775;
                  if(true)
                    break Success12156;
                }
              }
              term = term12157;
            }
            term = trans.const4455;
            if(true)
              break Success12155;
          }
          term = term12156;
          IStrategoTerm b_4724 = null;
          IStrategoTerm c_4724 = null;
          if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 6)
            break Fail22771;
          b_4724 = term.getSubterm(1);
          c_4724 = term.getSubterm(3);
          term = termFactory.makeTuple(b_4724, c_4724);
          IStrategoTerm term12159 = term;
          Success12158:
          { 
            Fail22778:
            { 
              IStrategoTerm g_4724 = null;
              if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
                break Fail22778;
              g_4724 = term.getSubterm(0);
              term = g_4724;
              if(term.getTermType() != IStrategoTerm.APPL || Main._consSDefT_4 != ((IStrategoAppl)term).getConstructor())
                break Fail22778;
              if(true)
                break Success12158;
            }
            term = declaration_of_call_0_0.instance.invoke(context, term12159);
            if(term == null)
              break Fail22771;
          }
          term = errors_recursion_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail22771;
          term = termFactory.makeTuple(trans.constNil4, term, trans.constNil4, trans.constNil4);
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