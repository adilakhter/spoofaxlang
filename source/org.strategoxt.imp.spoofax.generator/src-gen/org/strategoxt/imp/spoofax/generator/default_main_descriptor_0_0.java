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

@SuppressWarnings("all") public class default_main_descriptor_0_0 extends Strategy 
{ 
  public static default_main_descriptor_0_0 instance = new default_main_descriptor_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("default_main_descriptor_0_0");
    Fail26124:
    { 
      IStrategoTerm h_4303 = null;
      IStrategoTerm i_4303 = null;
      IStrategoTerm j_4303 = null;
      IStrategoTerm k_4303 = null;
      IStrategoTerm l_4303 = null;
      IStrategoTerm t_4303 = null;
      IStrategoTerm a_4304 = null;
      IStrategoTerm b_4304 = null;
      IStrategoTerm c_4304 = null;
      IStrategoTerm d_4304 = null;
      IStrategoTerm e_4304 = null;
      IStrategoTerm f_4304 = null;
      IStrategoTerm g_4304 = null;
      IStrategoTerm h_4304 = null;
      term = get_sdf_main_module_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26124;
      i_4303 = term;
      IStrategoTerm term10515 = term;
      Success10436:
      { 
        Fail26125:
        { 
          term = $Base$Package_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26125;
          if(true)
            break Success10436;
        }
        term = default_package_name_0_0.instance.invoke(context, term10515);
        if(term == null)
          break Fail26124;
      }
      h_4303 = term;
      t_4303 = term;
      term = require_option_1_1.instance.invoke(context, t_4303, $Editor$Extensions_0_0.instance, generator.const7253);
      if(term == null)
        break Fail26124;
      j_4303 = term;
      term = parse_table_target_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26124;
      k_4303 = term;
      Success10437:
      { 
        Fail26126:
        { 
          term = $Start$Symbol_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26126;
          term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)generator.constNil7);
          if(true)
            break Success10437;
        }
        term = generator.constNil7;
      }
      l_4303 = term;
      term = main_descriptor_name_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26124;
      a_4304 = term;
      term = descriptor_name_0_0.instance.invoke(context, generator.const7254);
      if(term == null)
        break Fail26124;
      b_4304 = term;
      term = descriptor_name_0_0.instance.invoke(context, generator.const7255);
      if(term == null)
        break Fail26124;
      c_4304 = term;
      term = descriptor_name_0_0.instance.invoke(context, generator.const7256);
      if(term == null)
        break Fail26124;
      d_4304 = term;
      term = descriptor_name_0_0.instance.invoke(context, generator.const7257);
      if(term == null)
        break Fail26124;
      e_4304 = term;
      term = descriptor_name_0_0.instance.invoke(context, generator.const7232);
      if(term == null)
        break Fail26124;
      f_4304 = term;
      term = descriptor_name_0_0.instance.invoke(context, generator.const7226);
      if(term == null)
        break Fail26124;
      g_4304 = term;
      term = descriptor_name_0_0.instance.invoke(context, generator.const7170);
      if(term == null)
        break Fail26124;
      h_4304 = term;
      term = termFactory.makeTuple(generator.const7258, i_4303, generator.const7259);
      term = conc_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26124;
      term = termFactory.makeAppl(SpoofaxGenerator._consModule_3, new IStrategoTerm[]{a_4304, termFactory.makeAppl(SpoofaxGenerator._consImports_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(SpoofaxGenerator._consImport_1, new IStrategoTerm[]{b_4304}), termFactory.makeListCons(termFactory.makeAppl(SpoofaxGenerator._consImport_1, new IStrategoTerm[]{c_4304}), termFactory.makeListCons(termFactory.makeAppl(SpoofaxGenerator._consImport_1, new IStrategoTerm[]{d_4304}), termFactory.makeListCons(termFactory.makeAppl(SpoofaxGenerator._consImport_1, new IStrategoTerm[]{e_4304}), termFactory.makeListCons(termFactory.makeAppl(SpoofaxGenerator._consImport_1, new IStrategoTerm[]{f_4304}), termFactory.makeListCons(termFactory.makeAppl(SpoofaxGenerator._consImport_1, new IStrategoTerm[]{g_4304}), termFactory.makeListCons(termFactory.makeAppl(SpoofaxGenerator._consImport_1, new IStrategoTerm[]{h_4304}), (IStrategoList)generator.constNil7)))))))}), (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(SpoofaxGenerator._consLanguage_2, new IStrategoTerm[]{generator.const7260, (IStrategoTerm)termFactory.makeListCons(generator.constEmptyLine0, termFactory.makeListCons(termFactory.makeAppl(SpoofaxGenerator._consLanguageName_1, new IStrategoTerm[]{i_4303}), termFactory.makeListCons(termFactory.makeAppl(SpoofaxGenerator._consLanguageId_1, new IStrategoTerm[]{h_4303}), termFactory.makeListCons(generator.constExtends0, termFactory.makeListCons(generator.constEmptyLine0, termFactory.makeListCons(termFactory.makeAppl(SpoofaxGenerator._consDescription_1, new IStrategoTerm[]{term}), termFactory.makeListCons(generator.constURL0, termFactory.makeListCons(generator.constEmptyLine0, termFactory.makeListCons(termFactory.makeAppl(SpoofaxGenerator._consExtensions_1, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consValues_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(j_4303, (IStrategoList)generator.constNil7)})}), termFactory.makeListCons(termFactory.makeAppl(SpoofaxGenerator._consTable_1, new IStrategoTerm[]{k_4303}), termFactory.makeListCons(termFactory.makeAppl(SpoofaxGenerator._consStartSymbols_1, new IStrategoTerm[]{l_4303}), (IStrategoList)generator.constNil7)))))))))))}), (IStrategoList)generator.constNil7)});
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}