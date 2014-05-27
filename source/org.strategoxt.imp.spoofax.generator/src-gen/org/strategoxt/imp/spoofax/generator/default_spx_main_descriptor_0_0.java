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

@SuppressWarnings("all") public class default_spx_main_descriptor_0_0 extends Strategy 
{ 
  public static default_spx_main_descriptor_0_0 instance = new default_spx_main_descriptor_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("default_spx_main_descriptor_0_0");
    Fail26127:
    { 
      IStrategoTerm u_4304 = null;
      IStrategoTerm v_4304 = null;
      IStrategoTerm w_4304 = null;
      IStrategoTerm b_4305 = null;
      IStrategoTerm d_4305 = null;
      IStrategoTerm e_4305 = null;
      IStrategoTerm q_4305 = null;
      IStrategoTerm v_4305 = null;
      term = get_sdf_main_module_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26127;
      u_4304 = term;
      term = u_4304;
      IStrategoTerm term10517 = term;
      Success10438:
      { 
        Fail26128:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26128;
          if(true)
            break Success10438;
        }
        term = term10517;
        IStrategoTerm term10518 = term;
        Success10439:
        { 
          Fail26129:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26129;
            if(true)
              break Success10439;
          }
          term = term10518;
          IStrategoTerm term10519 = term;
          Success10440:
          { 
            Fail26130:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail26130;
              if(true)
                break Success10440;
            }
            term = term10519;
            IStrategoTerm term10520 = term;
            Success10441:
            { 
              Fail26131:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26131;
                if(true)
                  break Success10441;
              }
              term = term10520;
              IStrategoTerm x_4304 = null;
              IStrategoTerm y_4304 = null;
              IStrategoTerm a_4305 = null;
              x_4304 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail26127;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail26127;
              y_4304 = ((IStrategoList)term).tail();
              a_4305 = y_4304;
              term = report_failure_0_2.instance.invoke(context, a_4305, generator.const7263, x_4304);
              if(term == null)
                break Fail26127;
            }
          }
        }
      }
      d_4305 = term;
      b_4305 = generator.const7143;
      e_4305 = d_4305;
      term = string_replace_0_2.instance.invoke(context, e_4305, b_4305, generator.const7143);
      if(term == null)
        break Fail26127;
      term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)generator.constCons4692);
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26127;
      term = termFactory.annotateTerm(term, checkListAnnos(termFactory, generator.constNil7));
      IStrategoTerm term10521 = term;
      Success10442:
      { 
        Fail26132:
        { 
          term = $Base$Package_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26132;
          if(true)
            break Success10442;
        }
        term = default_package_name_0_0.instance.invoke(context, term10521);
        if(term == null)
          break Fail26127;
      }
      q_4305 = term;
      term = require_option_1_1.instance.invoke(context, q_4305, $Editor$Extensions_0_0.instance, generator.const7253);
      if(term == null)
        break Fail26127;
      v_4304 = term;
      Success10443:
      { 
        Fail26133:
        { 
          term = $Start$Symbol_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26133;
          term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)generator.constNil7);
          if(true)
            break Success10443;
        }
        term = generator.constNil7;
      }
      w_4304 = term;
      term = main_descriptor_name_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26127;
      v_4305 = term;
      term = termFactory.makeTuple(generator.const7265, u_4304, generator.const7266);
      term = conc_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26127;
      term = termFactory.makeAppl(SpoofaxGenerator._consModule_3, new IStrategoTerm[]{v_4305, generator.constNoImports0, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(SpoofaxGenerator._consLanguage_2, new IStrategoTerm[]{generator.const7260, (IStrategoTerm)termFactory.makeListCons(generator.constEmptyLine0, termFactory.makeListCons(termFactory.makeAppl(SpoofaxGenerator._consLanguageName_1, new IStrategoTerm[]{u_4304}), termFactory.makeListCons(generator.constExtends0, termFactory.makeListCons(generator.constEmptyLine0, termFactory.makeListCons(termFactory.makeAppl(SpoofaxGenerator._consDescription_1, new IStrategoTerm[]{term}), termFactory.makeListCons(generator.constURL0, termFactory.makeListCons(generator.constEmptyLine0, termFactory.makeListCons(termFactory.makeAppl(SpoofaxGenerator._consExtensions_1, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consValues_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(v_4304, (IStrategoList)generator.constNil7)})}), termFactory.makeListCons(termFactory.makeAppl(SpoofaxGenerator._consStartSymbols_1, new IStrategoTerm[]{w_4304}), (IStrategoList)generator.constNil7)))))))))}), (IStrategoList)generator.constNil7)});
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}