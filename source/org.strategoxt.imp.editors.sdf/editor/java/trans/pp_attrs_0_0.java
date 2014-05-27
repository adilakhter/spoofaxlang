package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.strc.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.stratego_sdf.*;
import org.strategoxt.java_front.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class pp_attrs_0_0 extends Strategy 
{ 
  public static pp_attrs_0_0 instance = new pp_attrs_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("pp_attrs_0_0");
    Fail75762:
    { 
      IStrategoTerm term41512 = term;
      IStrategoConstructor cons1776 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success41498:
      { 
        if(cons1776 == Main._consno_attrs_0)
        { 
          Fail75763:
          { 
            term = trans.const15485;
            if(true)
              break Success41498;
          }
          term = term41512;
        }
        if(cons1776 == Main._consattrs_1)
        { 
          IStrategoTerm q_92030 = null;
          IStrategoTerm s_92030 = null;
          q_92030 = term.getSubterm(0);
          term = remove_all_1_0.instance.invoke(context, q_92030, lifted21524.instance);
          if(term == null)
            break Fail75762;
          term = map_1_0.instance.invoke(context, term, pp_attr_0_0.instance);
          if(term == null)
            break Fail75762;
          s_92030 = term;
          term = separate_by_0_1.instance.invoke(context, s_92030, trans.const15486);
          if(term == null)
            break Fail75762;
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail75762;
          IStrategoTerm term41513 = term;
          Success41499:
          { 
            Fail75764:
            { 
              if(term.getTermType() != IStrategoTerm.STRING || !"".equals(((IStrategoString)term).stringValue()))
                break Fail75764;
              if(true)
                break Success41499;
            }
            term = term41513;
            term = (IStrategoTerm)termFactory.makeListCons(trans.const15488, termFactory.makeListCons(term, (IStrategoList)trans.constCons7209));
            term = concat_strings_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail75762;
          }
        }
        else
        { 
          break Fail75762;
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