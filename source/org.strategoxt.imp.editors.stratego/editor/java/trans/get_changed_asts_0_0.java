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

@SuppressWarnings("all") public class get_changed_asts_0_0 extends Strategy 
{ 
  public static get_changed_asts_0_0 instance = new get_changed_asts_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("get_changed_asts_0_0");
    Fail22857:
    { 
      IStrategoTerm term12213 = term;
      Success12179:
      { 
        Fail22858:
        { 
          IStrategoTerm k_4742 = null;
          IStrategoTerm l_4742 = null;
          IStrategoTerm o_4742 = null;
          if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
            break Fail22858;
          k_4742 = term.getSubterm(0);
          l_4742 = term.getSubterm(1);
          term = topdown_1_0.instance.invoke(context, k_4742, strip_annos_0_0.instance);
          if(term == null)
            break Fail22858;
          o_4742 = term;
          term = topdown_1_0.instance.invoke(context, l_4742, strip_annos_0_0.instance);
          if(term == null)
            break Fail22858;
          term = termFactory.makeTuple(o_4742, term);
          term = zip_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail22858;
          term = filter_1_0.instance.invoke(context, term, lifted6792.instance);
          if(term == null)
            break Fail22858;
          if(true)
            break Success12179;
        }
        term = term12213;
        IStrategoTerm h_4742 = null;
        IStrategoTerm i_4742 = null;
        if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
          break Fail22857;
        h_4742 = term.getSubterm(0);
        i_4742 = term.getSubterm(1);
        term = h_4742;
        IStrategoTerm term12215 = term;
        Success12180:
        { 
          Fail22859:
          { 
            term = is_list_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail22859;
            { 
              if(true)
                break Fail22857;
              if(true)
                break Success12180;
            }
          }
          term = term12215;
        }
        term = i_4742;
        IStrategoTerm term12216 = term;
        Success12181:
        { 
          Fail22860:
          { 
            term = is_list_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail22860;
            { 
              if(true)
                break Fail22857;
              if(true)
                break Success12181;
            }
          }
          term = term12216;
        }
        term = termFactory.makeTuple((IStrategoTerm)termFactory.makeListCons(h_4742, (IStrategoList)trans.constNil4), (IStrategoTerm)termFactory.makeListCons(i_4742, (IStrategoList)trans.constNil4));
        term = this.invoke(context, term);
        if(term == null)
          break Fail22857;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}