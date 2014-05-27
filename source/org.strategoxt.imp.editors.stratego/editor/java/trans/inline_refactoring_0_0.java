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
    Fail21295:
    { 
      IStrategoTerm term11444 = term;
      Success11443:
      { 
        Fail21296:
        { 
          IStrategoTerm z_4170 = null;
          IStrategoTerm a_4171 = null;
          IStrategoTerm b_4171 = null;
          IStrategoTerm c_4171 = null;
          if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 6)
            break Fail21296;
          z_4170 = term.getSubterm(1);
          c_4171 = term.getSubterm(3);
          term = termFactory.makeTuple(z_4170, c_4171);
          IStrategoTerm term11445 = term;
          Success11444:
          { 
            Fail21297:
            { 
              IStrategoTerm f_4171 = null;
              if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
                break Fail21297;
              f_4171 = term.getSubterm(0);
              term = f_4171;
              if(term.getTermType() != IStrategoTerm.APPL || Main._consSDefT_4 != ((IStrategoAppl)term).getConstructor())
                break Fail21297;
              if(true)
                break Success11444;
            }
            term = declaration_of_call_0_0.instance.invoke(context, term11445);
            if(term == null)
              break Fail21296;
          }
          b_4171 = term;
          IStrategoTerm term11446 = term;
          Success11445:
          { 
            Fail21298:
            { 
              term = errors_recursion_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail21298;
              { 
                if(true)
                  break Fail21296;
                if(true)
                  break Success11445;
              }
            }
            term = term11446;
          }
          term = termFactory.makeTuple(b_4171, c_4171);
          term = warnings_multiple_declarations_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail21296;
          a_4171 = term;
          term = termFactory.makeTuple(b_4171, c_4171);
          term = inline_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail21296;
          term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeTuple(c_4171, term), (IStrategoList)trans.constNil3);
          term = termFactory.makeTuple(term, trans.constNil3, trans.constNil3, a_4171);
          if(true)
            break Success11443;
        }
        term = term11444;
        IStrategoTerm term11447 = term;
        Success11446:
        { 
          Fail21299:
          { 
            IStrategoTerm s_4170 = null;
            IStrategoTerm t_4170 = null;
            if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 6)
              break Fail21299;
            s_4170 = term.getSubterm(1);
            t_4170 = term.getSubterm(3);
            term = termFactory.makeTuple(s_4170, t_4170);
            IStrategoTerm term11448 = term;
            Success11447:
            { 
              Fail21300:
              { 
                IStrategoTerm term11449 = term;
                Success11448:
                { 
                  Fail21301:
                  { 
                    IStrategoTerm v_4170 = null;
                    if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
                      break Fail21301;
                    v_4170 = term.getSubterm(0);
                    term = v_4170;
                    if(term.getTermType() != IStrategoTerm.APPL || Main._consSDefT_4 != ((IStrategoAppl)term).getConstructor())
                      break Fail21301;
                    if(true)
                      break Success11448;
                  }
                  term = declaration_of_call_0_0.instance.invoke(context, term11449);
                  if(term == null)
                    break Fail21300;
                }
                { 
                  if(true)
                    break Fail21299;
                  if(true)
                    break Success11447;
                }
              }
              term = term11448;
            }
            term = trans.const4245;
            if(true)
              break Success11446;
          }
          term = term11447;
          IStrategoTerm j_4170 = null;
          IStrategoTerm k_4170 = null;
          if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 6)
            break Fail21295;
          j_4170 = term.getSubterm(1);
          k_4170 = term.getSubterm(3);
          term = termFactory.makeTuple(j_4170, k_4170);
          IStrategoTerm term11450 = term;
          Success11449:
          { 
            Fail21302:
            { 
              IStrategoTerm o_4170 = null;
              if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
                break Fail21302;
              o_4170 = term.getSubterm(0);
              term = o_4170;
              if(term.getTermType() != IStrategoTerm.APPL || Main._consSDefT_4 != ((IStrategoAppl)term).getConstructor())
                break Fail21302;
              if(true)
                break Success11449;
            }
            term = declaration_of_call_0_0.instance.invoke(context, term11450);
            if(term == null)
              break Fail21295;
          }
          term = errors_recursion_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail21295;
          term = termFactory.makeTuple(trans.constNil3, term, trans.constNil3, trans.constNil3);
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