package org.strategoxt.imp.spoofax.generator;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.stratego_rtg.*;
import org.strategoxt.stratego_sdf.*;
import org.strategoxt.stratego_tool_doc.*;
import org.strategoxt.java_front.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class report_module_not_found_0_0 extends Strategy 
{ 
  public static report_module_not_found_0_0 instance = new report_module_not_found_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("report_module_not_found_0_0");
    Fail25464:
    { 
      IStrategoTerm n_4221 = null;
      IStrategoTerm o_4221 = null;
      IStrategoTerm term10046 = term;
      IStrategoConstructor cons328 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success10040:
      { 
        if(cons328 == SpoofaxGenerator._consIncludeFromPath_1)
        { 
          Fail25465:
          { 
            IStrategoTerm z_4683 = null;
            z_4683 = term.getSubterm(0);
            term = z_4683;
            if(true)
              break Success10040;
          }
          term = term10046;
        }
        if(cons328 == SpoofaxGenerator._consIncludePathName_1)
        { 
          IStrategoTerm a_4684 = null;
          a_4684 = term.getSubterm(0);
          term = a_4684;
        }
        else
        { 
          break Fail25464;
        }
      }
      n_4221 = term;
      term = termFactory.makeTuple(generator.conststderr0, (IStrategoTerm)termFactory.makeListCons(generator.const6991, termFactory.makeListCons(term, (IStrategoList)generator.constCons4542)));
      term = fprintnl_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail25464;
      term = bagof_$Imported$From_0_0.instance.invoke(context, n_4221);
      if(term == null)
        break Fail25464;
      IStrategoTerm term10047 = term;
      Success10041:
      { 
        Fail25466:
        { 
          IStrategoTerm p_4221 = null;
          p_4221 = term;
          if(term.getTermType() != IStrategoTerm.LIST || !((IStrategoList)term).isEmpty())
            break Fail25466;
          term = p_4221;
          if(true)
            break Success10041;
        }
        term = term10047;
        IStrategoTerm term10048 = term;
        Success10042:
        { 
          Fail25467:
          { 
            IStrategoTerm q_4221 = null;
            q_4221 = term;
            if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
              break Fail25467;
            o_4221 = ((IStrategoList)term).head();
            IStrategoTerm arg5853 = ((IStrategoList)term).tail();
            if(arg5853.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg5853).isEmpty())
              break Fail25467;
            term = q_4221;
            { 
              term = o_4221;
              Success10043:
              { 
                Fail25468:
                { 
                  term = get_source_pathname_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail25468;
                  if(true)
                    break Success10043;
                }
                term = generator.const6992;
              }
              term = termFactory.makeTuple(generator.conststderr0, (IStrategoTerm)termFactory.makeListCons(generator.const6994, termFactory.makeListCons(o_4221, termFactory.makeListCons(generator.const6993, termFactory.makeListCons(term, (IStrategoList)generator.constNil7)))));
              term = fprintnl_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail25464;
              if(true)
                break Success10042;
            }
          }
          term = term10048;
          IStrategoTerm r_4221 = null;
          r_4221 = term;
          term = fprintnl_0_0.instance.invoke(context, generator.const6999);
          if(term == null)
            break Fail25464;
          term = map_1_0.instance.invoke(context, r_4221, lifted9018.instance);
          if(term == null)
            break Fail25464;
        }
      }
      term = fprintnl_0_0.instance.invoke(context, generator.const7001);
      if(term == null)
        break Fail25464;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}